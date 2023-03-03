

import javax.swing.JOptionPane;

public class ex11 {
    public static void main(String[] args) {
        double fixo;
        double taxa;
        double comissão;
        double numero;
        double carro;
        double venda;
        double salario;

        fixo = 
        Double.parseDouble(JOptionPane.showInputDialog("Qual a parcela fixa do salário do trabalhador?"));

        comissão =
        Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da comissão pago por venda realizada por ele"));

        carro = 
        Double.parseDouble(JOptionPane.showInputDialog("Qual o preço de venda de cada carro?"));

        numero = 
        Double.parseDouble(JOptionPane.showInputDialog("Qual o número de carros vendidos por ele?"));

        venda = carro * numero;

        taxa = venda * 0.05;

        salario = fixo + comissão + taxa;

        JOptionPane.showMessageDialog(null, "O valor final do salário desse funcionário é de " + String.format("%.2f", salario));

    }
}
