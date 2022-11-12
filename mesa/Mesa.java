/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mesa;

import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class Mesa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int qntCartas;
        Carta maior1, maior2;
        
        System.out.println("Digite a quantidade de cartas a serem distribuídas aos jogadores:");
        qntCartas = entrada.nextInt();
        
    Jogador A = new Jogador(qntCartas);
    Jogador B = new Jogador(qntCartas);
    
    Baralho deck = new Baralho();
    
    deck.embaralhar();
    
    A.setHand(deck.distribuirCartas(qntCartas));
        
    deck.embaralhar();
    
    B.setHand(deck.distribuirCartas(qntCartas));
    
    System.out.println("\nAmbos os jogadores recebem " + qntCartas + " cartas\n");
    
    maior1 = A.maiorCarta(); //Armazena o resultado da maior carta em uma carta vazia anteriormente
    maior2 = B.maiorCarta();
    
    System.out.println("\nO jogador A joga "+ maior1.getValor() + " de " + maior1.getNaipe() + "\n");
    System.out.println("\nO jogador B joga "+ maior2.getValor() + " de " + maior2.getNaipe() + "\n");
    
    if (maior1.comparaValorCarta(maior2) == 1) {
        
        System.out.println("O jogador A ganhou!");
    }
    
    if (maior1.comparaValorCarta(maior2) == -1) {
        
        System.out.println("O jogador B ganhou!");
    }
        
    for (; maior1.comparaValorCarta(maior2) == 0;) {
        
        System.out.println("O jogo empatou, vamos ver os naipes!");
        
        if (maior1.getNaipe().equals("Ouros")) {
            
            System.out.println("O jogador A venceu!");
            break;
        }
        
        if (maior2.getNaipe().equals("Ouros")) { 
            
            System.out.println("O jogador B venceu!");
        }
        
        System.out.println("Deu empate! Vamos embaralhar e tentar novamente!");
        
        deck.embaralhar();
        
        A.setHand(deck.distribuirCartas(qntCartas));
        B.setHand(deck.distribuirCartas(qntCartas));
        
        maior1 = A.maiorCarta();
        maior2 = B.maiorCarta();
        
        System.out.println("\nO jogador A joga "+ maior1.getValor() + " de " + maior1.getNaipe() + "\n");
        System.out.println("\nO jogador B joga "+ maior2.getValor() + " de " + maior2.getNaipe() + "\n");
    
        if (maior1.comparaValorCarta(maior2) == 1) {
        
        System.out.println("O jogador A ganhou!");
        }
    
        if (maior1.comparaValorCarta(maior2) == -1) {
        
        System.out.println("O jogador B ganhou!");
        }
    }
        
           
    }
}
