package contabancaria;

public class Conta {
    // Encapsulamento(private) so temos asseco as variaveis dentro da classe principal(Conta) presisamos criar os metodos (getVariavel e setVariavel) para ter asseco em outras classes e objetos
    private String cliente;
    public String getCliente(){
        return cliente;
    }
    public void setCliente(String cliente){
        this.cliente = cliente;
    }

    private double saldo;
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }


    //constructor
    public Conta() {
        System.out.println("Agencia 0101");
    }

    //metodos
    protected void exibiSaldo() {
        System.out.println("Saldo R$ " + saldo);
    }

    void Sacar(double valor) {
        saldo -= valor;
        System.out.println("Debito R$: " + valor);
    }
     void Depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito R$: " + valor);
    }
    void transferir(Conta destino, double valor) {
        this.Sacar(valor);
        destino.Depositar(valor);
        System.out.println("Transferencia R$: " + valor);
    }
    //metodo com retorno
    double soma(double cc1, double cc2){
        double total = cc1 + cc2;
        return total;
    }
}
