

import javax.swing.JOptionPane;

public class ex12 {
    public static void main(String[] args) {
        double x1;
        double y1;
        double x2;
        double y2;
        double dist;

        x1 =
        Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de x1"));

        y1 = 
        Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de y1"));

        x2 = 
        Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de x2"));

        y2 = 
        Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de y2"));

        dist = java.lang.Math.sqrt(java.lang.Math.pow(x2 - x1, 2) + java.lang.Math.pow(y2 - y1, 2));

        JOptionPane.showMessageDialog(null, "A distância entre esses dois pontos no plano cartesiano é de " + String.format("%.2f", dist) + " unidades");

    }
}
