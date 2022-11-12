/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.academia;

/**
 *
 * @author matheus
 */
public class Aluno {
    
    //Início de campo
    private String nome;
    private String sexo;
    private int idade;
    private double peso;
    private double altura;
    private String telContato;
    //Fim de campo
   
    public String getNome() {
        return nome;
    }
   
    public String getSexo() {
        return sexo;
    }
   
    public int getIdade() {
        return idade;
    }
   
    public double getPeso() {
        return peso;
    }
   
    public double getAltura() {
        return altura;
    }
   
    public String getTelContato() {
        return telContato;
    }
   
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setTelContato(String telContato) {
        this.telContato = telContato;
    }
   
    public Aluno() {
       
        this.nome = " ";
        this.sexo = " ";
        this.idade = 0;
        this.peso = 0.0;
        this.altura = 0.0;
        this.telContato = " ";
    }
}
