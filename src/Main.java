public class Main {
    public static void main(String[] args) {
        Titular pedro = new Titular("Pedro Martins", "000.111.222.33");
        Titular cassia = new Titular("Cassia Senna", "333.444.555.55");

        Conta contaPedro = new Conta(375, 1392, 24839, pedro);
        Conta contaCassia = new Conta(200, 1231, 32452, cassia);

        contaCassia.saque(30);
        contaPedro.deposito(30);

        contaPedro.transferencia(50, contaCassia);

        System.out.println(contaPedro);
        System.out.println(contaCassia);
        System.out.println("Total de contas: " + Conta.getTotalContas());

    }
}
