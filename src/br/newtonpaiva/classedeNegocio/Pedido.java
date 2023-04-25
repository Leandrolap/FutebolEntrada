package br.newtonpaiva.classedeNegocio;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    Ingresso ingr = new Ingresso();
    public Double total;

    public void calcule(){
        try {
            Double ih = ingr.valor;
            Integer ihh = ingr.qtd;
            total = ih * ihh;

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
