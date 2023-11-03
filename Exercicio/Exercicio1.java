/*
Desenvolver um algoritmo que efetue a soma de todos os números ímpares que são múltiplos de
três e que se encontram no conjunto dos números de 1 até 500.
 */

public class Exercicio1 {
    public static void main(String[] args) {
int somaMultiploTres = 0;
int somaMultiploCinco = 0;
        for (int numero = 1; numero <=20 ; numero++) {
            if (numero % 2 == 1){
                if (numero % 3 == 0){
                    somaMultiploTres += numero;
                }
            }
            if (numero % 2 == 0){
                if (numero % 5 == 0){
                    somaMultiploCinco += numero;
                }

            }
        }
        System.out.println("A soma dos numeros impares multiplos de tres é: " + somaMultiploTres);
        System.out.println("A soma dos numeros pares multiplos de cinco é: " + somaMultiploCinco);

    }
}
