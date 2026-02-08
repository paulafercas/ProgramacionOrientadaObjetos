/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_12;

/**
 *
 * @author paula
 */
public class Ejercicio_12 {

    public static void main(String[] args) {
        //Creamos primero todas las variables iniciales del ejercicio
        double horas_trabajadas, valor_hora, porcentaje_retencion_fuente;
        //Inicializamos las variables
        horas_trabajadas = 48;
        valor_hora = 5000;
        porcentaje_retencion_fuente= 12.5;
        
        //Creamos las variables que guardan los valores que nos pide el ejercicio
        double retencion_fuente,salario_bruto,salario_neto;
        
        //Calculamos lo pedido en el ejercicio
        salario_bruto= calculoSueldos.calcular_sueldo_bruto(horas_trabajadas, valor_hora);
        retencion_fuente= calculoSueldos.calcular_retencion_fuente(porcentaje_retencion_fuente, salario_bruto);
        salario_neto= calculoSueldos.calcular_sueldo_neto(salario_bruto, retencion_fuente);
        
        //Imprimimos las respuestas
        System.out.println("El salario bruto es: "+salario_bruto);
        System.out.println("La retencion en la fuente es: "+retencion_fuente);
        System.out.println("El salario neto es: "+salario_neto);
    }
}
