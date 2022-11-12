/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.academia;

/**
 *
 * @author aluno
 */

import java.util.Scanner;

public class Academia {
 
    public static void main(String[] args) {
       
    Scanner entrada = new Scanner (System.in);
    Aluno instancia;

    Turma[] turmas;
   
    turmas = new Turma[6];
    
        turmas[0] = new Turma();
        turmas[0].setDescricao("Manhã Feminino");

        turmas[1] = new Turma();
        turmas[1].setDescricao("Tarde Feminino");

        turmas[2] = new Turma();
        turmas[2].setDescricao("Noite Feminino");

        turmas[3] = new Turma();
        turmas[3].setDescricao("Manhã Masculino");

        turmas[4] = new Turma();
        turmas[4].setDescricao("Tarde Masculino");

        turmas[5] = new Turma();
        turmas[5].setDescricao("Noite Masculino");
    
    do {
        
        instancia = new Aluno();
       
        System.out.println("Insira o nome do aluno");
        instancia.setNome(entrada.next());
        
        System.out.println("Insira o sexo do aluno (M ou F)");
        instancia.setSexo(entrada.next());
        
        System.out.println("Insira a idade do aluno");
        instancia.setIdade((entrada.nextInt()));
        
        System.out.println("Insira o peso do aluno");
        instancia.setPeso(entrada.nextDouble());
        
        System.out.println("Insira a altura do aluno");
        instancia.setAltura(entrada.nextDouble());
        
        System.out.println("Insira telefone para contato:");
        //Posso tentar implementar um scanner de leitura de espaços!
        instancia.setTelContato(entrada.next());
        
        System.out.println("Para encerrar o cadastro digite 0, caso deseje continuar digite outro número");
        
        if (instancia.getSexo().equals("Feminino") || instancia.getSexo().equals("feminino") || instancia.getSexo().equals("F")) {
            
            instancia.setSexo("Feminino");
            
            if (instancia.getIdade() >= 9 && instancia.getIdade() <= 12) {
                turmas[0].adicionarAlunos(instancia);
            }
            
            if (instancia.getIdade() >= 13 && instancia.getIdade() <= 18) {
                turmas[1].adicionarAlunos(instancia);
            }
            
            if (instancia.getIdade() >= 19 && instancia.getIdade() <= 30) {
                turmas[2].adicionarAlunos(instancia);
            }
        }
        
        if (instancia.getSexo().equals("Masculino") || instancia.getSexo().equals("masculino") || instancia.getSexo().equals("M")) {
            
            instancia.setSexo("Masculino");
            
            if (instancia.getIdade() >= 9 && instancia.getIdade() <= 12) {
                turmas[3].adicionarAlunos(instancia);
            }
            
            if (instancia.getIdade() >= 13 && instancia.getIdade() <= 18) {
                turmas[4].adicionarAlunos(instancia);
            }
            
            if (instancia.getIdade() >= 19 && instancia.getIdade() <= 30) {
                turmas[5].adicionarAlunos(instancia);
            }
        }
          
    } while (entrada.nextInt() != 0);
    
    
    for (int i = 0; i < turmas.length; i ++) {
        if (turmas[i] != null) {
            
            System.out.println("Turma " + turmas[i].getDescricao() + ":");
            System.out.println("");
            turmas[i].exibirTurmaAlunos();
        }
    }
    
    
    }
}