/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author CamiDamiAmelie
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nElementos, arreglo[];
        
        nElementos= Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de elementos"));
        
        arreglo = new int[nElementos];
        
        for(int i=0;i<nElementos;i++){
            System.out.print((i+1)+". ingrese un digito ");
            arreglo[i]=entrada.nextInt();
        }
        
        //Ordenamiento por insercion
        for(int i=0;i<nElementos;i++){
            int pos= i;
            int aux= arreglo[i];
            
            while((pos>0) && (arreglo[pos-1]>aux) ){
              arreglo[pos]=arreglo[pos-1];
              pos--;
            }
            arreglo[pos]=aux;
        }
        System.out.println("el arreglo ordenado es");
        for(int i=0;i<nElementos;i++){
            System.out.println(arreglo[i]);
        
        }
        
        
    }
    
}
