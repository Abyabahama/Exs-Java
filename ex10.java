

import javax.swing.JOptionPane;

public class ex10 {
    public static void main(String[] args) {
        double dist = 0.28;
        double imposto = 0.45;
        double fabrica;
        double venda;

        fabrica =
        Double.parseDouble(JOptionPane.showInputDialog("Qual o custo de produção deste modelo de carro?"));

        venda = (dist + imposto + 1) * fabrica; 

        JOptionPane.showMessageDialog(null, "O valor de venda do carro é de " + String.format("%.2f", venda));


    }
}
