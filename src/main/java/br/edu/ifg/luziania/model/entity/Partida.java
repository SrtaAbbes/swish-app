package br.edu.ifg.luziania.model.entity;

import java.util.Date;

public class Partida {
    private int id;
    private String Jogador;
    private String time01;
    private String time02;
    private int pontuacaoTime01;
    private int pontuacaoTime02;
    private int timeVencedor;
    private Time duracao;

    public Partida(int id, String jogador, String time01, String time02, int pontuacaoTime01, int pontuacaoTime02, int timeVencedor, Time duracao) {
        this.id = id;
        Jogador = jogador;
        this.time01 = time01;
        this.time02 = time02;
        this.pontuacaoTime01 = pontuacaoTime01;
        this.pontuacaoTime02 = pontuacaoTime02;
        this.timeVencedor = timeVencedor;
        this.duracao = duracao;
    }

    public int getId() {
        return id;
    }


    public String getJogador() {
        return Jogador;
    }

    public void setJogador(String jogador) {
        Jogador = jogador;
    }

    public String getTime01() {
        return time01;
    }

    public void setTime01(String time01) {
        this.time01 = time01;
    }

    public String getTime02() {
        return time02;
    }

    public void setTime02(String time02) {
        this.time02 = time02;
    }

    public int getPontuacaoTime01() {
        return pontuacaoTime01;
    }

    public void setPontuacaoTime01(int pontuacaoTime01) {
        this.pontuacaoTime01 = pontuacaoTime01;
    }

    public int getPontuacaoTime02() {
        return pontuacaoTime02;
    }

    public void setPontuacaoTime02(int pontuacaoTime02) {
        this.pontuacaoTime02 = pontuacaoTime02;
    }

    public int getTimeVencedor() {
        return timeVencedor;
    }

    public void setTimeVencedor(int timeVencedor) {
        this.timeVencedor = timeVencedor;
    }

    public Time getDuracao() {
        return duracao;
    }

    public void setDuracao(Time duracao) {
        this.duracao = duracao;
    }



}