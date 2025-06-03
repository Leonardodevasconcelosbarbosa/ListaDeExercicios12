package exercicios;

import java.util.Scanner;

public class SomaDigitosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número inicial do intervalo: ");
        int inicio = sc.nextInt();

        System.out.print("Digite o número final do intervalo: ");
        int fim = sc.nextInt();

        int somaTotal = 0;

       
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {  
                int numero = i;
                int somaDigitos = 0;

                
                for (; numero != 0; numero /= 10) {
                    somaDigitos += numero % 10;
                }

                somaTotal += somaDigitos;
            }
        }

        
        System.out.println("A soma dos dígitos de todos os números pares entre " + inicio + " e " + fim + " é: " + somaTotal);

        sc.close();
    }
}