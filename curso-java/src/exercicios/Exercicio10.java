package exercicios;

public class Exercicio10 {
    public static void main(String[] args) {
        String[] nipes = {"ouros", "copas", "espadas", "paus"};
        String[] faces = {"Az", "2", "3", "4", "5", "6", "7", "8", "9", "10", "valete", "damas", "rei"};

        String nipe = nipes[(int) (Math.random() * 4)];
        String face = faces[(int) (Math.random() * faces.length)];

        System.out.println(face + " de " + nipe);
    }
}
