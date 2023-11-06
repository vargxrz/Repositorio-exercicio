/*
Faça um algoritmo estruturado que leia uma quantidade não determinada de números positivos.
Calcule a quantidade de números pares e ímpares, a média de valores pares e a média geral dos
números lidos. O número que encerrará a leitura será zero.
 */

import javax.swing.*;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        double numero;
        double soma = 0;
        double somaPar = 0;

        int numerosPares = 0;
        int numerosImpares = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número (0 para encerrar):");

        while ((numero = scanner.nextInt()) != 0) {
            soma += numero;

            if (numero % 2 == 0) {
                numerosPares++;
                somaPar += numero;
            } else {
                numerosImpares++;
            }

            System.out.println("Deseja escrever um novo numero? (0 para encerrar) ");

        }

        if (numerosPares > 0) {

            double mediaPares = somaPar / numerosPares;
            System.out.println("media dos valores pares: " + mediaPares);

            double mediaGeral = soma / (numerosPares + numerosImpares);
            System.out.println("media geral: " + mediaGeral);
        }

        System.out.println("Quantidade de números pares: " + numerosPares);
        System.out.println("Quantidade de números ímpares: " + numerosImpares);
    }
}















