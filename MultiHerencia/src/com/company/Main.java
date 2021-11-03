package com.company;

import com.company.Models.Carne;
import com.company.Models.Vegetal;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        Carne carne ;
        Vegetal vegetal;
        String codigo= "",nombre="";
        int precio=0 ,stock = 0, cant=0;
        String procedencia="",tipoveg="";


        System.out.print("ingrese codigo: ");codigo=scan.next();
        System.out.print("ingrese nombre: ");nombre=scan.next();
        System.out.print("ingrese precio: ");precio=scan.nextInt();
        System.out.print("ingrese stock: ");stock=scan.nextInt();
        System.out.print("procedencia de la carne: ");procedencia=scan.next();
        System.out.print("Organico/normal: ");tipoveg=scan.next();

        carne = new Carne(codigo,nombre,precio,stock,procedencia,"V");

        System.out.println("Datos de la carne: "+carne.toString());

        System.out.println("ingrese cantidad a comprar: ");cant=scan.nextInt();
        System.out.println("Total a Pagar: "+carne.totalAPagar(cant));
    }
}
