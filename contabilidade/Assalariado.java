/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabilidade;

/**
 *
 * @author mathuebra
 */
public class Assalariado extends Empregado {
    
    private double horasExtras;

    public Assalariado(String nome, String sobrenome, int numIdent) {
        super(nome, sobrenome, numIdent);
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    @Override
    public double getValorAPagar(int diaPagto, int mesPagto) {
        return Passivo.SALARIO + (Passivo.HORA * horasExtras);
    }
    
}
