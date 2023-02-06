package com.example.bancoimobiliariomatheusleticia;

import java.util.ArrayList;

public class Jogador {

    private int posicao;
    private ArrayList<Carta> cartas;
    private int quantidadeDinheiro;

    public Jogador(){
        posicao = 0;
        cartas = new ArrayList<>();
        quantidadeDinheiro = 2000;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public int getPosicao() {
        return this.posicao;
    }

    public void setQuantidadeDinheiro(int dinheiro){
        this.quantidadeDinheiro = dinheiro;
    }
    public int getQuantidadeDinheiro(){
        return this.quantidadeDinheiro;
    }

    public void mudaPosicao(int numeroDado){
        posicao = posicao + numeroDado;
    }


    //esse metodo vai ser chamado se o jogador parou em uma casa de posse e escolheu comprar a casa
    //esse metodo apenas compra a casa
    //a verificacao de disponibilidade e de escolha do jogador serao realizadas antes de chamar esse metodo e por outro metodo.
    public void compraDePosse(CartaPosse posse){
        quantidadeDinheiro = quantidadeDinheiro - posse.getPrecoCompra();
        cartas.add(posse);
    }

    public void transfereDinheiroEvento(int dinheiro){
        quantidadeDinheiro = quantidadeDinheiro + dinheiro;
    }

    /*public void pagaParaOutroJogador(Jogador jogador, int qntDinheiroParaPagar){
        this.quantidadeDinheiro = this.quantidadeDinheiro - qntDinheiroParaPagar;
        jogador.quantidadeDinheiro = jogador.quantidadeDinheiro + qntDinheiroParaPagar;
    }*/

    public void moveJogador (int dado) {
        if ((posicao + dado) > 23) {
            posicao += dado;
            posicao -= 23;
        }
        else posicao += dado;
    }


}
