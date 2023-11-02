// Descrição: Exercício 1 - Desenvolva uma aplicação no console (terminal) que faça a conversão de temperatura em Fahrenheit para Celsius.
package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        //variaveis
        double C, F;
        //objetos
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatado = new DecimalFormat("#0.0");
        //entrada
        System.out.println("Converso de temperatura");
        System.out.print("Digite a temperatura em Fahrenheit: ");
        F = teclado.nextDouble();
        //processamento
        C = (5 * (F - 32)) / 9 ;
        //saida
        System.out.println("Temperatura em Celcius: " + formatado.format(C) + "°C");
        //fechamento de objetos(Scanner)
        teclado.close();
    }
}
