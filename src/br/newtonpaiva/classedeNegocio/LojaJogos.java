package br.newtonpaiva.classedeNegocio;

import javax.swing.*;

public class LojaJogos {
    public static void main(String[] args) {
        Ingresso ingrss = new Ingresso();

        Cliente cl = new Cliente();

        Pedido ped = new Pedido();

        String nomeUsuario = JOptionPane.showInputDialog(null, "Informe o nome");
        String nomeJogo = JOptionPane.showInputDialog(null, "Informe a partida");
        Double valorJogo = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do ingresso"));
        Integer qtdBilhete = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de ingressos"));

        cl.setNome(nomeUsuario);
        ingrss.setJogo(nomeJogo);
        ingrss.setValor(valorJogo);
        ingrss.setQtd(qtdBilhete);
        ped.calcule();

        if (qtdBilhete > 1){
            int i;

            for (i = 0; i< qtdBilhete; i++){
                String nomeUsuario1 = JOptionPane.showInputDialog(null, "Informe o nome");
                Double valorJogo1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do ingresso"));
                ped.calcule();
            }
        }
    }
}
