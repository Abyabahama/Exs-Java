
import javax.swing.JOptionPane;
public class ex15 {
    public static void main(String[] args) {
        
        double a;
        double b;
        double soma;

        a =
        Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de A"));

        b = 
        Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de B"));

        soma = a + b;

        JOptionPane.showMessageDialog(null, "Soma: " + soma);
    }
}
