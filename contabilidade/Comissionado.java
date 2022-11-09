/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabilidade;

/**
 *
 * @author mathuebra
 */
public class Comissionado extends Empregado {
    
    protected double valorVendas;

    public Comissionado(String nome, String sobrenome, int numIdent) {
        super(nome, sobrenome, numIdent);
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    @Override
    public double getValorAPagar(int diaPagto, int mesPagto) {       
        return valorVendas * 1.06;
    }
    
}
