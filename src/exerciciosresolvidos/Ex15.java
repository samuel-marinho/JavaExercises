import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite as medidas do triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Digite as medidas do triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a+x.b+x.c)/2;
        double areaX = Math.sqrt(p*(p-x.a)*(p-x.b)*(p-x.c));
        p = (y.a+y.b+y.c)/2;
        double areaY = Math.sqrt(p*(p-y.a)*(p-y.b)*(p-y.c));

        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);

        if (areaX>areaY){
            System.out.println("A maior área é do X");
        }
        else {
            System.out.println("A maior área é do Y");
        }
    }
}
