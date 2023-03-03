package Exercicios;

import javax.swing.JOptionPane;

public class ex5 {
public static void main(String[] args) {
    double d;
    double h;

    d =
    Double.parseDouble(JOptionPane.showInputDialog("DIgite a largura do retângulo"));

    h =
    Double.parseDouble(JOptionPane.showInputDialog("DIgite a altura do retângulo"));


    JOptionPane.showMessageDialog(null, "A área deste retângulo é igual a " + d*h + " unidades quadradas");
}    
}