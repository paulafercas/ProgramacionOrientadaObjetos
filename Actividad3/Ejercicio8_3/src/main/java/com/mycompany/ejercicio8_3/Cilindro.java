/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio8_3;

/**
 *
 * @author paula
 */
public class Cilindro extends FiguraGeométrica{
    private double radio; // Atributo que establece el radio de un cilindro
    private double altura;
    
    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
        this.setVolumen(calcularVolumen()); /* Calcula el volumen y 
        establece su atributo */
        this.setSuperficie(calcularSuperficie()); /* Calcula la superficie y 
        establece su atributo */
    }
    
    public double calcularVolumen() {
        double volumen = Math.PI * altura * Math.pow(radio, 2.0);
        return volumen;
    }
    
    public double calcularSuperficie() {
        double áreaLadoA = 2.0 * Math.PI * radio * altura;
        double áreaLadoB = 2.0 * Math.PI * Math.pow(radio, 2.0);
        return áreaLadoA + áreaLadoB;
    }
}
