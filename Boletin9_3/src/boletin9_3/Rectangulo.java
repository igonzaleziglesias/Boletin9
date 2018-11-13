package boletin9_3;

import javax.swing.JOptionPane;

public class Rectangulo {

    private int base;
    private int altura;

    public void pedirDatos() {
        do {
            base = Integer.parseInt(JOptionPane.showInputDialog("Inserta la base: "));
        } while (base <= 0);
        do {
            altura = Integer.parseInt(JOptionPane.showInputDialog("Inserta la altura: "));
        } while (altura <= 0);

    }

    public void area() {
        JOptionPane.showMessageDialog(null, "El area es: " + base * altura);

    }

}
