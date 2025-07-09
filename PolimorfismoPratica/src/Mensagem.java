public class Mensagem {

    public void enviar(String texto){
        System.out.println(texto);
    }

    public void enviar(String texto, String destinatario){
        System.out.println(texto + " " + destinatario);
    }

    public void enviar(String texto, String destinatario, boolean urgente){
        System.out.println(texto + " " + destinatario + " :" +urgente);
    }

}
