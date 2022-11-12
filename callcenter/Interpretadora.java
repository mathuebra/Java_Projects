/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.callcenter;

import java.util.HashSet;

/**
 *
 * @author matheus
 */
public class Interpretadora {
    
    private HashSet<String> palavrasChave;
    
    public Interpretadora() {
    
        palavrasChave = new HashSet<>();
    
    }
    
    public HashSet<String> interpretaProblema (String problem) {
        
        palavrasChave.clear();
        String[] palavras = problem.split(" ");
        
        for (int i = 0; i < palavras.length; i ++) {
            
            palavrasChave.add(palavras[i].toLowerCase());
        }
        
            return palavrasChave;
    }
    
}
