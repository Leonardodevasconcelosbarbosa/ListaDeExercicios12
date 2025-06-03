package exercicios;

import java.util.Scanner;

public class NumerosTriangulares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de termos (N): ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int triangular = i * (i + 1) / 2;
            System.out.println("Termo " + i + ": " + triangular);
        }

        sc.close();
    }
}