/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.callcenter;

import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class CallCenter {

    public static void main(String[] args) {
        
    String hold = "bolinha123", queixa, mainProblem;
        
    Scanner entrada = new Scanner(System.in);
    
    SuporteTecnico st = new SuporteTecnico();
    Interpretadora inter = new Interpretadora();
    
    System.out.println("Bem vindo ao suporte técnico!");
    System.out.println("Digite 'continuar' para continuar, ou 'sair' para encerrar");
        
    hold = entrada.nextLine();
        
    while (hold.equals("continuar")) {
        
        System.out.println("Diga de forma sucinta o seu problema:");
        queixa = entrada.nextLine();
        
        if (st.buscaSolucoes(inter.interpretaProblema(queixa)) == null) 
            System.out.println(st.respostaAleatoria());
        
        else 
        System.out.println(st.buscaSolucoes(inter.interpretaProblema(queixa)));
        
        System.out.println("Digite 'continuar' para continuar, ou 'sair' para encerrar");
        
        hold = entrada.nextLine();
        
    }
        
    }
}
