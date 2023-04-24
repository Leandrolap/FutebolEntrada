package br.newtonpaiva.classedeNegocio;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    Ingresso ingr = new Ingresso();
    Cliente cli = new Cliente();

    List<Cliente> cl = new ArrayList<Cliente>();
    List<Ingresso> ingressos = new ArrayList<>();

    public void calcule(){
       Double ih = ingr.getValor();
       Integer ihh = ingr.getQtd();
       Double total = ih * ihh;
    }
}
