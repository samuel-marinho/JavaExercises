package exerciciosresolvidos;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        /* Calculadora de salário por horas trabalhadas*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu número: ");
        int fNum = sc.nextInt();
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        double h = sc.nextDouble();
        System.out.println("Digite o valor de sua hora: ");
        double hValue = sc.nextDouble();
        double salary = h * hValue;

        System.out.println("Número: " + fNum);
        System.out.printf("Seu salário será de U$ %.2f%n", salary);



        sc.close();
    }
}
