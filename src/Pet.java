public class Pet {

    String nome;
    String tipo;
    int idade;

    Pet(String nome, String tipo, int idade){
        this.nome = nome;
        this.tipo = tipo;
        this.idade = idade;
    }

    void envelhecer(){
        this.idade = this.idade + 1;
    }

    void mostrar(){
        System.out.println("O " + tipo + " " + nome + " tem " + idade + " anos.");
    }

}
