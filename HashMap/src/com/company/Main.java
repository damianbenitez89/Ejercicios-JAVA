package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here

        HashMap<String,Float> lista = new HashMap<String,Float>();
         int op=0;
         String codigo="";
         float precio= 0;

         do{
             System.out.println("menu HashMap");
             System.out.println("::::::::::::");
             System.out.println("1. ingrese los datos: ");
             System.out.println("2. mostrar datos del hashMap: ");
             System.out.println("3. Modificar datos del HashMap: ");
             System.out.println("4. Eliminar Datos del HashMap:");
             System.out.println("5. Salir de Hashmap: ");

             System.out.print("ingrese una opcion: ");op=scan.nextInt();

             switch (op){
                 case 1:
                     System.out.println("ingrese codigo del producto: ");codigo =scan.next();
                     System.out.println("ingrese el valor del producto: ");precio =scan.nextFloat();
                     ingresarDatosHashMap(codigo,precio,lista);break;
                 case 2:mostrarLista(lista);break;
                 case 3:
                     System.out.println("ingrese codigo del producto a modificar: ");codigo =scan.next();

                     modificarDatosDelHashMap(codigo,lista);break;
                 case 4:
                     System.out.println("Ingrese el codigo del producto a eliminar");codigo=scan.next();
                     eliminarDatosHashMap(codigo,lista); break;
                 case 5:
                     System.out.println("cerrando el sistema...");break;
                 default:
                     System.out.println("opciones validas 1/2/3/4/5");

             }

         }while (op!=5);

    }

    private static void modificarDatosDelHashMap(String codigo, HashMap<String, Float> lista) {

        float newprecio = 0;
        if(lista.containsKey(codigo)){
            System.out.println("registro encontrado");
            System.out.print("ingrese el nuevo precio: ");newprecio=scan.nextFloat();
            lista.put(codigo,newprecio);
            System.out.println("registro modificado correctamente");

        }else{
            System.out.println("No se encuentra el codigo para modificar");
        }

    }

    private static void eliminarDatosHashMap(String codigo, HashMap<String, Float> lista) {
        if(lista.containsKey(codigo)){
            lista.remove(codigo);
        }else{
            System.out.println("No existe ningun producto con el codigo");
        }

    }

    private static void mostrarLista(HashMap<String, Float> lista) {

        String  clave ="";
        Iterator<String> produ= lista.keySet().iterator();
        System.out.println("Contenido de la lista");
        while(produ.hasNext()){
                clave = produ.next();
            System.out.println(clave+" - "+lista.get(clave));
        }
    }

    private static void ingresarDatosHashMap(String codigo, float precio, HashMap<String,Float> lista){
        if(!lista.containsKey(codigo)){ // si el codigo no esta en la lista cargar
            lista.put(codigo,precio);
            System.out.println("se ingreso el codigo correctamente");
        }else{

            System.out.println("el registro esta repetido");
        }
    }

}
