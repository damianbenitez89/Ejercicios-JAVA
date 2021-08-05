/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizsimetrica;

import javax.swing.JOptionPane;

/**
 *
 * @author CamiDamiAmelie
 */
public class MatrizSimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][],nFila,nCol;
        
        nFila=Integer.parseInt(JOptionPane.showInputDialog("digite las filas"));
        nCol=Integer.parseInt(JOptionPane.showInputDialog("digite las columnas"));
        matriz= new int [nFila][nCol];
        
        System.out.println("digite la matriz: ");
        
       
    }
    
}
