/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_4;

/**
 *
 * @author paula
 */
public class Edades {
    public static double calcular_edad_Alberto (double edad_juan){
    double edad_alberto = 2*edad_juan/3;
    return edad_alberto;
}

public static double calcular_edad_Ana (double edad_juan){
    double edad_ana = 4*edad_juan/3;
    return edad_ana;
}
public static double calcular_edad_mama (double edad_juan, double edad_alberto,double edad_ana){
    double edad_mama = edad_alberto + edad_ana + edad_juan;
    return edad_mama;
}
}
