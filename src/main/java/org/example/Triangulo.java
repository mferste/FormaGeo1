package org.example;

public class Triangulo {

    public static String classificarTriangulo(int lado1, int lado2, int lado3) {
        // Verifica se algum dos lados é inválido
        if (lado1 == 0 || lado2 <= 0 || lado3 <= 0) {
            return "Erro: Lado inválido";
        }

        // Verifica se os valores não formam um triângulo
        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            return "Erro: Não forma triângulo";
        }

        // Classifica o triângulo
        if (lado1 == lado2 && lado2 == lado3) {
            return "Triângulo Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Triângulo Isósceles";
        } else {
            return "Triângulo Escaleno";
        }
    }

    public static void main(String[] args) {
        /*
        // Equilátero (C1)
        System.out.println(Triangulo.classificarTriangulo(Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE));
        System.out.println(Triangulo.classificarTriangulo(0,0,0));
        System.out.println(Triangulo.classificarTriangulo(Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE));

        //IsóscelesAB (C2)
        System.out.println(Triangulo.classificarTriangulo(Integer.MIN_VALUE,Integer.MIN_VALUE,1));

        System.out.println(Triangulo.classificarTriangulo(A,A,A));

        // NFTAB
         System.out.println(Triangulo.classificarTriangulo(2,10,2));

    */
    }
}

