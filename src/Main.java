public class Main {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Livros livro1 = new Livros();

        pessoa1.nome = "paulo";
        pessoa1.idade = 32;
        livro1.titulo = "Lord of the Rings";
        livro1.autor = "J.R.R Tolkien";

        pessoa1.mensagem();
        livro1.infoLivro();

    }

}