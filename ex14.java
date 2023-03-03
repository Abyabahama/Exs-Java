
import javax.swing.JOptionPane;
public class ex14 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double media;
        
        a =
        Double.parseDouble(JOptionPane.showInputDialog("Insira a nota A"));

        b =
        Double.parseDouble(JOptionPane.showInputDialog("Insira a nota B"));

        c = 
        Double.parseDouble(JOptionPane.showInputDialog("insira a nota C"));

        media = (a*2 + b*3 + c*5)/10;

        JOptionPane.showMessageDialog(null, "A média de provas deste aluno é " + String.format("%.2f", media));
        
    } 
}
