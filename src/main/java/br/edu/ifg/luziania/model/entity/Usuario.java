package br.edu.ifg.luziania.model.entity;

import jakarta.persistence.*;
@Entity
@Table
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column
    private String nome;
    @Column(nullable = false, unique = true)
    private String email;
    @Column
    private String senha;

    @OneToOne(mappedBy = "usuario")
    private JogadorFila jogadorFila;

    //@OneToOne(mappedBy = "perfil")
    //private Perfil perfil;

    public Usuario() {
    }



    public Integer getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
