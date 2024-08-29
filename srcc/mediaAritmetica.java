package srcc;

import java.util.Scanner;

public class mediaAritmetica {

    public static void main(String[] args) {
        final int TAM = 5;
        Scanner sc = new Scanner(System.in);
        
        double valores[] = new double[TAM];
        double soma = 0;

        System.out.println("Digite 5 valores para calcular a média aritmética:");
        for (int i = 0; i < TAM; i++) {
            System.out.printf("Digite o " + (i+1) + "º valor: ");
            valores[i] = sc.nextDouble();
            soma += valores[i];
        }

        double media = soma / TAM;

        System.out.println("\nOs valores digitados foram: ");
        for (int i = 0; i < TAM; i++) {
            System.out.println(valores[i]);
        }

        System.out.println("\nMédia aritmética: " + media);

        sc.close();
    }
}