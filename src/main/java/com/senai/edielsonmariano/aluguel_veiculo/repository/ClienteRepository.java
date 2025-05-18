package com.senai.edielsonmariano.aluguel_veiculo.repository;

import com.senai.edielsonmariano.aluguel_veiculo.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
