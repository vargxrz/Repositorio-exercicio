/*
Escreva um algoritmo que leia um valor inicial A e uma razão R e imprima uma seqüência em
P.A. contendo 10 valores.
 */
import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        int total = 0;
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tabuada!! insira um valor: ");
         numero = scanner.nextInt();
        for (int multiplicador = 0; multiplicador <= 10; multiplicador++) {

            total = multiplicador * numero;
            System.out.println(numero + " x " + multiplicador + " = " + total);
        }

    }
}
