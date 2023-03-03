package Exercicios;

import javax.swing.JOptionPane;

public class ex3 {
    public static void main(String[] args) {
        double comi;
        double preço;
        double quant;
        double resultado;

        comi = 0.05;

        preço =
        Double.parseDouble(JOptionPane.showInputDialog("Insira o preço de cada peça"));

        quant =
        Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de peças vendidas"));

        resultado = (quant*preço)*comi;

        JOptionPane.showMessageDialog(null, "O valor pago pelas comissões é de " + resultado);
    }
}
