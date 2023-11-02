package exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        char opcao = 's';

        Scanner teclado = new Scanner(System.in);

        while (opcao == 's') {
            System.out.println("Lançamtnto do Dado_________");
            int dado = (int)(Math.random() * 6 + 1);
            System.out.println("Face: " + dado);
            System.out.println("Deseja lanca o dado novamente (S/N)? : ");
            opcao = teclado.next().charAt(0);
   
        }

        teclado.close();
    }
}
