package br.edu.ifg.luziania.model.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "jogador_fila")
public class JogadorFila {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "usuario_id",referencedColumnName = "id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "quadra_id", referencedColumnName = "id")
    private Quadra quadra;

}
