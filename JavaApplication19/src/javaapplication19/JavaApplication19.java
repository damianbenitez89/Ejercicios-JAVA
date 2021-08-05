/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.util.Scanner;

/**
 *
 * @author CamiDamiAmelie
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       int arreglo[]=new int[10];// creamos un array para 10 elementos
       int conteo_pares = 0,conteo_impares = 0;
        System.out.println("Llenar el array: ");
        for(int i=0;i<10;i++){
            System.out.println((i+1)+"Digite un numero:");
            arreglo[i]= entrada.nextInt();

            if(arreglo[i]%2==0){
                conteo_pares++;
            }
            else{
                conteo_impares++;
            }
        }
        
        int par[]=new int[conteo_pares];
        int impar[]=new int[conteo_impares];
        
        conteo_pares=0;
        conteo_impares=0;
        
        //almacenar los datos en un nuevo array
        for(int i=0;i<conteo_pares;i++){
            if(arreglo[i]%2==0){
                par[conteo_pares]=arreglo[i];
                conteo_pares++;
            }
            else{
                impar[conteo_impares]=arreglo[i];
                conteo_impares++;
            }
        }
        System.out.print("\nArreglos pares:");
        for(int i=0;i<conteo_pares;i++){
            System.out.println(par[i]+"");
        }
        System.out.println("");
         System.out.print("\nArreglos impares:");
        for(int i=0;i<conteo_impares;i++){
            System.out.println(impar[i]+"");
        }
        
                
    }
    
}
  