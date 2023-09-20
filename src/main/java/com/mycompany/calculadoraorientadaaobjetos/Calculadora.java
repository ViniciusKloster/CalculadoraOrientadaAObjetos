/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraorientadaaobjetos;

/**
 *
 * @author kloster.2919
 */
public class Calculadora {
    private float resultado;

    public Calculadora() {
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
    
    public float somar(float a, float b){
        return a + b;
    } 
    
    public float subtrair(float a, float b){
        return a - b;
    }
    
    public float multiplicar(float a, float b){
        return a * b;
    }
    
    public float dividir(float a, float b){
        return a / b;
    }
}
