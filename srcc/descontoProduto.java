package srcc;

import java.util.Scanner;

public class descontoProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o nome do produto: ");
        String nomeProduto = sc.nextLine();

        System.out.println("Informe o valor de " + nomeProduto + ":");
        float valorInicialProduto = sc.nextFloat();

        System.out.println("Informe (em %) de quanto será o desconto: ");
        float desconto = sc.nextFloat();

        float valorDesconto = (desconto / 100) * valorInicialProduto;
        float valorFinalProduto = valorInicialProduto - valorDesconto;

        System.out.println(String.format("O produto %s antes custava R$ %.2f e, após o desconto de %.0%%, passou a custar R$ %.2f", nomeProduto, valorInicialProduto, desconto, valorFinalProduto));

        sc.close();
    }
}
