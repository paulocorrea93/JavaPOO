public class ContaBancaria {

    String titular;
    double saldo;

    ContaBancaria(String titular, double saldo){
        this.saldo = saldo;
        this.titular = titular;
    }

    void depositar(double deposito){
        this.saldo = this.saldo+deposito;
    }

    void sacar(double retirado){

        if(retirado < this.saldo){
        this.saldo = this.saldo-retirado;
        } else {
            System.out.println("Valor insulficiente");
        }
    }

    void exibirSaldo(){
        System.out.println("Olá " + this.titular + " seu saldo atual é: R$" + this.saldo);
    }

}
