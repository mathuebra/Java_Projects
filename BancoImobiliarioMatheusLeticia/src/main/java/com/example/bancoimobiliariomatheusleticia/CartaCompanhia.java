package com.example.bancoimobiliariomatheusleticia;

public class CartaCompanhia extends CartaPosse{

    private int taxaMultiplicativa;

    public CartaCompanhia(String nome, String descricao, int precoCompra, int taxaMultiplicativa) {
        super(nome, descricao, precoCompra);
        this.taxaMultiplicativa = taxaMultiplicativa;
    }

    @Override
    public int calculaValorAPagar(int dado){
        return dado * taxaMultiplicativa;
    }
}