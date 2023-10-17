package exerciciosresolvidos;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        /* Tabela de imposto de renda */
        Scanner sc = new Scanner(System.in);

        double imposto;

        System.out.println("===========================================");
        System.out.println("              TABELA IRPF 2023             ");
        System.out.println("===========================================");
        System.out.println();
        System.out.println("Renda                         | IR a pagar ");
        System.out.println("de 0 até R$2.112,00           |    ISENTO  ");
        System.out.println("de R$2.112,01 até R$2.826,65  |     7,5%   ");
        System.out.println("de R$2.826,66 até R$3.751,05  |      15%   ");
        System.out.println("de R$3.751,06 até R$4.664,68  |    22,5%   ");
        System.out.println("Acima de R$4.664,68           |    27,5%   ");

        System.out.println();
        System.out.println("Digite o seu salário: ");
        double salario = sc.nextDouble();

        if (salario <= 2112){
            System.out.println("ISENTO");
        }
        else if (salario <= 2826.65) {
            imposto = (salario-2112)*0.075;
            System.out.printf("Você deve R$ %.2f de imposto", imposto);
        }
        else if (salario <= 3751.05) {
            imposto = (salario - 2826.65) * 0.15 + (714.65*0.75);
            System.out.printf("Você deve R$ %.2f de imposto", imposto);
        }
        else if (salario <= 4664.68) {
            imposto = (salario-3751.05)*0.225 + (924.39*0.15) + (714.65*0.75);
            System.out.printf("Você deve R$ %.2f de imposto", imposto);
        }
        else if (salario > 4664.68) {
            imposto = (salario-4664.68)*0.275+ (913.62*0.225) +(924.39*0.15)+(714.65*0.75);
            System.out.printf("Você deve R$ %.2f de imposto", imposto);
        }
        sc.close();
    }
}
