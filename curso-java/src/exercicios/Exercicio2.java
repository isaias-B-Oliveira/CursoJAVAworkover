// Descrição: Exercício 2 - Desenvolva uma aplicação no console (terminal) para calcular o valor da porcentagem usando Regra de 3, conforme modelo abaixo:
// x% de y = valor

package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //variaveis
        double X, Y, valor;
        //objetos
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatado = new DecimalFormat("#0.00");
        //entrada
        System.out.println("Regra de 3 para pocentagem");
        System.out.print("Digite a porcentagem: ");
        X = teclado.nextDouble();
        System.out.print("Digite o valor: ");
        Y = teclado.nextDouble();
        //processamento
        valor = (X * Y) / 100;
        //saida
        System.out.println(X + "% de " + Y + " = " + formatado.format(valor));

        teclado.close();

    }

}
