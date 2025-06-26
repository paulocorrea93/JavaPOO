public class Conta {

    private String titular;
    private double saldo;

    Conta(String titular, double saldo){
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getTitular(){
        return this.titular;
    }

    public void setTitular(String novoTitular){
        this.titular = novoTitular;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double novoSaldo){
        if(novoSaldo >= 0){
            this.saldo = novoSaldo;
        }
    }

}
