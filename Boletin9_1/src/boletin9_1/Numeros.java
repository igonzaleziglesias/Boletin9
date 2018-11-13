package boletin9_1;

import javax.swing.JOptionPane;

public class Numeros {

    private int[] num = new int[10];

    public void pedirNumeros() {
        for (int i = 0; i < num.length; i++) {
            int a = i + 1;
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserte o " + a + " numero: "));
        }
    }

    public void calcular() {
        int ceros = 0;
        int positivos = 0;
        int negativos = 0;
        
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) {
                positivos++;

            } else if (num[i] < 0) {
                negativos++;
            } else {
                ceros++;
            }
            
        }
            JOptionPane.showMessageDialog(null,"numero de ceros: "+ ceros);
            JOptionPane.showMessageDialog(null,"numero de positivos: "+ positivos);
            JOptionPane.showMessageDialog(null,"numero de negativos: "+ negativos);
    }

}
