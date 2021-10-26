package com.company;

import modelo.Producto;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Producto producto [] ;
    static int cont=0;

    public static void main(String[] args) {
	// write your code here
        producto= new Producto[3];
        int op = 0;

        do{
            System.out.println("menu de datos");
            System.out.println("1. ingresar datos");
            System.out.println("2. consultar datos");
            System.out.println("3. modificar datos");
            System.out.println("4. eliminar datos");
            System.out.println("5. presentar datos");
            System.out.println("6. salir de aplicacion");
            System.out.println("ingrese una opcion:"); op= scan.nextInt();
            switch(op){
                case 1: if(cont<3) IngresarDatos();else   ;break;
                case 2:
                case 3:
                case 4:
                case 5: PresentarDatos();break;
                case 6:
                default:
            }
        }while (op<=6);

    }
    private static void IngresarDatos(){ //create
        int codigo=0; String nombre=""; String tipo=""; double precio=0;

        System.out.println("INGRESE LOS DATOS DEL PRODUCTO");
        System.out.println("ingrese el codigo="); codigo=scan.nextInt();
        System.out.println("ingrese el nombre="); nombre=scan.next();
        System.out.println("ingrese el tipo="); tipo=scan.next();
        System.out.println("ingrese el precio="); precio=scan.nextInt();

        producto[cont]=new Producto(codigo,nombre,tipo,precio);
        cont++;
        System.out.println("Los datos se guardaron correctamente en, Nro de registro numero: "+cont);

    }

    private static void PresentarDatos(){
        System.out.println("presentacion de dator");
        for(int i=0; i<cont;i++){
            System.out.println("los datos ingresados son:"+producto[i].toString());
        }
    }


}
