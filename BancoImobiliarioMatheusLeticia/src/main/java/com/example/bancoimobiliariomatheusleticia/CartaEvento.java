package com.example.bancoimobiliariomatheusleticia;

public class CartaEvento extends Carta{

    private boolean sorte;
    private int preco;

    public CartaEvento(String nome, String descricao, boolean sorte, int preco) {
        super(nome, descricao);
        this.sorte = sorte;
        this.preco = preco;
    }

    public boolean getSorte() {
        return sorte;
    }

    public void setSorte(boolean sorte) {
        this.sorte = sorte;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}
