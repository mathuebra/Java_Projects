package com.example.bancoimobiliariomatheusleticia;

public class CartaPropriedade extends CartaPosse {

    private int numeroCasas;
    private int aluguel;

    public CartaPropriedade(String nome, String descricao, int precoCompra, int aluguel) {
        super(nome, descricao, precoCompra);
        this.aluguel = aluguel;
        numeroCasas = 0;
    }

    public void aumentaCasa() {
        numeroCasas ++;
    }

    @Override
    public int calculaValorAPagar(int dado){
        if (numeroCasas == 1) return 10 * aluguel;
        else if (numeroCasas == 2) return 30 * aluguel;
        else if (numeroCasas == 3) return 50 * aluguel;
        else if (numeroCasas == 4) return 100 * aluguel;
        return aluguel;
    }
}