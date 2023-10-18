import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma opção: ");
        System.out.println("1.Álcool, 2.Gasolina, 3.Diesel, 4.Sair");
        int cod = sc.nextInt();
        int alc = 0;
        int gas = 0;
        int die = 0;


        while (cod!=4){
            if (cod == 1){
                alc = alc + 1;
            }
            else if (cod == 2) {
                gas = gas + 1;
            }
            else if (cod==3) {
                die = die + 1;
            }
            else if (cod>4) {
                System.out.print("Código inválido, digite novamente: ");
            }
            cod = sc.nextInt();
            }
        System.out.println("Muito Obrigado!");
        System.out.println("Álcool: " + alc);
        System.out.println("Gasolina: " + gas);
        System.out.println("Diesel: " + die);
        }
    }

