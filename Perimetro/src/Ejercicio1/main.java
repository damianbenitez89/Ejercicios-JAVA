
package Ejercicio1;

import javax.swing.JOptionPane;


public class main {
    public static void main (String [] args){
        Cuadrilatero c1;
        float lado1, lado2;
        
        lado1= Float.parseFloat(JOptionPane.showInputDialog("digite el lado 1: "));
        
        lado2= Float.parseFloat(JOptionPane.showInputDialog("digite el lado 2: "));
        
        if(lado1==lado2){
            c1= new Cuadrilatero(lado1);
        }
        else{
            c1= new Cuadrilatero(lado1,lado2);
        }
        System.out.println("el perimetro es "+c1.getPerimetro());
        System.out.println("el area es "+c1.getArea());
    }
    
}
