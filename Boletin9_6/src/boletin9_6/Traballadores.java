package boletin9_6;

import javax.swing.JOptionPane;

public class Traballadores {

    private int num;
    private int[] soldos;

    public void numTraballadores() {
        num = Integer.parseInt(JOptionPane.showInputDialog("Indique o numero de traballadores: "));
        soldos = new int[num];
    }

    public void pedirSoldos() {
        for (int i = 0; i < soldos.length; i++) {
            int a = i + 1;
            
            do {
                soldos[i] = Integer.parseInt(JOptionPane.showInputDialog("introduzca o " + a + " soldo"));
            } while (soldos[i] < 0);

        }

    }

    public void calculos() {
        int contador = 0;
        int contador2 = 0;

        for (int i = 0; i < soldos.length; i++) {
            if ((soldos[i] >= 1000) && (soldos[i] <= 1750)) {
                contador++;
            } else if (soldos[i] < 1000) {
                contador2++;
            }

        }
        JOptionPane.showMessageDialog(null, "O numero de traballadores entre 1000 y 1750 euros es de: " + contador);
        JOptionPane.showMessageDialog(null, "El porcentaje de trabajadores que no llega a los 1000 euros es de: " + ((float) contador2 / (float) soldos.length) * 100 + " %");

    }
}
