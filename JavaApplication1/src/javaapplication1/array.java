/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author CamiDamiAmelie
 */
public class array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = {1,2,3,5};
        
        int[] number= new int[3];
        
        number[0]=2;
        number[1]=5;
        number[2]=7;
        
        for(int i=0; i<number.length;i++){
            
            System.out.println(number[i]);
        }
        
        for(int j=0;j<numeros.length;j++){
            System.out.println("los numeros son: "+numeros[j]);
        }
        
        int nElementos;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("ingrese los elementos del arreglo"));
        
        char[] letras = new char[nElementos];
        
        System.out.println("ingrese los elementos del caracter ");
        for(int i=0;i<nElementos;i++){
            System.out.println("digite el caracter; ");
            letras[i] = entrada.next().charAt(0);
        }
        
        System.out.println("los caracteres del arreglo son");
        for(int i=0;i<nElementos;i++){
            System.out.println("los caracteres son"+letras[i]);
        }
                
        
        //FOR EACH
        
        
        
    }
    
}
