public class Fucionario {

    private String nome;
    private double salario;
    private boolean ativo;

    Fucionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double novoSalario){
        if(salario > 0){
            this.salario = novoSalario;
        } else {
            System.out.println("Erro: digite um numero maior que 0 (zero)");
        }
    }

    public void exibirInfo(){
        System.out.println("Olá " + nome + " seu saldo atual é: R$" + salario);
    }

}
