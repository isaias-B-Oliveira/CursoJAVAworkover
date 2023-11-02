// Descrição: Exercício 6: Desenvolva um aplicativo no console (terminal) para calcular o valor do IMC. O aplicativo deverá exibir além do valor do IMC a classificação de acordo com a tabela do IMC.

package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        double peso, altura, imc;

         Scanner teclado = new Scanner(System.in);
         DecimalFormat formatado = new DecimalFormat("#0.00");

         System.out.print("Digite o seu peso: ");
         peso = teclado.nextDouble();
         System.out.print("Digite sua altura: ");
         altura = teclado.nextDouble();

         imc =  peso / (altura * altura);
         System.out.println("IMC: " + formatado.format(imc));

         if (imc < 18.5) {
            System.out.println("Abaixo do peso");
         }else if(imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal");
         }else if(imc >= 25.0 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
         }else if(imc >= 30.6 && imc <= 34.9) {
            System.out.println("Obesidade grau 1");
         }else if(imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade grau 2 (severa)");
         }else {
            System.out.println("Obesidade morbida");
         }

         teclado.close();
    }
}
