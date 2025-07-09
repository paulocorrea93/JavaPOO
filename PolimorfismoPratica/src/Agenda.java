public class Agenda {

    public void adicionar(String descricao){
        System.out.println("Compromisso: " + descricao);
    }

    public void adicionar(String descricao, int horario){
        System.out.println("Compromisso: " + descricao + " às " + horario + "h");
    }

    public void adicionar(String descricao, int horario, boolean urgente){

        if(urgente == true){
        System.out.println("Compromisso: " + descricao + " às " + horario + "h, urgente!");
        } else {
            System.out.println("Compromisso: " + descricao + " às " + horario + "h ");
        }
    }

}
