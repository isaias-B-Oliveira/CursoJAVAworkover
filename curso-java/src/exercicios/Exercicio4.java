// Descrição: Exercício 4 - Desenvolva uma aplicação no console (terminal) para calcular o valor da hora de um serviço.

package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        double hora, remuneracao, custo, cargaHoraria;

        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatado = new DecimalFormat("#0.00");

        System.out.println("Calculo da hora de trbalho");
        System.out.print("Remuneração pretendida: ");
        remuneracao = teclado.nextDouble();
        System.out.print("Custo operacional mensal: ");
        custo = teclado.nextDouble();
        System.out.print("Carga horaria de trabalho mensal: ");
        cargaHoraria = teclado.nextDouble();

        hora = (remuneracao + (remuneracao * 0.3) + custo + (remuneracao * 0.2)) / cargaHoraria;

        System.out.println("Valor da hora " + formatado.format(hora));

        teclado.close();

    }
}
