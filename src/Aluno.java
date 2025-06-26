public class Aluno {

    String nome;
    String curso;
    double nota;

    Aluno(String n, String c, double nt){
        nome = n;
        curso = c;
        nota = nt;
    }

    void mostrarAluno(){
        System.out.println(nome + ", matriculado no curso: " + curso + " sua nota final foi: " + nota);
    }

}
