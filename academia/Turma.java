/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.academia;

/**
 *
 * @author matheus
 */
public class Turma {
    private String descricao;
    private Aluno[] alunos;
   
    public Turma() {
        
        alunos = new Aluno[10];
        descricao = " ";
    }
   
    //public void getAlunos
   
    public String getDescricao() {
        return descricao;
    }
   
    public Aluno[] getAlunos() {
        return alunos;
    }
   
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
   
    public void setAlunos (Aluno[] alunos) {
        this.alunos = alunos;
    }
   
    public boolean adicionarAlunos(Aluno aluno) {
    
        for (int i = 0; i < alunos.length; i ++) {
            if (alunos[i] == null) {
                alunos[i] = aluno;
                return true;
            }
        }
        return false;
    }
   
    public void exibirTurmaAlunos() {
       
        for (int i = 0; i < alunos.length; i++) {
            
            if (alunos[i] != null) {
                
                System.out.println("Nome: " + alunos[i].getNome());
                System.out.println("Idade: " + alunos[i].getIdade() + " anos");
                System.out.println("Sexo: " + alunos[i].getSexo());
                System.out.println("Peso: " + alunos[i].getPeso() + " Kg");
                System.out.println("Altura: " + alunos[i].getAltura() + " m");
                System.out.println("Telefone de contato: " + alunos[i].getTelContato());

                System.out.println("");
            }
        }
        
    }
 
}