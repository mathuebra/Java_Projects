/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabilidade;

/**
 *
 * @author mathuebra
 */
public class AssalariadoComissionado extends Comissionado {
    
    private double percentualBonus = 1.06;
    
    public AssalariadoComissionado(String nome, String sobrenome, int numIdent) {
        super(nome, sobrenome, numIdent);
    }

    @Override
    public double getValorVendas() {
        return valorVendas;
    }

    @Override
    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    } 

    @Override
    public double getValorAPagar(int diaPagto, int mesPagto) {
        return Passivo.SALARIO + (valorVendas * percentualBonus);
    }
    
    
    
}
