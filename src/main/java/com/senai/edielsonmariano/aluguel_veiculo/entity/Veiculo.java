package com.senai.edielsonmariano.aluguel_veiculo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.senai.edielsonmariano.aluguel_veiculo.enums.Veiculos;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "veiculo")
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "descricao", nullable = false, length = 50)
    private String descricao;

    @Column(name = "placa", nullable = false, length = 7)
    private String placa;

    @Column(name = "veiculo", nullable = false, length = 50)
    private Veiculos veiculos;

    @Column(name = "status", nullable = false)
    private Boolean status;

    public Veiculo() {
    }

    public Veiculo(String descricao, String placa, Boolean status, Veiculos veiculos, int id) {
        this.descricao = descricao;
        this.placa = placa;
        this.status = status;
        this.veiculos = veiculos;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Veiculos getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Veiculos veiculos) {
        this.veiculos = veiculos;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}
