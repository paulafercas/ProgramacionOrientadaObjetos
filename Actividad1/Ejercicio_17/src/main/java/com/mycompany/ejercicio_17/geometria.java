/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_17;

/**
 *
 * @author paula
 */
public class geometria {
    //Metodo para calcular el area del circulo
    public static double calcular_area (double radio){
        double area_circulo;
        area_circulo = Math.PI*Math.pow(radio,2);
        return area_circulo;         
    }
    //Metodo para calcular la longitud de la circunferencia
    public static double longitud_circunferencia (double radio){
        double longitud_circunferencia;
        longitud_circunferencia = 2*Math.PI*radio;
        return longitud_circunferencia;
    }
}
