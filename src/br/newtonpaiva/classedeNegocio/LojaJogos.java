package br.newtonpaiva.classedeNegocio;

import javax.swing.*;

public class LojaJogos {
    public static void main(String[] args) {

        adquirirIngresso();
        String pergOutroJogo = JOptionPane.showInputDialog(null, "Deseja ingresso de outro jogo?");

        if(pergOutroJogo == "sim"){
            adquirirIngresso();
        }
        else{
            System.out.println("Pedido Finalizado");
        }

    }

    public static void adquirirIngresso(){
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
        //ped.cliente();

        if (qtdBilhete > 1){
            int i;

            for (i = 0; i< qtdBilhete; i++){
                String nomeUsuario1 = JOptionPane.showInputDialog(null, "Informe o nome");
                //Double valorJogo1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do ingresso"));
                cl.nome = nomeUsuario;
                //ped.cliente();
            }
        }

        for(int i = 0; i<cl.cl.size(); i++){
        }
        System.out.println("Pedido feito para: " + cl.cl + ", " + ingrss.getQtd() + " Ingressos: " + ingrss.getJogo() + ".");
    }
}
