/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabilidade;

/**
 *
 * @author mathuebra
 */
public abstract class Conta implements Passivo{
    
    protected int dia;
    protected int mes;
    protected double valor;
    
    public Conta (int dia, int mes, double valor) {
        
        this.dia = dia;
        this.mes = mes;
        this.valor = valor;
    }

}
