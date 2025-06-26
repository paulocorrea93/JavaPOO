public class Retangulo {

    double altura;
    double largura;

    Retangulo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

   double area(){
    return this.largura*this.altura;
   }

   void dimensoes(){
       System.out.println("Largura: " + this.largura + "m | Altura: " + this.altura + "m");
   }


}
