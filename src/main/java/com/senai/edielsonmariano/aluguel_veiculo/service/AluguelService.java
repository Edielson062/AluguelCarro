package com.senai.edielsonmariano.aluguel_veiculo.service;

import com.senai.edielsonmariano.aluguel_veiculo.entity.Aluguel;
import com.senai.edielsonmariano.aluguel_veiculo.repository.AluguelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AluguelService {
    @Autowired
    private AluguelRepository aluguelRepository;

    public List<Aluguel> listarAlugues() {
        return aluguelRepository.findAll();
    }

    public Aluguel buscarAluguel(int id) {
        return aluguelRepository.findById(id).orElseThrow(() -> new RuntimeException("Veiculo não encontrado com o ID: " + id));
    }

    public Aluguel adcionarAluguel(Aluguel aluguel) {
        return aluguelRepository.save(aluguel);
    }

    public Aluguel editarAluguel(Aluguel aluguel) {
        return aluguelRepository.save(aluguel);
    }

    public void removerAluguel(int id) {
        aluguelRepository.deleteById(id);
    }
}
