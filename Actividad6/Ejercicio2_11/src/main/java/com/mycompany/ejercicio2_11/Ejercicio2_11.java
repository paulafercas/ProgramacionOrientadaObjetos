/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2_11;

import java.util.Scanner;

/**
 *
 * @author paula
 */
public class Ejercicio2_11 {

    public static void main(String[] args) {
        String título; 
        String autor;
        String[] palabrasClaves = new String[3];
        String publicación;
        int año;
        String resumen; 
        String entradaPalabra;
        int tipoConstructor;
        
        //Solicitamos el tipo de constructor que se va a hacer
        Scanner entrada = new Scanner (System.in);
        //Imprimimos la solicitud
        System.out.println("Si desea inicializar el artículo con su título y autor escriba '1' \nSi desea iniciarlo además con sus palabras clave, nombre de la pubicación y año escriba '2' \nSi desea inicializarlo con todos los ítems anteriores y agregar su resumen escriba '3'\n");
        tipoConstructor = entrada.nextInt();
        entrada.nextLine();
        
        switch (tipoConstructor){
            case 1:
                ArtículoCientífico articulo1 = new ArtículoCientífico();
            
                System.out.println("Ingrese el título");
                título = entrada.nextLine();
                System.out.println("Ingrese el autor");
                autor = entrada.nextLine();
                
                articulo1.ArtículoCientífico(título, autor);
                articulo1.imprimir();
                break;
                
            case 2:
                ArtículoCientífico articulo2 = new ArtículoCientífico();
            
                System.out.println("Ingrese el título");
                título = entrada.nextLine();
                System.out.println("Ingrese el autor");
                autor = entrada.nextLine();
                
                System.out.println("Ingrese las tres palabras claves separadas por coma y sin espacio");
                entradaPalabra = entrada.nextLine();
                palabrasClaves = entradaPalabra.split(",");

                
                System.out.println("Ingrese la publiación");
                publicación = entrada.nextLine();
                System.out.println("Ingrese el año");
                año = entrada.nextInt();
                
                articulo2.ArtículoCientífico(título, autor, palabrasClaves, publicación, año);
                articulo2.imprimir();
                break;
                
            case 3:
                ArtículoCientífico articulo3 = new ArtículoCientífico();
            
                System.out.println("Ingrese el título");
                título = entrada.nextLine();
                System.out.println("Ingrese el autor");
                autor = entrada.nextLine();
                
                System.out.println("Ingrese las tres palabras claves separadas por coma y sin espacio");
                entradaPalabra = entrada.nextLine();
                palabrasClaves = entradaPalabra.split(",");

                
                System.out.println("Ingrese la publiación");
                publicación = entrada.nextLine();
                System.out.println("Ingrese el año");
                año = entrada.nextInt();
                entrada.nextLine();
                
                System.out.println("Ingrese el resumen");
                resumen = entrada.nextLine();
                
                articulo3.ArtículoCientífico(título, autor, palabrasClaves, publicación, año, resumen);
                articulo3.imprimir();
                break;
                
             default:
                System.out.println("El número ingresado no es una opción válida");
                break;
        }        
        
    }
}
