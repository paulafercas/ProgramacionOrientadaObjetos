/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_17;

/**
 *
 * @author paula
 */
//Importamos la libreria util para leer el radio del circulo
import java.util.Scanner;
public class Ejercicio_17 {
    public static void main(String[] args) {
        //Creamos las variables del ejercicio
        double radio, area_circulo, longitud_circunferencia;
        //Solicitamos el radio del circulo
        Scanner entrada = new Scanner (System.in);
        //Imprimimos la solicitud
        System.out.println ("Ingrese el radio del circulo en metros: ");
        //Guardamos el valor de la entrada en la variable radio
        radio = entrada.nextDouble();
        
        //Calculamos el area del circulo
        area_circulo= geometria.calcular_area(radio);
        //Calculamos la longitud de la circunferencia
        longitud_circunferencia = geometria.longitud_circunferencia(radio);
        System.out.println("El area del circulo es: "+ area_circulo+ " m^2");
        System.out.println("La longitud de la circunferencia es: "+ longitud_circunferencia+ " m");
    }
}
