
import java.lang.Math;
import javax.swing.JOptionPane;
public class ex13 {
    public static void main(String[] args) {
        
        double r;
        double a;

        r =
        Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do raio do círculo"));

        a=
        Math.PI * Math.pow(r, 2);

        JOptionPane.showMessageDialog(null, "O valor da área do circulo com o raio " + r + " é de " + String.format("%.2f", a));

    }
}
