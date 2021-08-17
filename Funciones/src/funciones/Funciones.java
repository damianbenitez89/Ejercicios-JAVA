/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author CamiDamiAmelie
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1,numero2,numero3;
        
        
        System.out.print("ingrese el numero 1: ");
        numero1=entrada.nextInt();
        System.out.print("ingrese el numero 2: ");
        numero2=entrada.nextInt();
        System.out.print("ingrese el numero 3: ");
        numero3=entrada.nextInt();
        
        calcularNumMayor(numero1,numero2,numero3);
        
        calcularNumMenor(numero1,numero2,numero3);
        
        promedio(numero1,numero2,numero3);
        
    }
    private static void promedio (int numero1, int numero2, int numero3){
        float promedio = Float.valueOf(numero1+numero2+numero3)/3;
        
        System.out.println("el promedio de los numeros es "+promedio);
    }
    private static void calcularNumMayor (int numero1, int numero2, int numero3){
        int numeroMayor=numero1;
        if(numero2>numero1){
            numeroMayor=numero2;
        }
        if(numero3>numero1){
            numeroMayor=numero3;
        }
        
        System.out.println("el numero mayor de los 3 es "+numeroMayor);
    }
    private static void calcularNumMenor (int numero1, int numero2, int numero3){
        int numeroMenor=numero1;
        if(numero2<numero1){
            numeroMenor=numero2;
        }
        if(numero3<numero1){
            numeroMenor=numero3;
        }
        
        System.out.println("el numero menor de los 3 es "+numeroMenor);
    }
}
