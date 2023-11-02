package contabancaria;

public class ContaPessoaFisica {
    public static void main(String[] args) {
        Conta cc1 = new Conta();
        cc1.setCliente("Jose Isaias");
        cc1.setSaldo(10000);
        System.out.println("Cliente: " + cc1.getCliente());
        cc1.exibiSaldo();
        cc1.Sacar(1000);
        cc1.exibiSaldo();

        System.out.println("-----------------");

        Conta cc2 = new Conta();
        cc2.setCliente("jose de oliveira");
        cc2.setSaldo(2000);
        System.out.println("Cliente: " + cc2.getCliente());
        cc2.exibiSaldo();
        cc2.Depositar(1500);
        cc2.exibiSaldo();

        System.out.println("-----------------");
        System.out.println("Transferencia");
        System.out.println("Cliente: " + cc1.getCliente());
        System.out.println("Favorecido: " + cc2.getCliente());
        cc1.transferir(cc2, 2000);
        System.out.println("");

        System.out.println("Cliente: " + cc1.getCliente());
        cc1.exibiSaldo();
        System.out.println("Cliente: " + cc2.getCliente());
        cc2.exibiSaldo();

        System.out.println("-----------------");
        System.out.println("Relatorio Total");
        Conta gerente = new Conta();
        double relatorio = gerente.soma(cc1.getSaldo(), cc2.getSaldo());
        System.out.println("Saldo total nas contas R$: " + relatorio);

    }
}
