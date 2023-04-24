package br.newtonpaiva.classedeNegocio;

public class Ingresso {
    Cliente cli;
    public String jogo;
    public Double valor;
    public Integer qtd;

    public String getJogo() {
        return jogo;
    }

    public void setJogo(String jogo) {
        this.jogo = jogo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }
}
