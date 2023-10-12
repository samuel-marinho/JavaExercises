package exerciciosresolvidos;

import java.util.Scanner;

public class OpwInt {
    public static void main(String[] args) {
        /* Operações com valores inteiros */;
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int resultado = x+y;

        System.out.printf("A soma entre %d e %d é %d", x, y, resultado);
        sc.close();
    }
}