/*
Escrever um algoritmo que leia uma quantidade desconhecida de números e conte quantos deles
estão nos seguintes intervalos: ,[0-25] [26-50], [51-75] e [76-100]. A entrada de dados deve
terminar quando for lido um número negativo.
 */
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {


        int contagem1 = 0;
        int contagem2 = 0;
        int contagem3 = 0;
        int contagem4 = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.println("informe um numero: ");
        int n = scanner.nextInt();

        while (n >= 0 ) {
            if (n <= 25) {
                contagem1++;
            } else if (n <= 50) {
                contagem2++;
            } else if (n <= 75) {
                contagem3++;
            } else if (n <= 100) {
                contagem4++;
            }
            System.out.println("Informe um novo numero: ");
            n = scanner.nextInt();
        }
            System.out.println("A quantidade de numeros entre 0 e 25 é " + contagem1);
            System.out.println("A quantidade de numeros entre 26 e 50 é " + contagem2);
            System.out.println("A quantidade de numeros entre 51 e 75 é " + contagem3);
            System.out.println("A quantidade de numeros entre 76 e 100 é " + contagem4);



    }
}








