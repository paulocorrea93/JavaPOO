public class Produto {

    String nome;
    double preco;

    Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    void infoProduto(){
        System.out.println(nome + ": " + preco);
    }

}
