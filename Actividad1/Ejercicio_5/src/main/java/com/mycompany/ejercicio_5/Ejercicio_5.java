/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_5;

/**
 *
 * @author paula
 */
public class Ejercicio_5 {

    public static void main(String[] args) {
        double suma, x, y;
        suma = 0;
        x = 20;
        y = 40;
        
        suma = suma + x;
        
        x = x+ Math.pow (y,2);
        suma = suma + x/y;
        System.out.println("El valor de x: "+ x);
        System.out.println("El valor de y: "+ y);
        System.out.println("El valor de la suma es: "+ suma);
    }
}
