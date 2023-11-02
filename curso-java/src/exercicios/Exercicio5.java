// Descrição: Exercício 5 - Para carros com motor flex é preciso ter cautela ao escolher o combustível na hora de abastecer. A principal diferença de preços e vantagens entre os dois combustíveis está na proporção preço X desempenho. Para o álcool ser mais vantajoso do que a gasolina, o preço do litro tem que custar até 70% do litro da gasolina. Baseado nestas informações desenvolva um aplicativo no console (terminal) para determinar qual é o combustível mais vantajoso para abastecer.
package exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        double alcool, gasolina;

        Scanner teclado = new Scanner(System.in);
        

        System.out.print("Digite o valor do alcool: ");
        alcool = teclado.nextDouble();
        System.out.print("Digite o valor da gasolina: ");
        gasolina = teclado.nextDouble();

        if (alcool < 0.7 * gasolina) {
            System.out.println("Abastecer com alcool");
        } else {
            System.out.println("Abastecer com gasolina"); 
        }

        teclado.close();
    }
}
