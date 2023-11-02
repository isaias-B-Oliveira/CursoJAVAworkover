package poo;

public class Uno {
    public static void main(String[] args) {
        Carro uno = new Carro(1996, "Branco");
        System.out.println("Carro: Camaro");
        System.out.println("Ano: " + uno.ano);
        System.out.println("Cor: " + uno.cor);
        uno.ligar();
        uno.acelerar();
    }
}
