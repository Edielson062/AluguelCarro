package com.senai.edielsonmariano.aluguel_veiculo.controller;

import com.senai.edielsonmariano.aluguel_veiculo.entity.Cliente;
import com.senai.edielsonmariano.aluguel_veiculo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cliente")
@CrossOrigin("*")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> listar() {
        return clienteService.listarClientes();
    }

    @GetMapping("/{id}")
    public Cliente buscar(@PathVariable int id) {
        return clienteService.buscarCliente(id);
    }

    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente) {
        return clienteService.adcionarCliente(cliente);
    }

    @PutMapping
    public Cliente atualizar(@RequestBody Cliente cliente) {
        return clienteService.editarCliente(cliente);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable int id) {
        clienteService.removerCliente(id);
    }
}
