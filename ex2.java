package Exercicios;

import javax.swing.JOptionPane;

public class ex2 {
    public static void main(String[] ars) {

        double a;
        double b;
        double c;
        double d;
        double res;

        a =
        Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro número"));

        b =
        Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número"));

        c =
        Double.parseDouble(JOptionPane.showInputDialog("Insira o terceiro número"));

        d =
        Double.parseDouble(JOptionPane.showInputDialog("Insira o quarto número"));
        
        res = a*a + b*b + c*c + d*d;

        JOptionPane.showMessageDialog(null, "O resultado é igual a " + res);
    }
}
