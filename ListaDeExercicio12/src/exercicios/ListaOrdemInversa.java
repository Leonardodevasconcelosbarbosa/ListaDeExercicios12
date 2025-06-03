package exercicios;

import java.util.Scanner;

public class ListaOrdemInversa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite a quantidade de elementos da lista: ");
        int tamanho = sc.nextInt();

       
        int[] lista = new int[tamanho];

       
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            lista[i] = sc.nextInt();
        }

       
        System.out.println("\nElementos em ordem inversa:");
        for (int i = tamanho - 1; i >= 0; i--) {
            System.out.println(lista[i]);
        }

        sc.close();
    }
}