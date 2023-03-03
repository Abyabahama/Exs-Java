package Exercicios;

import javax.swing.JOptionPane;

public class ex7 {
    public static void main(String[] args) {
        double anos;
        double meses;
        double dias;
        double idade;

        anos = 
        Double.parseDouble(JOptionPane.showInputDialog("Quantos anos você tem?"));

        meses =
        Double.parseDouble(JOptionPane.showInputDialog("Quantos meses você tem?"));

        dias =
        Double.parseDouble(JOptionPane.showInputDialog("Quantos dias você tem?"));

        idade = anos*365 + meses*30 + dias;

        JOptionPane.showMessageDialog(null, "Sua idade total em dias é de " + idade);
        
    }
}
