package cursoJava;

// estruturas de repetição (LAÇOS)

public class Aula5 {
    public static void main(String[] args) {

        for (int i = 10; i > 0; i--){
            System.out.println("hello = " + i);
        }

        for (int tabuada = 0; tabuada <= 10; tabuada++){
            System.out.println("");
            for (int valor = 0; valor <= 10; valor++){
                System.out.println(tabuada + " X " + valor + " = " + (tabuada * valor));
            }
        }

         System.out.println("");

        int contador = 1;
        while (contador <= 10) {
            System.out.println(contador);
            contador++;
        }

        System.out.println("");

        char novojogo;
        do {
            System.out.println("Deseja jogar [S/N]? ");
            novojogo = 'N';
        } while(novojogo == 'S'); {
            System.out.println("GAME OVER!");
        }
    }
    
}
