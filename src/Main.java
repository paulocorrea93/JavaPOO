public class Main {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Paulooo", 332);
        Aluno aluno1 = new Aluno("PauloCorrea", "CDC", 9.99);
        Aluno aluno2 = new Aluno("Gabriels", "Eng Soft", 9.98);
        Produto celular = new Produto("Motorola", 2000.00);
        Livros lotr = new Livros("Tolkien", "Lord of the Rings", 1973);
        ContaBancaria paulo = new ContaBancaria("Pauuulo", 2500);
        Pet dog = new Pet("Osvaldo", "Cachorro", 5);
        Retangulo quad = new Retangulo(50,50);

        pessoa1.mensagem();
        aluno1.mostrarAluno();
        aluno2.mostrarAluno();
        celular.infoProduto();
        lotr.infoLivro();
        paulo.exibirSaldo();
        paulo.depositar(100);
        paulo.exibirSaldo();
        paulo.sacar(50);
        paulo.exibirSaldo();
        paulo.depositar(300);
        paulo.exibirSaldo();
        paulo.sacar(3000);
        dog.mostrar();
        dog.envelhecer();
        dog.mostrar();
        quad.dimensoes();
        System.out.println(quad.area());

    }

}