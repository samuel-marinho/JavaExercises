package exerciciosresolvidos;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        /* Calcular o valor total na compra de duas peças
         * cadastrando seu código e determinando sua quantidade
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código da peça 1: ");
        int p1 = sc.nextInt();
        System.out.println("Digite a quantidade de peças 1: ");
        int np1 = sc.nextInt();
        System.out.println("Digite o valor da peça 1: ");
        double pValue1 = sc.nextDouble();

        System.out.println("Digite o código da peça 2: ");
        int p2 = sc.nextInt();
        System.out.println("Digite a quantidade de peças 2: ");
        int np2 = sc.nextInt();
        System.out.println("Digite o valor da peça 2: ");
        double pValue2 = sc.nextDouble();

        double  valorTotal = (np1*pValue1+np2*pValue2);

        System.out.printf("Valor total a pagar: R$ %.2f%n", valorTotal);
        sc.close();
    }
}
