import java.util.Locale;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    char resp;
    do {
        System.out.print("Digite a temperatura em Celcius: ");
        double tempC = sc.nextDouble();
        double tempF = 9 * tempC / 5 + 32;
        System.out.printf("Equivalente em Fahrenheit:  %.1f%n", tempF);
        System.out.println("Deseja repetir? S/N");
        resp = sc.next().charAt(0);
    }
    while (resp != 'N');
    sc.close();
    }
}
