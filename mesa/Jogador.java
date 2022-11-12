/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mesa;

/**
 *
 * @author aluno
 */
public class Jogador {
    
    private Carta[] hand;
    
    
    public Jogador (int quantidade) {    
        hand = new Carta[quantidade];
    }

    public Carta[] getHand() {
        return hand;
    }

    public void setHand(Carta[] hand) {
        this.hand = hand;
    }
    
    public Carta maiorCarta () {
        
        Carta aux;
        aux = hand[0];
        
        for (int i = 0; i < hand.length; i ++) {
            
            if (hand[i].getValor() > aux.getValor()) {
                
                aux = hand[i];
            }
        }
        
        return aux;
    }
}
