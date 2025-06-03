package exercicios;

import java.util.Scanner;

public class MediaAteNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int contador = 0;

        for (;;) { 
            System.out.print("Digite um número (negativo para parar): ");
            int num = sc.nextInt();

            if (num < 0) {
                break;
            }

            soma += num;
            contador++;
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("Média dos números digitados: " + media);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }

        sc.close();
    }
}