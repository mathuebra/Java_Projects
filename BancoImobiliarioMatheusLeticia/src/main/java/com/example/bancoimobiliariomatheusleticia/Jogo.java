package com.example.bancoimobiliariomatheusleticia;

import java.util.ArrayList;
import java.util.Random;

public class Jogo {
    private Jogador jogador1 = new Jogador(); // fazer arraylist de jogador?
    private Jogador jogador2 = new Jogador();
    private ArrayList<Carta> tabuleiro = new ArrayList<>();
    private ArrayList<CartaPosse> cartasDePosse = new ArrayList<>();
    private ArrayList<CartaEvento> cartasDeEvento = new ArrayList<>();
    private int dado;
    private int jogada;
    private int posicaoTemporaria;



    public Jogo(){

        jogada = 1;
    }

    public void inicializaJogo() {

        tabuleiro.clear();
        jogador1.getCartas().clear();
        jogador2.getCartas().clear();

        jogador1.setPosicao(0);
        jogador2.setPosicao(0);

        jogador1.setQuantidadeDinheiro(2000);
        jogador2.setQuantidadeDinheiro(2000);

        //inicializa o tabuleiro
        tabuleiro.add(new CartaPropriedade ("Rua Dom Modesto Augusto", "Propriedade", 200, 16));
        tabuleiro.add(new CartaPropriedade ("Rua Coração Eucarístico", "Propriedade", 180, 14));
        tabuleiro.add(new CartaEvento ("Voce ganhou um carro", "Ganhe 200", true, 200));
        tabuleiro.add(new CartaCompanhia ("PUC", "Companhia", 250, 50));
        tabuleiro.add(new CartaEvento ("Voce bateu o seu carro", "Perca 50", false, -50));
        tabuleiro.add(new CartaPropriedade ("Rua Dom José Gaspar", "Propriedade", 180, 14));

        tabuleiro.add(new CartaPropriedade ("Avenida Amazonas", "Propriedade", 240, 20));
        tabuleiro.add(new CartaEvento ("Voce sofreu um acidente terrível", "Perca 100", false, -100));
        tabuleiro.add(new CartaPropriedade ("Avenida Bias Fortes", "Propriedade", 220, 18));
        tabuleiro.add(new CartaCompanhia ("CEMIG", "Companhia", 240, 45));
        tabuleiro.add(new CartaPropriedade ("Praça da Liberdade", "Propriedade", 280, 28));
        tabuleiro.add(new CartaEvento ("Voce ganhou na loteria", "Receba 300", true, 300));

        tabuleiro.add(new CartaPropriedade ("Rua Espírito Santo", "Propriedade", 240, 18));
        tabuleiro.add(new CartaEvento ("Voce recebeu uma herança perdida", "Receba 150", true, 150));
        tabuleiro.add(new CartaCompanhia ("CEFET", "Companhia", 1, 45));
        tabuleiro.add(new CartaEvento ("Seu filho ficou doente inesperadamente", "Perca 100", false, -100));
        tabuleiro.add(new CartaPropriedade ("Rua Rio de Janeiro", "Propriedade", 320, 30));
        tabuleiro.add(new CartaPropriedade ("Rua São Paulo", "Propriedade", 220, 17));

        tabuleiro.add(new CartaPropriedade ("Rua Jacuí", "Propriedade", 160, 12));
        tabuleiro.add(new CartaPropriedade ("Rua Contria", "Propriedade", 170, 13));
        tabuleiro.add(new CartaEvento ("Voce ganhou grandes dividendos", "Receba 100", true, 100));
        tabuleiro.add(new CartaEvento ("Voce perdeu no cassino", "Perca 50", false, -50));
        tabuleiro.add(new CartaCompanhia ("Vale", "Companhia", 250, 50));
        tabuleiro.add(new CartaPropriedade ("Rua Java", "Propriedade", 180, 14));


    }

