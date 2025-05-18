package com.senai.edielsonmariano.aluguel_veiculo.service;

import com.senai.edielsonmariano.aluguel_veiculo.entity.Cliente;
import com.senai.edielsonmariano.aluguel_veiculo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Cliente buscarCliente(int id) {
        return clienteRepository.findById(id).orElseThrow(() -> new RuntimeException("Cliente não encontrado com o ID: " + id));
    }

    public Cliente adcionarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente editarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void removerCliente(int id) {
        clienteRepository.deleteById(id);
    }
}
