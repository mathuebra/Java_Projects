/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastropacientes;

/**
 *
 * @author mathuebra
 */
public class Paciente {
    
    private int codigo;
    private int idade;
    private String nome;
    private String genero;
    private double peso;
    private double altura;

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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Paciente(int codigo, int idade, String nome, String genero, double peso, double altura) {
        this.codigo = codigo;
        this.idade = idade;
        this.nome = nome;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }
    
    public Paciente() {
        this.codigo = 0;
        this.idade= 0;
        this.nome = "";
        this.genero = "";
        this.peso = 0.0;
        this.altura= 0.0;
    }
}
