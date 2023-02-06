package com.example.bancoimobiliariomatheusleticia;

public abstract class Carta {
    private String descricao;
    private String nome;

    public Carta(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
