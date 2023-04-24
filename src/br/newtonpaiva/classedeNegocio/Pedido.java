package br.newtonpaiva.classedeNegocio;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    Ingresso ingr = new Ingresso();
    Cliente cli = new Cliente();
    List<String> cl = new ArrayList<String>();
    public Double total;

    public void calcule(){
       Double ih = ingr.getValor();
       Integer ihh = ingr.getQtd();
       total = ih * ihh;

    }

    public void cliente(){
        cl.add(cli.getNome());
    }

    public Cliente getCli() {
        return cli;
    }
}
