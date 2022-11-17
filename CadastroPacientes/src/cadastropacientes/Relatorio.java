/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastropacientes;

import java.util.ArrayList;

/**
 *
 * @author mathuebra
 */
public class Relatorio {
    
    ArrayList <Paciente> pacientes;
    
    public Relatorio () {
        
        pacientes = new ArrayList<Paciente>();
    }
    
    public void adicionarPaciente (Paciente paciente) {
        
        pacientes.add(paciente);
    }
    
    
    
    public int getRelatorioA (ArrayList<Paciente> pacientes) {
        return pacientes.size();
    }
    
    public double getRelatorioB (ArrayList<Paciente> pacientes) {
        double mediaIdade = 0;
        
        for (int i = 0; i < pacientes.size(); i ++) 
            mediaIdade += pacientes.get(i).getIdade();
        
        return mediaIdade/pacientes.size();
    }
    
    public double getRelatorioC (ArrayList<Paciente> pacientes) {
        int qntMulheres = 0;
        
        for (int i = 0; i < pacientes.size(); i ++) {
            if (pacientes.get(i).getGenero().equals("f")) {
                if (pacientes.get(i).getAltura() >= 1.60 && pacientes.get(i).getAltura() <= 1.70) {
                    if (pacientes.get(i).getPeso() > 70) 
                        qntMulheres ++;
                }
            }
        }
        
        return qntMulheres;
    }
    
    public int getRelatorioD (ArrayList<Paciente> pacientes) {
        int qntPacientes = 0;
        
        for (int i = 0; i < pacientes.size(); i ++) {
            if (pacientes.get(i).getIdade() >= 18 && pacientes.get(i).getIdade() <= 25)
                qntPacientes ++;
        }
        
        return qntPacientes;
    }
    
    
    
    
    
}
