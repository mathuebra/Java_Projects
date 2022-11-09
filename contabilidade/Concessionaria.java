/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabilidade;

/**
 *
 * @author mathuebra
 */
public class Concessionaria extends Conta {
    
    private double valorContas;
    private double valorImposto;

    public Concessionaria(int dia, int mes, double valor) {
        super(dia, mes, valor);
    }

    public double getValorContas() {
        return valorContas;
    }

    public void setValorContas(double valorContas) {
        this.valorContas = valorContas;
    }

    public double getValorImposto() {
        return valorImposto;
    }

    public void setValorImposto(double valorImposto) {
        this.valorImposto = valorImposto;
    }

    @Override
    public double getValorAPagar(int diaPagto, int mesPagto) {
        return valorContas + valorImposto;
    }
    
}
