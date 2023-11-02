package cursoJava;
 
// Operadores aritimeticos e de atribuição

public class Aula3 {
    public static void main(String[] args) {
        double i = 10;
        System.out.println("i = " + i); // concatenação

        System.out.println("i = " + i + " + 5 | i = " + (i + 5)); // adição
        System.out.println("i = " + i + " - 5 | i = " + (i - 5)); // subtração
        System.out.println("i = " + i + " * 5 | i = " + (i * 5)); // multiplicação
        System.out.println("i = " + i + " / 5 | i = " + (i / 5)); // divisao
        System.out.println("i = " + i + " % 5 | i = " + (i % 5)); // modulo

        System.out.println("i += 5  | i = " + (i += 5));  
        System.out.println("i -= 5  | i = " + (i -= 5));  
        System.out.println("i *= 5  | i = " + (i *= 5));  
        System.out.println("i /= 5  | i = " + (i /= 5));  

        i++;
        System.out.println("i++    | i = " + i);
        i--;
        System.out.println("i--    | i = " + i);

    }
}
