/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoburbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author CamiDamiAmelie
 */
public class MetodoBurbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[],nElementos;
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de elementos: "));
        int aux;
        arreglo= new int[nElementos];
        
        for(int i=0;i<nElementos;i++){
            System.out.println((i+1)+". ingrese un numero ");
            arreglo[i]= entrada.nextInt(); 
        }
        
        //METODO BUBUTA
        
        for(int i=0;i<nElementos-1;i++){
            for(int j=0;j<nElementos ;i++){
                if(arreglo[j]>arreglo[j+1]){
                    
                    aux=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
        }
        System.out.println("EL ARREGLO ORDENADO ES");
        for(int i=0;i<nElementos;i++){
            System.out.print(arreglo[i]+" - ");
        }
        
        
                
        
    
    }
}
