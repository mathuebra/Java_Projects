/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastropacientes;

/**
 *
 * @author matheus
 */
public class Paciente {
    
    private int codigo;
    private int idade;
    private String nome;
    private String genero;
    private double altura;
    private double peso;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Paciente(){
        this.codigo = 0;
        this.idade = 0;
        this.nome = "";
        this.genero = "";
        this.altura = 0;
        this.peso = 0;
    
    }

    public Paciente(int codigo, int idade, String nome, String genero, double altura, double peso) {
        this.codigo = codigo;
        this.idade = idade;
        this.nome = nome;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
    }
    
    
    
}
