package com.senai.edielsonmariano.aluguel_veiculo.repository;

import com.senai.edielsonmariano.aluguel_veiculo.entity.Aluguel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AluguelRepository extends JpaRepository<Aluguel, Integer> {
}
