// Descrição: Exercício 3 - Desenvolva uma aplicação no console (terminal) de ponto de vendas (PDV), conforme modelo abaixo:

// - Valor total: 200,00
// - Desconto(%): 5
// - Total com desconto: 190,00 (valor calculado)
// - Valor pago: 200,00
// - Troco: 10,00 (valor calculado)
package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        //variaveis
        double total, desconto, totaldesconto, valorpago, troco;
        //objetos
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatado = new DecimalFormat("#0.00");
        //entrada1
        System.out.println("PDV");
        System.out.print("Valor total da compra: ");
        total = teclado.nextDouble();
        System.out.print("Desconto em (%): ");
        desconto = teclado.nextDouble();
        //processamento1
        totaldesconto = total - (desconto * total) / 100;
        //saida1
        System.out.println("Total com desconto R$: " + formatado.format(totaldesconto));

        System.out.println("-----------------------");
        //entrada2
        System.out.println("valor pago en dinheiro: ");
        valorpago = teclado.nextDouble();
        //processamento2
        troco = valorpago - totaldesconto;
        //saida2
        System.out.println("Troco R$: " + formatado.format(troco));


        teclado.close();
    }
}
