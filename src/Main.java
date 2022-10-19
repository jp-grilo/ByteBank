public class Main {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        Conta segundaConta = new Conta();

        primeiraConta.saldo = 200;
        System.out.println("Saldo: " + primeiraConta.saldo);

        Conta contaReferencia = primeiraConta;

        contaReferencia.saldo=300;
        System.out.println("Saldo dentro da primeira conta: " + primeiraConta.saldo +
                "\nSaldo dentro da conta referencia: " + contaReferencia.saldo);

        System.out.println("As contas primeiraConta e contaReferencia são a mesma coisa?\nR: " + primeiraConta.equals(contaReferencia));
        System.out.println("As contas primeiraConta e segundaConta são a mesma coisa?\nR: " + primeiraConta.equals(segundaConta));

    }
}
