package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here

        InputStreamReader ingreso = new InputStreamReader(System.in);
        BufferedReader lector = new BufferedReader(ingreso);

        int edad=0;
        String nombre = null;
        System.out.println("Ingrese Nombre: ");nombre= lector.readLine();
        System.out.println("Ingrese edad: ");edad = Integer.parseInt(lector.readLine());
    }
}
