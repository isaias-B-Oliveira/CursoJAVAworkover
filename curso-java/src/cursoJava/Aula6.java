// Descrição: Array ou Vetor é uma estrutura de dados indexada que otimiza o uso das variáveis e simplifica a programação. Esta aula ensina de forma simples e prática o que é um array.
package cursoJava;

public class Aula6 {
    public static void main(String[] args) {
        String[] carros = {"ferrari", "fusca", "uno", "camaro"};

        System.out.println("tamanho do array: " + carros.length);
        System.out.println("Carro: " + carros[1]);
        carros[1] = "porche";
        System.out.println("Carro: " + carros[1]);

        System.out.println("__________________");
        System.out.println("Carros:");
        
        for (int i = 0; i < carros.length; i++) {
            System.out.println(carros[i]);
        }

    }
}
