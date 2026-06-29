/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio4_6;

/**
 *
 * @author paula
 */
public class ProfesorTitular extends Profesor{
    String nombre;
    int años = 0;
    
    protected void imprimir() {
        System.out.println("Es un profesor titular.");
    }
    
    protected void constructor(String nombre, int años){
        this.años = años;
        this.nombre = nombre;
    }
    protected void imprimirAños() {
        System.out.println(nombre + " lleva "+ años + " años");
    }
}
