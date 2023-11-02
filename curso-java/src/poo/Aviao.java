package poo;

//Herança (extends)
public class Aviao extends Carro{   
    double envergadura;

    void aterrizar() {
        System.out.println("--------------");
    }
    // Polimofismo (sobrescrever o metodo da classe carro)
    void acelerar() {
        System.out.println("Aviao ACelerando");
    }
}
