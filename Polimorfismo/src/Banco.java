public class Banco {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        cc.saldo = 2000;
        cc.verSaldo();
        cc.depositar(500);
        cc.verSaldo();

    }

}
