/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio412;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author paula
 */
public class CálculosNuméricos {
    static double calcularLogaritmoNeperiano(double valor) {
        double resultado = Double.NaN; //Valor por defecto en caso de error
        
        try {
        if (valor < 0) {
        // Si el valor es negativo, se genera una excepción aritmética
            JOptionPane.showMessageDialog(null,"El valor debe ser un número positivo","Valor no positivo",JOptionPane.ERROR_MESSAGE);
        }
 
        resultado = Math.log(valor);
        
        } 
        
        catch (ArithmeticException e) {
       
        JOptionPane.showMessageDialog(null,"El valor debe ser un número positivo para calcular el logaritmo","Valor no positivo",JOptionPane.ERROR_MESSAGE);
        } 
        
        catch (InputMismatchException e) {
        JOptionPane.showMessageDialog(null,"El valor debe ser numérico para calcular el logaritmo","Valor no númerico",JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
    }
    
    static double calcularRaízCuadrada(double valor) {
        double resultado = Double.NaN; //Valor por defecto en caso de error
        
        try {
        if (valor < 0) {
        // Si el valor es negativo, se genera una excepción aritmética
            JOptionPane.showMessageDialog(null,"El valor debe ser un número positivo","Valor no positivo",JOptionPane.ERROR_MESSAGE);
        }
 
        resultado = Math.sqrt(valor);
        
        } 
        
        catch (ArithmeticException e) {
       
        JOptionPane.showMessageDialog(null,"El valor debe ser un número positivo para calcular la raíz cuadrada","Valor no positivo",JOptionPane.ERROR_MESSAGE);
        } 
        
        catch (InputMismatchException e) {
        JOptionPane.showMessageDialog(null,"El valor debe ser numérico para calcular la raíz cuadrada","Valor no númerico",JOptionPane.ERROR_MESSAGE);
        }
        return resultado;

}
}
