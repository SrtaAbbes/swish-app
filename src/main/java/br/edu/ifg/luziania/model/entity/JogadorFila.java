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

    @Column
    private Integer posicao;



    public JogadorFila(){
    }
    public JogadorFila(Usuario usuario, Quadra quadra) {
        this.usuario = usuario;
        this.quadra = quadra;
    }

    public Integer getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Quadra getQuadra() {
        return quadra;
    }

    public void setQuadra(Quadra quadra) {
        this.quadra = quadra;
    }

    public Integer getPosicao() {
        return posicao;
    }

    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }
}
