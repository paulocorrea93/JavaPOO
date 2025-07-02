public class Pessoa {

    private String nome;

    public void setNome(){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void apresentar(){
        System.out.println("Olá " + nome + " seja bem-vindo(a)");
    }

}
