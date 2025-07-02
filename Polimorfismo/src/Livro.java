public class Livro extends Produto{

    public void aplicarDesconto(double desconto){
        this.preco -= preco*desconto/100;
    }

}
