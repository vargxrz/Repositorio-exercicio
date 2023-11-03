import java.util.Scanner;

/*
3) Desenvolver um algoritmo que leia um número não determinado de valores e calcule e escreva a
média aritmética dos valores lidos, a quantidade de valores positivos, a quantidade de valores
negativos e o percentual de valores negativos e positivos.
 */
public class Exercicio3 {
    public static void main(String[] args) {

        float qntPositivos = 0;
        float qntNegativos = 0;
        float media = 0;
        float percentPositivo = 0;
        float porcentNegativo = 0;
        float soma = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja informar um número (sim / nao) 1 para sim e 0 para não:");
        int opcao = scanner.nextInt();

        while(opcao != 0) {
            System.out.println("Informe um novo numero: ");
            int numero = scanner.nextInt();
            if (numero < 0) {
                qntNegativos++;
            } else {
                qntPositivos++;
            }
            soma += numero;
            System.out.println("Deseja informar um novo número (sim / nao) 1 para sim e 0 para não:");
            opcao = scanner.nextInt();
        }
        System.out.println("A quantidade de numeros positivos é: " + qntPositivos);
        System.out.println("A quantidade de numeros negativos é: " + qntNegativos);

        media = soma / (qntPositivos + qntNegativos);

        System.out.println("media = " + media);
 percentPositivo = (qntPositivos / (qntNegativos + qntPositivos)) * 100;
        porcentNegativo = (qntNegativos / (qntNegativos + qntPositivos)) * 100;

        System.out.println("O percentual positivo é de: " + percentPositivo);
        System.out.println("O percentual negativo é de: " + porcentNegativo);



    }
}
