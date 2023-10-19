import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        /*Verificar quantos números estão dentro do intervalo
         *[10, 20]
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de repetições entre 1 e 10: ");
        int x = sc.nextInt();
        int contIn = 0;
        int contOut = 0;
        for (int cont=0;cont<x; cont++){
            int n = sc.nextInt();
            if (n>=10 && n<=20) {
                contIn=contIn+1;
            }
            else{
                contOut=contOut+1;
            }
        }
        System.out.println(contIn + " in");
        System.out.println(contOut + " out");
        sc.close();
    }
}
