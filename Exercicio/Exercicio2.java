import java.util.Scanner;

/*
Desenvolver um algoritmo que leia a altura de 15 pessoas. Este programa deverá calcular e
mostrar :
a. A menor altura do grupo;
b. A maior altura do grupo;
 */
public class Exercicio2 {
    public static void main(String[] args) {
        float alturaInformada, maiorAltura, menorAltura = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a altura do cliente: ");
        alturaInformada = entrada.nextFloat();
        maiorAltura = alturaInformada;
        menorAltura = alturaInformada;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a altura do cliente: ");
            alturaInformada = entrada.nextFloat();
            if (alturaInformada < menorAltura) {
                menorAltura = alturaInformada;
            } else if (alturaInformada > maiorAltura) {
                maiorAltura=alturaInformada;

            }
        }
        System.out.println("A menor altura informada é:" + menorAltura);
        System.out.println("A maior altura informada é: " + maiorAltura);
    }
}