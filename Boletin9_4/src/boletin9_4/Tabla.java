package boletin9_4;

import javax.swing.JOptionPane;

public class Tabla {

    private int e;

    public void pedirDatos() {
        e = Integer.parseInt(JOptionPane.showInputDialog( "Inserte o numero: "));
    }

    public void crearTabla() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(e + " x " + i + " = " + (e * i));
        }
    }

}
