/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_12;

/**
 *
 * @author paula
 */
public class calculoSueldos {
    public static double calcular_sueldo_bruto (double horas_trabajadas,double valor_hora ){
        double sueldo_bruto = horas_trabajadas*valor_hora;
        return sueldo_bruto;
    }
    public static double calcular_retencion_fuente (double porcentaje_retencion,double sueldo_bruto ){
    double retencion_fuente = porcentaje_retencion*sueldo_bruto/100;
    return retencion_fuente;
    }
    public static double calcular_sueldo_neto (double sueldo_bruto,double retencion_fuente ){
    double sueldo_neto = sueldo_bruto- retencion_fuente;
    return sueldo_neto;
    }
}
