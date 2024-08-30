package br.edu.ifg.luziania.model.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Quadra {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer codigo;

    @Column
    private String nome;

    @OneToOne(mappedBy = "quadra")
    private Usuario proprietario;

    @Column (nullable = false)
    private Boolean ativa;
    @OneToMany(mappedBy = "quadra")
    @Column(name = "jogador_fila_list")
    private List<JogadorFila> jogadorFilaList;

    @OneToMany(mappedBy = "quadra")
    @Column(name = "quadra_partida_list")
    private List<QuadraPartida> QuadraPartidaList;


    //Relembrar os conceitos de ED 1 para implementar a fila

    public Quadra() {
    }

    public Quadra(String nome, Usuario proprietario, Boolean ativa) {
        this.nome = nome;
        this.proprietario = proprietario;
        this.ativa = ativa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public List<JogadorFila> getJogadorFilaList() {
        return jogadorFilaList;
    }

    public void setJogadorFilaList(List<JogadorFila> jogadorFilaList) {
        this.jogadorFilaList = jogadorFilaList;
    }

    public Usuario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Usuario proprietario) {
        this.proprietario = proprietario;
    }

    public Boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }

    public List<QuadraPartida> getQuadraPartidaList() {
        return QuadraPartidaList;
    }

    public void setQuadraPartidaList(List<QuadraPartida> quadraPartidaList) {
        QuadraPartidaList = quadraPartidaList;
    }
}
