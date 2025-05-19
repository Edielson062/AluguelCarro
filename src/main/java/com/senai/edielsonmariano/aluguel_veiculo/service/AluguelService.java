package com.senai.edielsonmariano.aluguel_veiculo.service;

import com.senai.edielsonmariano.aluguel_veiculo.entity.Aluguel;
import com.senai.edielsonmariano.aluguel_veiculo.entity.Veiculo;
import com.senai.edielsonmariano.aluguel_veiculo.repository.AluguelRepository;
import com.senai.edielsonmariano.aluguel_veiculo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;

@Service
public class AluguelService {
    @Autowired
    private AluguelRepository aluguelRepository;
    @Autowired
    private VeiculoRepository veiculoRepository;

    public List<Aluguel> listarAlugues() {
        return aluguelRepository.findAll();
    }

    public Aluguel buscarAluguel(int id) {
        return aluguelRepository.findById(id).orElseThrow(() -> new RuntimeException("Veiculo não encontrado com o ID: " + id));
    }

    public List<Aluguel> buscarAluguelPorCliente(int id) {
        return aluguelRepository.findByCliente(id);
    }

    public List<Aluguel> buscarAluguelPorVeiculo(int id) {
        return aluguelRepository.findByVeiculo(id);
    }

    public Aluguel adcionarAluguel(Aluguel aluguel) {
        Veiculo veiculo = veiculoRepository.findById(aluguel.getIdVeiculo().getId())
                .orElseThrow(() -> new RuntimeException("Veículo não encontrado."));
        if (!veiculo.getStatus()) {
            throw new IllegalStateException("Veículo está indisponível.");
        }
        veiculo.setStatus(false);
        veiculoRepository.save(veiculo);
        return aluguelRepository.save(aluguel);
    }

    public Aluguel editarAluguel(Aluguel aluguel) {
        return aluguelRepository.save(aluguel);
    }

    public void removerAluguel(int id) {
        aluguelRepository.deleteById(id);
    }
}
