package com.trabalhoSO.TrabalhoDocker.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tarefa {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    private String titulo;

    private String descricao;

    private String status;
}
