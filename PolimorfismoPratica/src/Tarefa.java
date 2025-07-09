public class Tarefa {

    private String descrição;
    private int prioridade;
    private boolean concluida;

    public void tarefa(String descricao){
        this.descrição = descricao;
    }

    public void tarefa(String descricao, int prioridade){
        this.descrição = descrição;
        this.prioridade = prioridade;
    }

    public void tarefa(String descricao, int prioridade, boolean concluida){
        this.descrição = descricao;
        this.prioridade = prioridade;
        this.concluida = concluida;
    }

    public void exibir(String descrição){
        System.out.println(descrição);
    }

    public void exibir(String descrição, int prioridade){
        System.out.println("Descrição: " + descrição);
        switch (prioridade){
            case 1:
                System.out.println("pauta fria");
                break;
            case 2:
                System.out.println("não tão urgente");
                break;
            case 3:
                System.out.println("urgente");
                break;
            case 4:
                System.out.println("EXCLUSIVA!!!");
        }
    }

    public void exibir(){

    }

}
