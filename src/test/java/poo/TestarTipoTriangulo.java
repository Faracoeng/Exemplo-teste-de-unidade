package poo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestarTipoTriangulo {


    @Test
    public void testaTipoTriangulo(){
        Triangulo obj = new Triangulo();
        //entrada nula
        assertEquals("Lados devem ser != 0","Não é um triângulo",obj.tipoTriangulo(0,0,0));
        assertEquals("Lados devem ser != 0","Não é um triângulo",obj.tipoTriangulo(10,0,10));
        assertEquals("Lados devem ser != 0","Não é um triângulo",obj.tipoTriangulo(10,10,0));
        assertEquals("Lados devem ser != 0","Não é um triângulo",obj.tipoTriangulo(0,10,10));
        //sucesso
        assertEquals("É um triangulo Equilatero","É um triângulo Equilátero", obj.tipoTriangulo(4,4,4));
        // não é um triangulo
        assertEquals("soma de dois lado deve ser menor que o terceiro","Não é um triângulo",obj.tipoTriangulo(5,3,1));
        assertEquals("soma de dois lado deve ser menor que o terceiro","Não é um triângulo",obj.tipoTriangulo(1,5,3));
        assertEquals("soma de dois lado deve ser menor que o terceiro","Não é um triângulo",obj.tipoTriangulo(1,2,3));
        //valores negativos
        assertEquals("não permitido valores negativos","Não é um triângulo",obj.tipoTriangulo(-1,-1,-1));
        assertEquals("não permitido valores negativos","Não é um triângulo",obj.tipoTriangulo(5,-1,-1));
        assertEquals("não permitido valores negativos","Não é um triângulo",obj.tipoTriangulo(-1,5,5));
        assertEquals("não permitido valores negativos","Não é um triângulo",obj.tipoTriangulo(5,-1,5));
        assertEquals("não permitido valores negativos","Não é um triângulo",obj.tipoTriangulo(5,5,-1));
        // escaleno
        assertEquals("escaleno","É um triângulo Escaleno",obj.tipoTriangulo(2,5,4));
        assertEquals("escaleno","É um triângulo Escaleno",obj.tipoTriangulo(5,2,4));
        assertEquals("escaleno","É um triângulo Escaleno",obj.tipoTriangulo(4,5,2));
        // isósceles
        assertEquals("escaleno","É um triângulo Isósceles",obj.tipoTriangulo(5,5,4));
        assertEquals("escaleno","É um triângulo Isósceles",obj.tipoTriangulo(4,5,5));
        assertEquals("escaleno","É um triângulo Isósceles",obj.tipoTriangulo(5,4,5));

    }
}
