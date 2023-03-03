package Exercicios;

import javax.swing.JOptionPane;

public class ex4 {
    public static void main(String[] args) {
        double a;
        double b;

        a = 
        Double.parseDouble(JOptionPane.showInputDialog("Digite o número desejado"));

        b = a-1;

        JOptionPane.showMessageDialog(null, "O valor de " + a + " menos 1 é " + b);
    }
}
