package com.senai.edielsonmariano.aluguel_veiculo.controller;

import com.senai.edielsonmariano.aluguel_veiculo.entity.Aluguel;
import com.senai.edielsonmariano.aluguel_veiculo.service.AluguelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("aluguel")
@CrossOrigin("*")
public class AluguelController {
    @Autowired
    private AluguelService aluguelService;

    @GetMapping
    public List<Aluguel> listaAluguel() {
        return aluguelService.listarAlugues();
    }

    @GetMapping("/{id}")
    public Aluguel buscaAluguel(@PathVariable int id) {
        return aluguelService.buscarAluguel(id);
    }

    @GetMapping("/cliente/{id}")
    public List<Aluguel> buscaAluguelCliente(@PathVariable int id) {
        return aluguelService.buscarAluguelPorCliente(id);
    }

    @GetMapping("/veiculo/{id}")
    public List<Aluguel> buscaAluguelVeiculo(@PathVariable int id) {
        return aluguelService.buscarAluguelPorVeiculo(id);
    }

    @PostMapping
    public Aluguel cadastrarAluguel(@RequestBody Aluguel aluguel) {
        return aluguelService.adcionarAluguel(aluguel);
    }

    @PutMapping
    public Aluguel atualizarAluguel(@RequestBody Aluguel aluguel) {
        return aluguelService.editarAluguel(aluguel);
    }

    @DeleteMapping("/{id}")
    public void excluirAluguel(@PathVariable int id) {
        aluguelService.removerAluguel(id);
    }
}
