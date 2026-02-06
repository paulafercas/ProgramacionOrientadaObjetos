/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_4;

/**
 *
 * @author paula
 */
/**
 * Inicializamos las variables asociadas a las edades de cada persona
 */



public class Ejercicio_4 {

    public static void main(String[] args) {
        double edad_juan, edad_alberto, edad_ana, edad_mama;
        edad_juan = 9;
        edad_alberto = Edades.calcular_edad_Alberto(edad_juan);
        edad_ana = Edades.calcular_edad_Ana(edad_juan);
        edad_mama = Edades.calcular_edad_mama(edad_juan, edad_alberto, edad_ana);
        System.out.println("Las edades son: Alberto: " + edad_alberto + " Ana: "+ edad_ana+" Mama: "+ edad_mama);
    }
}
