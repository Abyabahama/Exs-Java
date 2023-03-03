package Exercicios;

import javax.swing.JOptionPane;

public class ex6 {
    public static void main(String[] args) {
        double idade;
        double dias;

        idade =
        Double.parseDouble(JOptionPane.showInputDialog("Insira a sua idade"));

        dias = idade * 365;

        JOptionPane.showMessageDialog(null, "VOcê tem " + dias + " de idade");
    }
}
