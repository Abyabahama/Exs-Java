package Exercicios;

import javax.swing.JOptionPane;

public class ex8 {
    public static void main(String[] args) {
        double total;
        double branco;
        double nulo;
        double valido;

        total =
        Double.parseDouble(JOptionPane.showInputDialog("Quantos eleitores votaram nesta cidade"));

        branco =
        Double.parseDouble(JOptionPane.showInputDialog("Quantos votos foram brancos?"));

        nulo = 
        Double.parseDouble(JOptionPane.showInputDialog("Quantos votos foram nulos?"));

        valido = total - nulo - branco;

        JOptionPane.showMessageDialog(null, "O valor percentual de votos válidos foram " + valido/total*100 + "% brancos foram " + branco/total*100 + "% e nulos foram " + nulo/total*100 + "%" );
    }
}
