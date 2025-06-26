public class Funcionario {

    String nome;
    double salario;

    void aplicarAumento(double porcentagem){
        salario = salario + (salario* porcentagem/100);
    }

    void mostrarInfosFuncionario(){
        System.out.println("Olá " + nome);
        System.out.println("Salário atualizado: R$" + salario);
    }

}
