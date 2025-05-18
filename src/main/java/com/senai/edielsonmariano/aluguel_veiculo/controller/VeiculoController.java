package com.senai.edielsonmariano.aluguel_veiculo.controller;

import com.senai.edielsonmariano.aluguel_veiculo.entity.Veiculo;
import com.senai.edielsonmariano.aluguel_veiculo.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("veiculo")
@CrossOrigin("*")
public class VeiculoController {
    @Autowired
    private VeiculoService veiculoService;

    @GetMapping
    public List<Veiculo> listar() {
        return veiculoService.listarVeiculos();
    }

    @GetMapping("/{id}")
    public Veiculo buscar(@PathVariable int id) {
        return veiculoService.buscarVeiculo(id);
    }

    @PostMapping
    public Veiculo salvar(@RequestBody Veiculo veiculo) {
        return veiculoService.adcionarVeiculo(veiculo);
    }

    @PutMapping
    public Veiculo atualizar(@RequestBody Veiculo veiculo) {
        return veiculoService.editarVeiculo(veiculo);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable int id) {
        veiculoService.removerVeiculo(id);
    }
}
