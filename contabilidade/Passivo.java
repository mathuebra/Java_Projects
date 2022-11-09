/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.contabilidade;

/**
 *
 * @author mathuebra
 */
public interface Passivo {
    
    public static final double SALARIO = 1212.00;
    public static final double HORA = 45.00;
    
    public double getValorAPagar (int diaPagto, int mesPagto);
}
