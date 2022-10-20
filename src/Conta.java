public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Titular titular;
    private static int contas;

    public Conta(double saldo, int agencia, int numero, Titular titular) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        Conta.contas++;
    }

    public void deposito (int valorDeposito){
        this.saldo+=valorDeposito;
    }

    public boolean saque (int valorSaque){
        if(this.saldo>=valorSaque){
            this.saldo-=valorSaque;
            return true;
        }
        System.out.println("Saldo insuficiente!");
        return false;
    }

    public void transferencia (int valorTransferencia, Conta recebedor){
        if(saque(valorTransferencia)){
            recebedor.deposito(valorTransferencia);
        }
    }

    public static int getTotalContas (){
        return Conta.contas;
    }

    @Override
    public String toString() {
        return "Conta: " + this.numero + " agência: " + this.agencia +
                "\nTitular: " + this.titular.getNome() +
                "\nSaldo: " + this.saldo + "\n"
                ;
    }
}
