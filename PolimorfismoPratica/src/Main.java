public class Main{

    public static void main(String[] args) {

        Calculadora somar = new Calculadora();

        System.out.println(somar.somar(10, 20));
        System.out.println(somar.somar(5, 10, 25));
        System.out.println(somar.somar(2.5, 2.5));

        Mensagem noticia = new Mensagem();

        noticia.enviar("A mulher está gravida");
        noticia.enviar("A mulher está sentindo contrações", "Pai");
        noticia.enviar("A mulher entrou em trabalho de parto", "Pai", true);

        Agenda agenda = new Agenda();

        agenda.adicionar("Atualizar contas", 9, false);

        Tarefa tarefa = new Tarefa();

        tarefa.exibir("Garantido campeão", 4);

    }

}