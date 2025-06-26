public class Pessoa {

    String nome;
    int idade;

    Pessoa(String n, int i){
        nome = n;
        idade = i;
    }

    public void mensagem(){
        System.out.println("olá " + nome + " você tem " + idade + " anos.");
    }

}
