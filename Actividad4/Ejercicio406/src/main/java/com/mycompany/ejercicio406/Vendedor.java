/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio406;

import javax.swing.JOptionPane;

/**
 *
 * @author paula
 */
public class Vendedor {
    String nombre; // Atributo que identifica el nombre de un vendedor
    String apellido; // Atributo que identifica los apellidos de un vendedor
    int edad; // Atributo que identifica la edad de un vendedor

    Vendedor(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellido = apellidos;
    }

    public void imprimir() {
       JOptionPane.showMessageDialog(null,"Nombre: "+nombre,"Nombre del vendedor",JOptionPane.INFORMATION_MESSAGE);
       JOptionPane.showMessageDialog(null,"Apellido: "+apellido,"Apellido del vendedor",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public int verificarEdad(int edad) {
        if (edad < 18 && edad>0) {
            JOptionPane.showMessageDialog(null,"El vendedor debe ser mayor de 18 años.","Error de validación de la edad",JOptionPane.WARNING_MESSAGE);
            return -1;
        } 
        else if (edad >= 18 && edad < 120) { 
            this.edad = edad;
            JOptionPane.showMessageDialog(null,"Edad registrada con éxito: "+ edad);
            return edad;
        }
        else {
            JOptionPane.showMessageDialog(null,"La edad no puede ser negativa ni mayor a 120","Error de rango",JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

}
    
