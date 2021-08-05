/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author CamiDamiAmelie
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz [][], nFilas,nCol;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("digite el numero de filas "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("digite el numero de columnas  "));
        matriz= new int [nFilas][nCol];
        
        for(int i=0;i<nFilas;i++){
            for(int j=0;j<nCol;j++){
                System.out.print("matriz["+i+"]["+j+"]: ");
                matriz[i][j]=entrada.nextInt();
                
            }
        }
        System.out.println("la matriz es: ");
        for(int i=0;i<nFilas;i++){
            for(int j=0;j<nCol;j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }
                
    }
    
}
