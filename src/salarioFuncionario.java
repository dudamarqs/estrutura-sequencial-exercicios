package src;

import java.util.Scanner;

public class salarioFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horasTrabalhadas;
        float valorPorHora;

        System.out.printf("Informe a quantidade de horas trabalhadas por semana: ");
        horasTrabalhadas = sc.nextInt();

        System.out.printf("Informe o valor pago por hora trabalhada: R$ ");
        valorPorHora = sc.nextFloat();

        float salario;
        salario = horasTrabalhadas * valorPorHora;
        System.out.println(String.format("\nPor semana, o funcionário recebe: R$ %.2f", salario));

        sc.close();
    }
}
