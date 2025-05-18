package com.senai.edielsonmariano.aluguel_veiculo.repository;

import com.senai.edielsonmariano.aluguel_veiculo.entity.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<Veiculo, Integer> {
}
