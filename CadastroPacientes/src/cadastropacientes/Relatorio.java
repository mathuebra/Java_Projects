/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastropacientes;

import java.util.ArrayList;

/**
 *
 * @author matheus
 */
public class Relatorio {
    
    ArrayList<Paciente> pacientes;
    
    //pacientes = new Paciente();
    
    public int getRelatorioA (ArrayList<Paciente> pacientes) {
        
        return pacientes.size();
    }
    
    public double getRelatorioB (ArrayList<Paciente> pacientes) {
        
        double mediaIdadeParcial = 0;
        
        for (int i = 0; i < pacientes.size(); i ++) {
            if (pacientes.get(i).equals("m")) {
                mediaIdadeParcial += pacientes.get(i).getIdade();
            }
        }
        
        return mediaIdadeParcial/pacientes.size();
    }
    
    public int getRelatorioC (ArrayList<Paciente> pacientes) {
        
        int qntPacientes = 0;
        
        for (int i = 0; i < pacientes.size(); i ++) {
            if (pacientes.get(i).equals("f")) {
                if (pacientes.get(i).getAltura() >= 1.60 && pacientes.get(i).getAltura() <= 1.70)
                    qntPacientes ++;
            }
        }
        
        return qntPacientes;
    }
    
    public int getRelatorioD (ArrayList<Paciente> pacientes) {
        
        int qntPacientes = 0;
        
        for (int i = 0; i < pacientes.size(); i ++) {
            if (pacientes.get(i).getIdade() >= 18 && pacientes.get(i).getIdade() <= 25)
                qntPacientes ++;
        }
        
        return qntPacientes;
    }
    
    public String getRelatorioE (ArrayList<Paciente> pacientes) {
        
        String nomePaciente;
        
        return "aaaaaaa";
    }

}
