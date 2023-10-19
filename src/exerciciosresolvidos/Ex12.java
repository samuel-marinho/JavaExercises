import java.util.Locale;
import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de repetições: ");
        int n = sc.nextInt();

        for (int cont=0; cont<n; cont++){

            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            double nota3 = sc.nextDouble();

            double mediaPond = (nota1*2 + nota2*3 + nota3*5)/10;
            System.out.printf("%.1f",mediaPond);
        }
        sc.close();
    }
}
