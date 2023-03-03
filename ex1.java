package Exercicios;

import javax.swing.JOptionPane;

public class ex1 {

    public static void main(String[] args) {
        
        double dol;
        double cota;
        double real;
    
        cota = 5.20;

        dol = 
        Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de dólares a serem convertidos"));

        real = dol * cota;

        JOptionPane.showMessageDialog(null, real);
    }
}
