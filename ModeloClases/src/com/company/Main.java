package com.company;

import Modelo.Cliente;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cliente cliente = new Cliente();
        Scanner lector = new Scanner(System.in);

        String nombre="";
        int edad=0; int sueldo=0;

        System.out.println("aplicacion del proyecto POO");

        System.out.println("ingrese en nombre:"); nombre= lector.next();
        System.out.println("ingrese en edad  :"); edad= lector.nextInt();
        System.out.println("ingrese en sueldo:"); sueldo= lector.nextInt();

        cliente = new Cliente(nombre,edad,sueldo);

        cliente.presentarDatosCliente();

        System.out.println("bueno ahora vamos a cambiar los nombres");
        System.out.println("ingrese un nuevo nombre:");nombre=lector.next();
        cliente.setName(nombre);
        System.out.println("el nuevo nombre es"+cliente.getName());
    }
}
