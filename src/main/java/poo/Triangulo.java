package poo;

public class Triangulo {

    public Triangulo() {
    }

    /**
     *
     * @param a lado do triangulo
     * @param b lado do triangulo
     * @param c lado do triangulo
     * @return
     */
    public String tipoTriangulo(int a, int b, int c){

        if(a <=0  || b <=0 || c <= 0){
            return "Não é um triângulo";
        }
        else if(a < 0 || b < 0 || c < 0){
            return "Não é um triângulo";
        }
        //-------------------------------
        else if (a >= (b + c)){
            return "Não é um triângulo";
        }
        else if (b >= (c + a)){
            return "Não é um triângulo";
        }
        else if (c >= (a + b)) {
            return "Não é um triângulo";
        }
        // Condição para ser Equilátero
        //-------------------------------
        else if(a == b && b == c){
            return "É um triângulo Equilátero";
        }
        //Condição para ser Isósceles
        //-------------------------------
        else if(a != b && b != c && c !=a ){
            return "É um triângulo Escaleno";
        }
        //Se não será  Isósceles
        return "É um triângulo Isósceles";

    }
}
