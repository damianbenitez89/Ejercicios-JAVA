/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author CamiDamiAmelie
 */
public class Main {
   public static void main(String[] args){
       
       
       int n1 = Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
       int n2 = Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
       Operaciones Op = new Operaciones();
       
       Op.dividir(n1, n2);
       Op.sumar(n1, n2);
       Op.restar(n1, n2);
       Op.multiplicacion(n1, n2);
       
       Op.resultados();
   }
    
}
