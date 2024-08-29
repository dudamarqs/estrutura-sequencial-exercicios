package src;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class aumentoSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputSalario = JOptionPane.showInputDialog("Informe o valor do salário do funcionário:");

        // converte o salario para float
        float salario = Float.parseFloat(inputSalario);

        // realiza o cáculo do aumento
        float aumento = 15 / 100.0f;
        float aumentoSalario = salario * aumento;
        float novoSalario = salario + aumentoSalario;

        // formata e mostra a mesnagem na tela
        String mensagem = String.format("O funcionário, que costumava receber R$ %.2f, passará a receber R$ %.2f após o aumento de 15%%.", salario, novoSalario);
        JOptionPane.showMessageDialog(null, mensagem);

        sc.close();
    }
}
