// Descrição: Exercício 8: Desenvolva um aplicativo no console (terminal) para calcular o valor da tabuada. O aplicativo deverá perguntar qual é o valor da tabuada a ser calculada.

package exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        int valor;

         Scanner teclado = new Scanner(System.in);
         System.out.println("TABUADA DE MULTIPLICAÇÃO");
         System.out.print("Digite o valor da tabuada: ");
         valor = teclado.nextInt();

         for (int i = 0; i <= 10; i ++){
            System.out.println(valor + " X " + i + " = " + (valor * i));
         }

         teclado.close();
    }
}
