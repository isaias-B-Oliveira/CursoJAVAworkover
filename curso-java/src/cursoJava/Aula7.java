// Descrição: O que é ArrayList?
// ArrayList é um vetor dinâmico muito usado em projetos com banco de dados. Esta aula ensina a trabalhar com o ArrayList de forma simples e prática.
package cursoJava;

import java.util.ArrayList;

public class Aula7 {
    public static void main(String[] args) {
        ArrayList<String> contato = new ArrayList<>();

        contato.add("jose isaias");
        contato.add("99999-9999");
        contato.add("jose@gmail.com");

        contato.add("ze de aquino");
        contato.add("55555-5555");
        contato.add("ze@gmail.com");

        System.out.println(contato);
        System.out.println("tamanho do ArrayList: " + contato.size());
        System.out.println("Email jose isaias: " + contato.get(2));
        System.out.println("_________________");
        
        for (int i = 0; i < contato.size(); i++) {
            System.out.println(contato.get(i));
        }
    }
}
