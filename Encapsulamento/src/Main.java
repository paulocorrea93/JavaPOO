public class Main {

    public static void main(String[] args) {

       // Conta paulo = new Conta("Paulo", 2500);
        Fucionario pg = new Fucionario("Paaaulo", 2500);

//        System.out.println("Titular: " + paulo.getTitular());
//        System.out.println("Saldo atual: R$" + paulo.getSaldo());
//
//       paulo.setSaldo(1000);
//
//        System.out.println("Saldo atual: R$" + paulo.getSaldo());

        pg.exibirInfo();
        pg.setSalario(3000);
        pg.exibirInfo();
        pg.setSalario(-1000);

    }

}