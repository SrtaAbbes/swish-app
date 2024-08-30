package br.edu.ifg.luziania.model.entity;

import jakarta.persistence.*;

@Entity
@Table
public class QuadraPartida {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "partida_id", referencedColumnName = "id")
    private Partida partida;

    @ManyToOne
    @JoinColumn(name = "quadra_id", referencedColumnName = "id")
    private Quadra quadra;

    public QuadraPartida() {
    }

    public QuadraPartida(Partida partida, Quadra quadra) {
        this.partida = partida;
        this.quadra = quadra;
    }

    public Integer getId() {
        return id;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public Quadra getQuadra() {
        return quadra;
    }

    public void setQuadra(Quadra quadra) {
        this.quadra = quadra;
    }
}
