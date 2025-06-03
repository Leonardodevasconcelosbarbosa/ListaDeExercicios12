package exercicios;

import java.util.Scanner;

public class SomaDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        String numeroStr = sc.nextLine();

        int soma = 0;
        for (int i = 0; i < numeroStr.length(); i++) {
            char c = numeroStr.charAt(i);
          
            if (Character.isDigit(c)) {
                soma += c - '0'; 
            }
        }

        System.out.println("A soma dos dígitos é: " + soma);
        sc.close();
    }
}