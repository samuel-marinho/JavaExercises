package exerciciosresolvidos;

import java.util.Locale;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("COD.     |       ESPECIFICAÇÃO         |    PREÇO    ");
        System.out.println("   1     |       CACHORRO QUENTE       |    R$7,00   ");
        System.out.println("   2     |       X-SALADA              |    R$9,50   ");
        System.out.println("   3     |       X-BACON               |    R$10,00  ");
        System.out.println("   4     |       TORRADA SIMPLES       |    R$4,00   ");
        System.out.println("   5     |       REFRIGERANTE          |    R$4,00   ");
        System.out.println();
        System.out.println("Digite o código do item e a quantidade desejada: ");
        int menu = sc.nextInt();
        int qntd = sc.nextInt();
        double total;

        if (menu==1){
            total = qntd * 7;
        }
        else if (menu == 2) {
            total = qntd * 9.5;
        }
        else if (menu == 3) {
            total = qntd * 10;
        }
        else if (menu == 4) {
            total = qntd * 4;
        }
        else {
            total = qntd * 4;
        }
        System.out.printf("Total da compra: %.2f%n", total);
        sc.close();
    }
}
