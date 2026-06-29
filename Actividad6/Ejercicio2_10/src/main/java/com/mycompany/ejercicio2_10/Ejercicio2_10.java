/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2_10;

/**
 *
 * @author paula
 */
//Importamos la libreria util para solicitar un numero
import java.util.Scanner;

public class Ejercicio2_10 {

    public static void main(String[] args) {
        //Variables para los pedidos
        String plato1;
        double costoPlato1;
        String plato2;
        double costoPlato2;
        String postre1;
        double costoPostre1;
        String bebida1;
        double costoBebida1;
        int tipoPedido;
        
        //Solicitamos el tipo de pedido que se va a hacer
        Scanner entrada = new Scanner (System.in);
        //Imprimimos la solicitud
        System.out.println("Si su pedido es de un plato y una bebida escriba '1' \nSi su pedido es de dos platos y una bebida escriba '2' \nSi su pedido es de dos platos, una bebida y un postre escriba '3'\n");
        tipoPedido = entrada.nextInt();
        entrada.nextLine();
        
        switch (tipoPedido){
            case 1:
                Pedido pedido1 = new Pedido();
            
                System.out.println("Ingrese el plato");
                plato1 = entrada.nextLine();
                System.out.println("Ingrese el costo del plato");
                costoPlato1 = entrada.nextDouble();
                entrada.nextLine();

                System.out.println("Ingrese la bebida");
                bebida1 = entrada.nextLine();
                System.out.println("Ingrese el costo de la bebida");
                costoBebida1 = entrada.nextDouble();
                entrada.nextLine();

                pedido1.calcularPedido(plato1, costoPlato1, bebida1, costoBebida1);
                break;
            
            case 2:
                Pedido pedido2 = new Pedido();
            
                System.out.println("Ingrese el primer plato");
                plato1 = entrada.nextLine();
                System.out.println("Ingrese el costo del primer plato");
                costoPlato1 = entrada.nextDouble();
                entrada.nextLine();

                System.out.println("Ingrese el segundo plato");
                plato2 = entrada.nextLine();
                System.out.println("Ingrese el costo del segundo plato");
                costoPlato2 = entrada.nextDouble();
                entrada.nextLine();

                System.out.println("Ingrese la bebida");
                bebida1 = entrada.nextLine();
                System.out.println("Ingrese el costo de la bebida");
                costoBebida1 = entrada.nextDouble();
                entrada.nextLine();

                pedido2.calcularPedido(plato1, costoPlato1, plato2, costoPlato2, bebida1, costoBebida1);

                break;
                
            case 3:
                Pedido pedido = new Pedido();
            
                System.out.println("Ingrese el primer plato");
                plato1 = entrada.nextLine();
                System.out.println("Ingrese el costo del primer plato");
                costoPlato1 = entrada.nextDouble();
                entrada.nextLine();

                System.out.println("Ingrese el segundo plato");
                plato2 = entrada.nextLine();
                System.out.println("Ingrese el costo del segundo plato");
                costoPlato2 = entrada.nextDouble();
                entrada.nextLine();

                System.out.println("Ingrese la bebida");
                bebida1 = entrada.nextLine();
                System.out.println("Ingrese el costo de la bebida");
                costoBebida1 = entrada.nextDouble();
                entrada.nextLine();

                System.out.println("Ingrese el postre");
                postre1 = entrada.nextLine();
                System.out.println("Ingrese el costo del postre");
                costoPostre1 = entrada.nextDouble();
                entrada.nextLine();

                pedido.calcularPedido(plato1, costoPlato1, plato2, costoPlato2, postre1, costoPostre1, bebida1, costoBebida1);
                
                break;
                
            default:
                System.out.println("El número ingresado no es una opción válida");
                break;
        }
        
    }

}
