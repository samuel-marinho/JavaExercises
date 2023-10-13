package exerciciosresolvidos;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        /* Fazer um programa que leia três valores com ponto flutuante de
         * dupla precisão: A, B e C. Em seguida, calcule e mostre:
         * a) a área do triângulo retângulo que tem A por base e C por altura.
         * b) a área do círculo de raio C. (pi = 3.14159)
         * c) a área do trapézio que tem A e B por bases e C por altura.
         * d) a área do quadrado que tem lado B.
         * e) a área do retângulo que tem lados A e B.
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        double A = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double B = sc.nextDouble();
        System.out.println("Digite o terceiro valor: ");
        double C = sc.nextDouble();
        double pi = 3.14159;
        double areaTria = (A * C) / 2;
        double areaCir = pi * Math.pow(C,2);
        double areaTrap = ((A+B)*C)/2;
        double areaQuad = Math.pow(B,2);
        double areaRet = A*B;

        System.out.printf("A area do Triangulo é: %.3f%n", areaTria);
        System.out.printf("A area do Circulo é: %.3f%n", areaCir);
        System.out.printf("A area do Trapezio é: %.3f%n", areaTrap);
        System.out.printf("A area doQuadrado é: %.3f%n", areaQuad);
        System.out.printf("A area do Retangulo é: %.3f%n", areaRet);


    }
}
