/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mesa;

import java.security.SecureRandom;

/**
 *
 * @author aluno
 */
public class Baralho {
    
    private Carta[] baralho;
    private String[] naipes = {"Copas","Ouros","Paus","Espadas"};
    private SecureRandom generator = new SecureRandom();
    
    public Baralho() {
    
        baralho = new Carta[52];
        int auxCount = 0;
        
        for (int i = 0; i < naipes.length; i ++) {
            for (int j = 1; j < 14; j ++) {
                baralho[auxCount] = new Carta (j, naipes[i]);
                auxCount ++;
            }
        }
    }
    
    public void embaralhar () {
        int position;
        Carta holder;
        
        for(int j = 0; j < baralho.length; j ++) {
            for (int i = 0; i < baralho.length; i ++) {

                position = generator.nextInt(52);

                holder = baralho[position];
                baralho[position] = baralho[i];
                baralho[i] = holder;
            }
        }
        
    }
    
    public Carta[] distribuirCartas (int quantityCarta) {
        
        Carta[] holder = new Carta[quantityCarta];
        int position = 0;
        /*
        for (int i = 0; i < baralho.length; i ++) {
            
            do {
                if (baralho[i] != null) {
                    holder[position] = baralho[i];
                    position ++;
                }
            } while (position != (quantityCarta - 1));
        }*/
        
        for (int i = 0; position != quantityCarta; i ++) {
            
            if (baralho[i] != null) {
                holder[position] = baralho[i];
                position ++;
            }
        }
            return holder;
    }
}
