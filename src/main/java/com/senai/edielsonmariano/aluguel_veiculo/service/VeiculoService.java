package com.senai.edielsonmariano.aluguel_veiculo.service;

import com.senai.edielsonmariano.aluguel_veiculo.entity.Veiculo;
import com.senai.edielsonmariano.aluguel_veiculo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {
    @Autowired
    private VeiculoRepository veiculoRepository;

    public List<Veiculo> listarVeiculos() {
        return veiculoRepository.findAll();
    }

    public Veiculo buscarVeiculo(int id) {
        return veiculoRepository.findById(id).orElseThrow(() -> new RuntimeException("Veiculo não encontrado com o ID: " + id));
    }

    public Veiculo adcionarVeiculo(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    public Veiculo editarVeiculo(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    public void removerVeiculo(int id) {
        veiculoRepository.deleteById(id);
    }
}
