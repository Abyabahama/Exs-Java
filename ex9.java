

import javax.swing.JOptionPane;

public class ex9 {
    public static void main(String[] args) {
        double salario;
        double ajuste;
        double percentual;
        double novoSalario;

        salario =
        Double.parseDouble(JOptionPane.showInputDialog("Qual o salário recebido pelo trabalhador?"));
    
        ajuste =
        Double.parseDouble(JOptionPane.showInputDialog("Qual o percentual de reajuste para os salários?"));
        
        percentual = (ajuste/100.0) + 1;
        
        novoSalario = salario * percentual;

        JOptionPane.showMessageDialog(null, "O novo valor do salário desse trabalhador será de " + String.format("%.2f", novoSalario));

    }
}
