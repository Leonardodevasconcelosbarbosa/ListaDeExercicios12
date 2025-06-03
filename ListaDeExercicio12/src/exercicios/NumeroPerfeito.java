package exercicios;

import java.util.Scanner;

public class NumeroPerfeito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        int somaDivisores = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                somaDivisores += i;
            }
        }

        if (somaDivisores == num && num > 0) {
            System.out.println(num + " é um número perfeito.");
        } else {
            System.out.println(num + " não é um número perfeito.");
        }

        sc.close();
    }
}