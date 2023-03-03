
import javax.swing.JOptionPane;
import java.lang.Math;
public class ex16 {
    public static void main(String[] args) {
        
        double valor;
        double resto = 0;
        double n200 = 0;
        double n100 = 0;

        double n50 = 0;

        double n20 = 0;

        double n10 = 0;

        double n5 = 0;

        double n2 = 0;

        double n1 = 0;
        double notas;

        valor = 
        Double.parseDouble(JOptionPane.showInputDialog("Insira o valor em dinheiro"));

        if (valor > 0) {
            if (valor >= 200) {
                n200 = (valor - (valor%200))/200;
                resto = valor%200;
            }
            if (resto >= 100) {
                n100 = (resto - resto%100)/100;
                resto = resto%100;
            }
            if (resto >= 50) {
                n50 = (resto - resto%50)/50;
                resto = resto%50;
            }   
            if (resto >= 20) {
                n20 = (resto - resto%20)/20;
                resto = resto%20;
            }
            if (resto >= 10) {
                n10 = (resto - resto%10)/10;
                resto = resto%10;
            }
            if (resto >= 5) {
                n5 = (resto - resto%5)/5;
                resto = resto%5;
            }
            if (resto >= 2) {
                n2 = (resto - resto%2)/2;
                resto = resto%2;
            } 
            if (resto >= 1) {
                n1 = resto/1;
            }
        }
        notas = n200 + n100 + n50 + n20 + n10 + n5 + n2 + n1;

        JOptionPane.showMessageDialog(null, "O número mínimo de notas para representar esse valor em dinheiro é " + Math.round(notas));
    }
}
