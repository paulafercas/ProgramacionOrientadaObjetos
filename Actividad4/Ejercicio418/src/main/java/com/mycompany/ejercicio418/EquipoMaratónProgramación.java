/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio418;
import javax.swing.JOptionPane;

/**
 *
 * @author paula
 */
public class EquipoMaratónProgramación {
    /* Atributo que define el nombre el equipo de la maratón de
    programación */
    String nombreEquipo;
    /* Atributo que define el nombre de la universidad a la que
    pertenece el equipo de la maratón de programación */
    String universidad;
    /* Atributo que define el lenguaje de programación utilizado por el
    equipo de la maratón de programación */
    String lenguajeProgramación;
    /* Atributo que define los programadores que conforman el equipo
    de la maratón de programación */
    static Programador[] programadores;
    /* Atributo que define el tamaño del equipo de la maratón de
    programación */
    static int tamañoEquipo;
    
    EquipoMaratónProgramación(String nombreEquipo, String universidad, String lenguajeProgramación, int numero) {
        this.nombreEquipo = nombreEquipo;
        this.universidad = universidad;
        this.lenguajeProgramación = lenguajeProgramación;
        this.programadores = this.programadores;
        tamañoEquipo = 0;
        programadores = new Programador[numero];
        
    }
    
    static boolean estáLleno() {
        return tamañoEquipo == programadores.length;
    }
    
    static void añadir(Programador programador){
        if (estáLleno()) { 
            JOptionPane.showMessageDialog(null,"El equipo está completo. No se pudo agregar programador.","Equipo completo",JOptionPane.INFORMATION_MESSAGE);
        }
        // Se asigna el programador al array de programadores
        programadores[tamañoEquipo] = programador;
        JOptionPane.showMessageDialog(null,"Se ha guardado correctamente los datos del integrante","Guardado exitoso",JOptionPane.INFORMATION_MESSAGE);
        tamañoEquipo++; // Se incrementa el tamaño del equipo
    }
    static int validarNumero (int numero ) {
        if (numero <2){
            return 0;
        }
        else if (numero >3){
            return 0;
        }
        else{
            return 1;
        }
           
    }
    
    static int validarCampo(String campo) {
        for (int j = 0; j < campo.length(); j++) {
            char c = campo.charAt(j);
        
        if (Character.isDigit(c)) { /* Si el caracter es un dígito se genera
            la excepción correspondiente */
            return 1;
        }
        }
        if (campo.length() > 20) {
            return 2;
        }
        else {
            return 0;
        }
    }
}
