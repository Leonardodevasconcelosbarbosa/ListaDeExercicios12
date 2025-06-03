package exercicios;

import java.util.Scanner;

public class PrimosNoIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número inicial do intervalo: ");
        int inicio = sc.nextInt();

        System.out.print("Digite o número final do intervalo: ");
        int fim = sc.nextInt();

        System.out.println("Números primos entre " + inicio + " e " + fim + ":");

        for (int i = inicio; i <= fim; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        sc.close();
    }
    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}