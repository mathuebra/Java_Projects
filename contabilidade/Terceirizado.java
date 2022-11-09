/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabilidade;

/**
 *
 * @author mathuebra
 */
public class Terceirizado extends Empregado {
    
    private double horasTrabalhadas;

    public Terceirizado (String nome, String sobrenome, int numIdent) {
        
        super(nome, sobrenome, numIdent);
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double getValorAPagar(int diaPagto, int mesPagto) {       
        return Passivo.HORA * horasTrabalhadas;
    }
    
}
