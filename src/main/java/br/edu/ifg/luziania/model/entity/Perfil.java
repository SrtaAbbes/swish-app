package br.edu.ifg.luziania.model.entity;

public class Perfil {
    private int codigoPerfil;
    private String nomePerfil;

    public Perfil(int codigo, String nome) {
        this.codigoPerfil = codigo;
        this.nomePerfil = nome;
    }

    public int getCodigo() {
        return codigoPerfil;
    }

    public void setCodigo(int codigo) {
        this.codigoPerfil = codigo;
    }

    public String getNome() {
        return nomePerfil;
    }

    public void setNome(String nome) {
        this.nomePerfil = nome;
    }
}
