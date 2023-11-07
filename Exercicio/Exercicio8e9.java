import java.util.Scanner;

public class Exercicio8e9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorPa;
        int valorPg;
        System.out.print("Digite um valor inicial: ");
        int a = scanner.nextInt();

        System.out.print("Digite a Razão: ");
        int r = scanner.nextInt();

        valorPg = a;
        valorPa = a;
        for (int i = 0; i < 10; i++) {
            valorPa += r; //o valor para ser somado tem que estar dentro do laço pra ele somar somente o R.

            valorPg *= r;

            System.out.println("Os valores de P.A é: " + valorPa);
            System.out.println("Os valores de P.G é: " + valorPg);
            System.out.println("---------------------");
        }
    }
    }

