package com.senai.edielsonmariano.aluguel_veiculo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nome",nullable = false,length = 100)
    private String nome;

    @Column(name = "cpf",nullable = false,length = 11)
    private String cpf;

    @OneToMany
    @JsonIgnore
    private List<Aluguel> aluguels;

    public Cliente() {
    }

    public Cliente(int id, String cpf, String nome) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Aluguel> getAluguels() {
        return aluguels;
    }

    public void setAluguels(List<Aluguel> aluguels) {
        this.aluguels = aluguels;
    }
}
