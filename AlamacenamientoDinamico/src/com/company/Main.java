package com.company;

import Controlador.ControladorPersona;
import Modelo.Cuenta;
import Modelo.Persona;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);
        System.out.println("concepto de Almacenamiento Dinamico");

        ControladorPersona ctrl = new ControladorPersona();
        //arrayList<Clase>
        //CRUD--> interfaces que implican metodos de fabrica
        //add(ojeto)-->C // get(i)--> R // set(i,objeto)-->U // DELETE (i)-->D // Size()-->para ver la dimension
        String id;
        String nombre;
        String apel;
        String tel;
        String numero;
        String tipo;// corriente , ahorro
        int saldo;

        System.out.println("ingrese el id"); id=scan.next();
        System.out.println("ingrese el nombre"); nombre=scan.next();
        System.out.println("ingrese el apellido");apel=scan.next();
        System.out.println("ingrese el telefono");tel=scan.next();
        System.out.println("ingrese el numero de cuenta");numero=scan.next();
        System.out.println("ingrese el tipo de cuenta");tipo=scan.next();
        System.out.println("ingrese el saldo");saldo=scan.nextInt();


        Persona persona = new Persona(  id,  nombre,  apel,  tel, new Cuenta( numero,  tipo,  saldo));

        ctrl.agregarPersonaLista(persona);





    }
}
