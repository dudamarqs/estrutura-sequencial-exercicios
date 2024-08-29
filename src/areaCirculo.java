package src;
import javax.swing.JOptionPane;

public class areaCirculo {
    public static void main(String[] args) {
        final float PI = 3.14f; // define a constante PI

        String inputRaio = JOptionPane.showInputDialog("Informe o valor do raio do cículo: ");
        
        float raio = Float.parseFloat(inputRaio); // converte a String para float
        float area = PI * raio * raio; // calcula a área do círculo

        String resultado = String.format("Área do círculo: %.4f", area); // formata a mensagem com 4 casas decimais
        JOptionPane.showMessageDialog(null, resultado); // mostra a mensagem
    }
}
