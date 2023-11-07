import java.util.Scanner;
//(int i = 10; i <= 1; i--)
public class exercicio10 {
    public static void main(String[] args) {

        int valor = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int a = scanner.nextInt();

        for (int i = a; i >= 1; i--) {
            valor *= i;


            System.out.println(valor);


        }
    }
}