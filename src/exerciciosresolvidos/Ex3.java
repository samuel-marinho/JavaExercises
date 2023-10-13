package exerciciosresolvidos;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        /* Descobrindo a diferença entre produtos*/
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o 1º número: ");
        int A = sc.nextInt();
        System.out.printf("Digite o 2º número: ");
        int B = sc.nextInt();
        System.out.printf("Digite o 3º número: ");
        int C = sc.nextInt();
        System.out.printf("Digite o 4º número: ");
        int D = sc.nextInt();

        int dif = ((A*B)-(C*D));
        System.out.println("DIFERENÇA = " + dif);
        sc.close();




    }
}