    public ArrayList<Carta> getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(ArrayList<Carta> tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public int getPosicaoTemporaria() {
        return posicaoTemporaria;
    }

    public Jogador getJogador1(){
        return jogador1;
    }

    public Jogador getJogador2(){
        return jogador2;
    }

    public void setPosicaoTemporaria(int posicaoTemporaria) {
        this.posicaoTemporaria = posicaoTemporaria;
    }


    public int getDado(){
        return this.dado;
    }
    public int rodaDado () {
        Random geradorDado = new Random();
        dado = geradorDado.nextInt(6) + 1;
        return dado;
    }

    public int retornaDinheiroJogador1(){
        return jogador1.getQuantidadeDinheiro();
    }

    public int retornaDinheiroJogador2(){
        return jogador2.getQuantidadeDinheiro();
    }


    public void realizaCompra(){ //por enquanto so faz compra de propriedade, falta companhia
        if (jogada == 1){
            if (tabuleiro.get(jogador1.getPosicao()) instanceof  CartaPosse) {
                jogador1.compraDePosse((CartaPosse) tabuleiro.get(jogador1.getPosicao()));
                ((CartaPosse) tabuleiro.get(jogador1.getPosicao())).setDisponibilidade(false);
            }

        }
        if (jogada == 2){
            if (tabuleiro.get(jogador2.getPosicao()) instanceof  CartaPosse) {
                jogador2.compraDePosse((CartaPosse) tabuleiro.get(jogador2.getPosicao()));
                ((CartaPosse) tabuleiro.get(jogador2.getPosicao())).setDisponibilidade(false);
            }
        }
    }

    public void realizaEvento(){
        if (jogada == 1){
            jogador1.transfereDinheiroEvento(((CartaEvento)tabuleiro.get(jogador1.getPosicao())).getPreco());
        }
        if (jogada == 2){
            jogador2.transfereDinheiroEvento(((CartaEvento)tabuleiro.get(jogador2.getPosicao())).getPreco());
        }
    }

    public void finalizaJogada(int numeroJogador){
        jogada = numeroJogador;
    }

    public int getJogada(){
        return jogada;
    }

    public int fazJogada(){
        int retorno = 2;
        if(jogada == 1){
            jogador1.moveJogador(rodaDado());
            posicaoTemporaria = jogador1.getPosicao();
            if (tabuleiro.get(jogador1.getPosicao()) instanceof CartaPosse){
                if (((CartaPosse) tabuleiro.get(jogador1.getPosicao())).getDisponibilidade() == true){
                    retorno = 1;
                }
                else{
                    retorno = -1;
                }
            }
            else if (tabuleiro.get(jogador1.getPosicao()) instanceof CartaEvento){
                retorno = 0;
            }
        }
        if(jogada == 2){
            jogador2.moveJogador(rodaDado());
            posicaoTemporaria = jogador2.getPosicao();
            if (tabuleiro.get(jogador2.getPosicao()) instanceof CartaPosse){
                if (((CartaPosse) tabuleiro.get(jogador2.getPosicao())).getDisponibilidade() == true){
                    retorno = 1;
                }
                else{
                    retorno = -1;
                }
            }
            else if (tabuleiro.get(jogador2.getPosicao()) instanceof CartaEvento){
                retorno = 0;
            }
        }
        return retorno;
    }

    /*
    public boolean verificaCasa() {

        if (jogada == 1) {
            if (tabuleiro.get(jogador1.getPosicao()) instanceof CartaPosse){
                if (((CartaPosse) tabuleiro.get(jogador1.getPosicao())).getDisponibilidade()){

                }
            }
        }
    }
    */

    public boolean verificaPropriedadeJogador (CartaPosse propriedade) {

        if (jogada == 1) {
            for (int i = 0; i < jogador1.getCartas().size(); i ++) {
                if (propriedade == jogador1.getCartas().get(i)) {
                    return true;
                }
            }

            return false;
        }

        if (jogada == 2) {
            for (int i = 0; i < jogador2.getCartas().size(); i ++) {
                if (propriedade == jogador2.getCartas().get(i)) {
                    return true;
                }
            }

            return false;
        }

        return false;
    }

    public void constroiCasa() {
        if (jogada == 1) {
            for (int i = 0; i < jogador1.getCartas().size(); i ++) {
                if (tabuleiro.get(jogador1.getPosicao()) == jogador1.getCartas().get(i)) {
                    //Casting de variável
                    ((CartaPropriedade)jogador1.getCartas().get(i)).aumentaCasa();
                    jogador1.transfereDinheiroEvento(-200);
                }
            }
        }

        else if (jogada == 2) {
            for (int i = 0; i < jogador2.getCartas().size(); i ++) {
                if (tabuleiro.get(jogador2.getPosicao()) == jogador2.getCartas().get(i)) {
                    //Casting de variável
                    ((CartaPropriedade)jogador2.getCartas().get(i)).aumentaCasa();
                    jogador2.transfereDinheiroEvento(-200);
                }
            }
        }
    }

    public void transfereEntreJogadores (int dinheiro) {
        if (jogada == 1) {
            jogador1.transfereDinheiroEvento(-dinheiro);
            jogador2.transfereDinheiroEvento(dinheiro);
        }

        else if (jogada == 2) {
            jogador2.transfereDinheiroEvento(-dinheiro);
            jogador1.transfereDinheiroEvento(dinheiro);
        }
    }

    public int calculaTotalJogador (Jogador jogador) {
        int valorTotalJogador = 0;

        for (int i = 0; i < jogador.getCartas().size(); i ++) {
            valorTotalJogador += ((CartaPosse)jogador.getCartas().get(i)).getPrecoCompra();
        }
        valorTotalJogador += jogador.getQuantidadeDinheiro();

        return valorTotalJogador;
    }

    /*public int fazJogada() {

        int retorno = 2;

        if (jogada == 1) {
            //jogada = 2;
            jogador1.moveJogador(rodaDado());

            posicaoTemporaria = jogador1.getPosicao();

            if (tabuleiro.get(jogador1.getPosicao()) instanceof CartaPosse) {
                if (((CartaPosse) tabuleiro.get(jogador1.getPosicao())).getDisponibilidade() == true) return 1;
                else return -1;
            }

            else if (tabuleiro.get(jogador1.getPosicao()) instanceof CartaEvento) {
                return 0;
            }
        }

        if (jogada == 2) {
            //jogada = 1;
            jogador2.moveJogador(rodaDado());
            posicaoTemporaria = jogador2.getPosicao();
            if (tabuleiro.get(jogador2.getPosicao()) instanceof CartaPosse) {
                if (((CartaPosse) tabuleiro.get(jogador2.getPosicao())).getDisponibilidade() == true) return 1;
                else return -1;
            }
            else if (tabuleiro.get(jogador1.getPosicao()) instanceof CartaEvento) {
                return 0;
            }
        }
        return retorno;
    }*/


}
