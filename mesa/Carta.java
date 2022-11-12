/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mesa;

/**
 *
 * @author aluno
 */
public class Carta {
    
    int valor;
    String naipe;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }
    
    public Carta() {
        
        this.valor = 0;
        this.naipe = " ";
        
    }
    
    public Carta(int value, String nipe) {
        
        this.valor = value;
        this.naipe = nipe;
        
    }
    
    public int comparaValorCarta (Carta entity) {
        
        if (this.valor < entity.getValor()) {
            return -1;
        }
        if (this.valor > entity.getValor()) {
            return 1;
        }
        return 0;
    }
    
    public boolean comparaNaipeCarta (Carta entity) {
        
        if (this.naipe.equals(entity.getNaipe())) return true;
        /*else*/
        return false;
    }
    
}
