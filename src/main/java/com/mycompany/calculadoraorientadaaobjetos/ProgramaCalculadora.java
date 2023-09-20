/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraorientadaaobjetos;

import java.util.Scanner;

/**
 *
 * @author kloster.2919
 */
public class ProgramaCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        CalculadoraCientifica cc = new CalculadoraCientifica();
       
    Scanner scanner = new Scanner(System.in);
        float num1, num2;
        int opcao;


        boolean continuar = true;

        String opcaoescolha;

        while(continuar){
        System.out.println("|=====MENU=CALCULADORA===|");
        System.out.println("|1|         Soma         |");
        System.out.println("|-|----------------------|");
        System.out.println("|2|       Subtração      |");
        System.out.println("|-|----------------------|");
        System.out.println("|3|     Multiplicação    |");
        System.out.println("|-|----------------------|");
        System.out.println("|4|        Divisão       |");
        System.out.println("|-|----------------------|");
        System.out.println("|5|     Raiz Quadrada    |");
        System.out.println("|-|----------------------|");
        System.out.println("|6|        Potência      |");
        System.out.println("|=|======================|");
        
        opcao = scanner.nextInt();

        if(opcao == 1){
            System.out.println("Informe o primeiro valor: ");
            num1 = scanner.nextFloat();
            System.out.println("Informe o segundo valor: ");
            num2 = scanner.nextFloat();
            System.out.println("Resultado da soma: " + calculadora.somar(num1, num2));

        }else if(opcao == 2){
            System.out.println("Informe o primeiro valor: ");
            num1 = scanner.nextFloat();
            System.out.println("Informe o segundo valor: ");
            num2 = scanner.nextFloat();
             System.out.println("Resultado da subtração: " + calculadora.subtrair(num1, num2));

        }else if(opcao == 3){
             System.out.println("Informe o primeiro valor: ");
             num1 = scanner.nextFloat();
             System.out.println("Informe o segundo valor: ");
             num2 = scanner.nextFloat();
             System.out.println("Resultado da multiplicação: " + calculadora.multiplicar(num1, num2));

        }else if(opcao == 4){
            System.out.println("Informe o primeiro valor: ");
            num1 = scanner.nextFloat();
            System.out.println("Informe o segundo valor: ");
            num2 = scanner.nextFloat();
            System.out.println("Resultado da divisão: " + calculadora.dividir(num1, num2));

        }else if(opcao == 5){
            System.out.println("Informe o valor: ");
            num1 = scanner.nextFloat();
            System.out.println("Resultado: " + cc.raizquadrada(num1));

        }else if(opcao == 6){
            System.out.println("Informe o primeiro valor: ");
            num1 = scanner.nextFloat();
            System.out.println("Informe o segundo valor: ");
            num2 = scanner.nextFloat();
            System.out.println("Resultado: " + cc.potencia(num1, num2));
        }

         System.out.println("|-------------------------------|");
         System.out.println("|    Deseja continuar? (s/n)    |");
         System.out.println("|-------------------------------|");
         
         opcaoescolha = scanner.next();
         
        if(opcaoescolha.equals("s")){
             continuar = true;
        }else{
          continuar = false;
        }
      }  
   }
}

