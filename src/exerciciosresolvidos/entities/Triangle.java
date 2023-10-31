package entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public double area (){
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public double nExist () {
        if (a + b < c && a + c < b && b + c < a) {
            System.out.println("Esse triângulo não existe");
        }
    }
}
