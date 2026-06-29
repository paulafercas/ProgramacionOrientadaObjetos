/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4_6;

import java.util.Scanner;

/**
 *
 * @author paula
 */
public class Ejercicio4_6 {

    public static void main(String[] args) {
        String nombre;
        int años;
        
        Scanner entrada = new Scanner (System.in);
        System.out.println ("Ingrese el nombre del profesor: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese los años que lleva el profesor: ");
        años = entrada.nextInt();
        
        Profesor profesor1 = new ProfesorTitular();
        ProfesorTitular titular = (ProfesorTitular) profesor1;
        titular.constructor(nombre, años);
        titular.imprimirAños();
    }
}
