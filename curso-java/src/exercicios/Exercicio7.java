// Descrição: Exercício 7: Desenvolva o jogo “Pedra – Papel – Tesoura”, conforme modelo abaixo:

// JoKenPô

// 1. Pedra
// 2. Papel
// 3. Tesoura

// Digite a opção desejada:
// Jogador escolheu:
// Computador escolheu:
// VENCEDOR:
package exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        int jogador, computador;

        Scanner teclado = new Scanner(System.in);

        System.out.println("_____Jokenpô__________");
        System.out.println("");
        System.out.println("1. Pedra");
        System.out.println("2. Papel");
        System.out.println("3. Tesoura");
        System.out.print("Digite a opção desejada: ");
        
        jogador = teclado.nextInt();
        System.out.println("");
        switch (jogador) {
            case 1:
                System.out.println("Jogador escolhel PEDRA");
                break;
            case 2:
                System.out.println("Jogador escolhel PAPEL");
                break;
            case 3:
                System.out.println("Jogador escolhel TESOURA");
                break;    
            default:
                System.out.println("Opção invalida: ");
                break;
        }

        computador = (int)(Math.random() * 3 + 1);
         switch (computador) {
            case 1:
                System.out.println("Computador escolhel PEDRA");
                break;
            case 2:
                System.out.println("Computador escolhel PAPEL");
                break;
            case 3:
                System.out.println("Computador escolhel TESOURA");
                break;  
        }  
        
        System.out.println("");
        if (jogador == computador) {
            System.out.println("ENPATE");   
        }else {
            if ((jogador == 1 && computador == 3) || 
               (jogador == 2  && computador == 1) || 
               (jogador == 3 && computador == 2))
            {
              System.out.println("Jogador vencel");  
            } else {
                System.out.println("Computador vencel");
            }
        }


        teclado.close();
    }
}
