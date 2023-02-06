package com.example.bancoimobiliariomatheusleticia;

public abstract class CartaPosse extends Carta{

    protected int precoCompra;
    protected boolean disponivel;

    public CartaPosse(String nome, String descricao, int precoCompra) {
        super(nome, descricao);
        this.precoCompra = precoCompra;
        disponivel = true;
    }
    public void posseFoiComprada(){
        this.disponivel = false;
    }
    public boolean getDisponibilidade(){
        return disponivel;
    }

    public void setPrecoCompra(int preco) {
        this.precoCompra = preco;
    }

    public int getPrecoCompra() {
        return this.precoCompra;
    }
    public void setDisponibilidade(boolean disponivel){
        this.disponivel = disponivel;
    }
    public int calculaValorAPagar(int dado){
        return 0;
    }

}