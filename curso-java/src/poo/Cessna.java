package poo;

public class Cessna {
    public static void main(String[] args) {
        Aviao cessna = new Aviao();
        cessna.ano = 2015;
        cessna.cor = "Branco";
        cessna.envergadura = 12;
        System.out.println("Aviao : Cessna");
        System.out.println("Ano: " + cessna.ano);
        System.out.println("Cor: " + cessna.cor);
        System.out.println("Envergadura: " + cessna.envergadura + "Mts");
        cessna.aterrizar();
        cessna.ligar();
        cessna.acelerar();
    }
}
