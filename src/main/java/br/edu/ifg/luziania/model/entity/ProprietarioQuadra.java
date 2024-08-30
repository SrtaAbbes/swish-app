package br.edu.ifg.luziania.model.entity;

import jakarta.persistence.*;
@Entity
@Table
public class ProprietarioQuadra {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "proprietario_id",referencedColumnName = "id")
    private Usuario proprietario;

    @OneToOne
    @JoinColumn(name = "quadra_id", referencedColumnName = "id")
    private Quadra quadra;
    public ProprietarioQuadra() {}
    public ProprietarioQuadra(Usuario proprietario, Quadra quadra) {
        this.proprietario = proprietario;
        this.quadra = quadra;
    }

    public Integer getId() {
        return id;
    }

    public Usuario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Usuario proprietario) {
        this.proprietario = proprietario;
    }

    public Quadra getQuadra() {
        return quadra;
    }

    public void setQuadra(Quadra quadra) {
        this.quadra = quadra;
    }
}
