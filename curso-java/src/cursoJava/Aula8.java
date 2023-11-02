// Descrição: Array Multidimensional, também conhecido como matriz é um array de arrays. Esta aula ensina de forma simples e prática a criar uma matriz na Linguagem Java.
package cursoJava;

public class Aula8 {
    public static void main(String[] args) {
        String[][] agenda = {
            {"isaias", "91234-1234", "contato@gmail.com"},
            {"jose", "1234-1234", "contato2@mail.com"},
            {"ivanildo", "98744-5555", "contato3@gmail.com"}
         };
         //recuperando o telefone de isaias
         System.out.println(agenda[0][1]);
         System.out.println("________________");

         //imprimindo toda a matriz
         for (int i = 0; i < agenda.length; i++) {
            for (int j = 0; j < agenda.length; j++) {
                System.out.println(agenda[i][j]);
            }
         }
    }
}
