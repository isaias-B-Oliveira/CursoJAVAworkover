package poo;

import java.util.Random;

public class Carro {
    //atributos da classe
    int ano;
    String cor;

    //constructor 
    public Carro() {
        Random gerador = new Random();
        int chassi = gerador.nextInt(1000);// numero aleatorio entre (0 e 999)
        System.out.println("chassi: " + chassi);
    }

    //constructor com parametros
    public Carro(int ano, String cor) {
        this.ano = ano;
        this.cor = cor;
    }

    //metodos da classe
    void ligar(){
        System.out.println("engine ON........");
    }
     void desligar(){
        System.out.println("engine OFF........");
    }
     void acelerar(){
        System.out.println("speed up........");
    }

}
