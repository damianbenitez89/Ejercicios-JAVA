/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author CamiDamiAmelie
 */
public class Principal {
    public static int indiceCocheBarato(Vehiculo coches[]){
        float precio;
        int indice =0;
        
        precio = coches[0].getPrecio();
        for(int i = 1;i<coches.length;i++){
            if(coches[i].getPrecio()<precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }
    
    public static void main (String[]args){
         Scanner entrada = new Scanner(System.in);
         
         String modelo,marca;
         float precio;
         int numeroVehiculos,indiceBarato;
         
         System.out.println("digite la cantidad de vehiculos");
         numeroVehiculos = entrada.nextInt();
         
         //creamos los objetos para los coches
         Vehiculo coches[]= new Vehiculo[numeroVehiculos];
         
         for(int i=0; i<coches.length;i++ ){
             entrada.nextLine();
             System.out.println("\nDigite las caracteristicas del coche"+(i+1)+":");
             System.out.println("introduzca marca: ");
             marca = entrada.nextLine();
             System.out.println("introduzca modelo: ");
             modelo = entrada.nextLine();
             System.out.println("introduzca el precio: ");
             precio= entrada.nextInt();
             
             coches[i]= new Vehiculo(marca, modelo, precio);
             
         }
         indiceBarato = indiceCocheBarato(coches);
         System.out.println("\nEl Coche mas barato es: ");
         System.out.println(coches[indiceBarato].mostrarDatos());
         
    }
   
}
