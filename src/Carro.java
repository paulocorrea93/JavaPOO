public class Carro {

    String marca;
    Double velocidade;

    double acelerar(double acelerador){
        return velocidade =  velocidade + acelerador;
    }

    double frear(double frear){
        return velocidade = velocidade - frear;
    }

    void mostrarStatus(){
        System.out.println("O " + marca + " tem a velocidade atual de: " + velocidade + "km/h");
    }

}
