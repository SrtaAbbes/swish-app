package br.edu.ifg.luziania.model.entity;

import jakarta.persistence.*;
@Entity
@Table
public class ProprietarioQuadra {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
}
