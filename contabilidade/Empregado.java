/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabilidade;

/**
 *
 * @author mathuebra
 */
public abstract class Empregado implements Passivo {
    
    protected String nome;
    protected String sobrenome;
    protected int numIdent;
    
    public Empregado (String nome, String sobrenome, int numIdent) {
        
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numIdent = numIdent;
    }

}
