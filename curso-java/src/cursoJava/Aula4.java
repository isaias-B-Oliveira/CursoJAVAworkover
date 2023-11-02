package cursoJava;

// Estrururas de controle (CONDICIONAL)

public class Aula4 {
    public static void main(String[] args) {
        int idade = 27;

        if(idade >= 18) {
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }

        int idadeVoto = 27;
        if(idadeVoto < 16){
            System.out.println("PROIBIDO VOTAR");  
        }else if(idadeVoto >= 18 && idadeVoto <= 70){
              System.out.println("VOTO OBRIGATORIO");
        }else if (idadeVoto == 16 || idadeVoto == 17 || idadeVoto >= 70){
              System.out.println("VOTO FACULTATIVO");
        }

        int opcao = 1;
        switch(opcao){
            case 1:
                System.out.println("CLIENTE");
                break;
             case 2:
                System.out.println("USUARIO");
                break;
             case 3:
                System.out.println("RELATORIO");
                break;    
             default:
                System.out.println("OPÇÃO INVALIDA");
                break;
        }
    }
}
