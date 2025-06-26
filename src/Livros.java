public class Livros {

    String autor;
    String titulo;
    int ano;


    Livros(String autor, String titulo, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    void infoLivro(){
        System.out.println("'" + titulo + "' por: " + autor + ". Escrito em: " + ano + ".");
    }



}
