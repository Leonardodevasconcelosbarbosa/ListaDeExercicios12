package exercicios;

import java.util.Scanner;

public class ContaZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Digite um número inteiro: ");
        String numero = sc.nextLine();

        int contadorZeros = 0;

      
        for (int i = 0; i < numero.length(); i++) {
            if (numero.charAt(i) == '0') {
                contadorZeros++;
            }
        }

    
        System.out.println("Quantidade de zeros no número: " + contadorZeros);

        sc.close();
    }
}