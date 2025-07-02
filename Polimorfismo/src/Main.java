public class Main{

    public static void main(String[] args) {

//        Aluno a1 = new Aluno();
//
//        a1.estudar();
//        a1.apresentar();

        Aluno a1 = new Aluno("Paulooo");

        Bicicleta bike = new Bicicleta();
        Veiculo moto = new Veiculo();

        bike.mover();
        bike.pedalar();

//        moto.pedalar();

        Livro hobbit = new Livro();
        hobbit.preco = 30;

        hobbit.aplicarDesconto(10);
        hobbit.verPreco();

        Gerente fun1 = new Gerente();
        fun1.setSalario(25000);
        fun1.mostrarSalario();

    }

}