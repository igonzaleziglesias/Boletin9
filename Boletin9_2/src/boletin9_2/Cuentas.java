package boletin9_2;

import javax.swing.JOptionPane;

public class Cuentas {

    public void cuentas() {
        int contador = 0;
        double contador2 = 1;
        for (int i = 11; i < 90; i++) {
            contador = contador + i;
            contador2 = contador2 * i;
        }
        JOptionPane.showMessageDialog(null, "La suma es : " + contador);
        JOptionPane.showMessageDialog(null, "El producto es : " + contador2);


    }
}
