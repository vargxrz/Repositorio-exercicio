/*
Escrever um algoritmo que gera e escreve os números ímpares entre 100 e 200.
 */
public class Exercicio6 {
    public static void main(String[] args) {
       int totalImpares = 0;
       int somaDosImpares = 0;
        for (int i = 100; i < 200 ; i++) {
            if (i % 2 == 1) {
                totalImpares++;
                somaDosImpares += i;
                System.out.println("numero impar = " + i);
            }
        }

            System.out.println("A soma dos impares é: " + somaDosImpares);
            System.out.println("O total de impares é: " + totalImpares);
          double mediaDosImpares = somaDosImpares / totalImpares;
            System.out.println("A media é: " + mediaDosImpares);

    }
}
