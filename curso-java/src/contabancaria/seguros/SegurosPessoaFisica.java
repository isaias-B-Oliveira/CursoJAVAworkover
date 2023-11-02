package contabancaria.seguros;
import contabancaria.Conta;

// so podemos acessar uma classe de outro pacote(contabancaria/conta) com o modificador (protected) criando uma herança// SegurosPessoaFisica esta herdando os metodos e atributos da classe principal (Conta)

public class SegurosPessoaFisica extends Conta {
    public static void main(String[] args) {
        SegurosPessoaFisica cc3 = new SegurosPessoaFisica();
        cc3.setCliente("Jose");
        cc3.setSaldo(5000);
        System.out.println("Cliente: " + cc3.getCliente());
        cc3.exibiSaldo();
    }
}
