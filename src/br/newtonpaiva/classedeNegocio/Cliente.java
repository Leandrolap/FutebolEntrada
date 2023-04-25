package br.newtonpaiva.classedeNegocio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public String nome;

    public List<String> clienteList = new ArrayList<String>();

    public void cliente(){
        clienteList.add(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
