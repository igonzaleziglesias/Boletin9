
package boletin9_5;

import javax.swing.JOptionPane;

public class Elementos {
    int element=0;
    public void numElementos(){
        element=Integer.parseInt(JOptionPane.showInputDialog("Indique o numero de elementos: "));
    }
    
    
    public void series(){
        int a=2;
        int b=-1;
        for(int i=1;i<=element;i++){
            System.out.print("+"+a);
            a=a+2;        
        }
        System.out.println();
        a=2;
        for(int i=1;i<=element;i++){
            System.out.print(b+"+"+a);
            a=a+2;
            b=b-2;
        }

        System.out.println();
        int c=0;
        int d=1;
        int aux=0;
        System.out.print(c);
        c++;
        System.out.print(","+c);

        for(int i=1;i<=element;i++){ 
            System.out.print(","+d);
            aux=d; 
            d=d+c;
            c=aux;
        }

        System.out.println();
    }
}
