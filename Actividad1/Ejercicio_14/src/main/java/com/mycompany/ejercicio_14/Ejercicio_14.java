/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_14;

/**
 *
 * @author paula
 */
//Importamos la libreria util para solicitar un numero
import java.util.Scanner;

public class Ejercicio_14 {

    public static void main(String[] args) {
        //Creamos la variable numero, su cuadrado y su cubo
        double numero, cuadrado_numero, cubo_numero;
        //Solicitamos el numero de interes
        Scanner entrada = new Scanner (System.in);
        //Imprimimos la solicitud
        System.out.println("Ingrese el numero de interes: ");
        //Guardamos la variable de entrada en la variable de numero
        numero = entrada.nextDouble();
        //Calculamos el cuadrado del numero
        cuadrado_numero= potencias.cuadrado(numero);
        cubo_numero = potencias.cubo(numero) ;
        
        //Imprimimos el resultado
        System.out.println(numero + "^2 = "+cuadrado_numero+ " y "+numero+ "^3 = "+ cubo_numero);
    }
}
