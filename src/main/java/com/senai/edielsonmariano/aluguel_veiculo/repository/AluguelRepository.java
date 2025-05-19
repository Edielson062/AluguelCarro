package com.senai.edielsonmariano.aluguel_veiculo.repository;

import com.senai.edielsonmariano.aluguel_veiculo.entity.Aluguel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface AluguelRepository extends JpaRepository<Aluguel, Integer> {
    @Query("SELECT a FROM Aluguel a JOIN a.idCliente c WHERE c.id = :idCliente")
    List<Aluguel> findByCliente(@Param("idCliente") Integer idCliente);

    @Query("SELECT a FROM Aluguel a JOIN a.idVeiculo c WHERE c.id = :idVeiculo")
    List<Aluguel> findByVeiculo(@Param("idVeiculo") Integer idVeiculo);
}
