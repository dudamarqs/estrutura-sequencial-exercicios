package srcc;

import javax.swing.JOptionPane;

public class mensagem {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        String anoNasc = JOptionPane.showInputDialog("Em que ano você nasceu?");

        int anoNascInt = Integer.parseInt(anoNasc);

        int idade;
        idade = 2024 - anoNascInt;
        JOptionPane.showMessageDialog(null, "Você se chama " + nome + " e tem " + idade + " anos.");
    }
}
