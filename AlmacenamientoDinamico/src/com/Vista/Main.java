package com.Vista;
import Controlador.ControlPersona;
import Modelo.Cuenta;
import Modelo.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner escaner=new Scanner(System.in);
    static Persona persona = new Persona();
    static ControlPersona controlPersona = new ControlPersona();
    public static void main(String[] args) {
	// write your code here
        System.out.println("Concepto de Almacenamiento Dinamico");
        //ArrayList<Clase> CRUD, Sort, Dimensionar->Controlado por interfaces propias implementadas en sus librerias
        //CRUD->Interfaces implican metodos de fabrica.
        //add(obj)->C//get(i)->R//set(i,obj)->U//remove(i)->->//size()-->sort()
        //Se trabajara bajo el modelo de Colaboracion
        int op=0;
        do{
            System.out.println("MENU DE LA LISTA");
            System.out.println("================");
            System.out.println("1.-INGRESAR DATOS A LA  LISTA");
            System.out.println("2.-EDITAR DATOS DE LA   LISTA");
            System.out.println("3.-DESPLEGAR DATOS DE LA LISTA");
            System.out.println("4.-GENERAR MOVIMIENTO CUENTA..");
            System.out.println("5.-SALIR DE LA LISTA..........");
            System.out.print("SELECCIONE OPCION...:");op=escaner.nextInt();
            switch(op)
            {  case 1: ingresarDatosLista(); break;
               case 2: editarDatosLista(); break;
               case 3: desplegarDatosLista(); break;
               case 4: System.out.println("En construccion...");break;
               case 5: System.out.println("Saliendo...");break;
               default: System.out.println("Opciones 1/2/3/4/5/...");
            }
        }while(op!=5);   System.exit(0);
    }//main

    private static void ingresarDatosLista(){
        String id,nombre, apel,fono,numero,tipo;
        int saldo=0;
        //Ingreso de datos a la lista
            System.out.print("Ingrese ID. Persona "); id = escaner.next();
            System.out.print("Ingrese NOMBRE Persona ");nombre = escaner.next();
            System.out.print("Ingrese APELLIDO Persona ");apel = escaner.next();
            System.out.print("Ingrese FONO Persona "); fono = escaner.next();
            System.out.print("Ingrese NUMERO CUENTA Persona "); numero = escaner.next();
            System.out.print("Ingrese TIPO CUENTA Persona "); tipo = escaner.next();
            System.out.print("Ingrese SALDO INICIAL "); saldo = escaner.nextInt();
            persona = new Persona(id, nombre, apel, fono, new Cuenta(numero, tipo, saldo));
            boolean ok=controlPersona.agregarPersonaLista(persona);//Envio a la lista
            if(ok) System.out.println("Registro Ingresado a la LIsta");//registro el feedback
            else   System.out.println("Falla en Proceso de Carga....");
    }

    private static void editarDatosLista() {
        //BUSQUEDA
        String id=null;
        System.out.print("Ingrese ID. Persona REQUERIDA "); id=escaner.next();
        int pos=-1, accion=0;
        pos=controlPersona.buscarPersonaLista(id);
        if(pos>=0)
        {   persona=controlPersona.editarPersona(pos);
            System.out.println(persona.getId());
            System.out.println(persona.getNombre());
            System.out.println(persona.getApel());
            System.out.println(persona.getFono());
            System.out.println(persona.getCuenta().getNumero());
            System.out.println(persona.getCuenta().getTipo());
            System.out.println(persona.getCuenta().getSaldo());
            System.out.print("Que desea ejecutar con los Datos (1)Modificarlos/(2)eliminarlos :");
            accion=escaner.nextInt();
            switch (accion)
            {   case 1:  modificarRegistro(pos,persona); break;
                case 2:  eliminarDatosLista(pos);break;
                default: System.out.println("Error de seleccion...");
            }
        }
        else System.out.println("Registro No Existe...");

    }

    private static void modificarRegistro(int pos, Persona persona) {
        String id,nombre, apel,fono,numero,tipo;
        int saldo=0,modi=0,sigue=1;
        while(sigue==1)
        {   System.out.print("MODIFICA 1:/NOMBRE/2:APELLIDO/3:TELEFONO/4:TIPO/5:SALDO :");modi=escaner.nextInt();
            switch(modi) {
                case 1:
                    System.out.print("Ingrese NOMBRE   :");
                    nombre = escaner.next();
                    persona.setNombre(nombre);
                    break;
                case 2:
                    System.out.print("Ingrese APELLIDO :");
                    apel = escaner.next();
                    persona.setApel(apel);
                    break;
                case 3:
                    System.out.print("Ingrese TELEFONO :");
                    fono = escaner.next();
                    persona.setFono(fono);
                    break;
                case 4:
                    System.out.print("Ingrese TIPO CUENTA :");
                    tipo = escaner.next();
                    persona.getCuenta().setTipo(tipo);
                    break;
                case 5:
                    System.out.print("Ingrese SALDO CUENTA :");
                    saldo = escaner.nextInt();
                    persona.getCuenta().setSaldo(saldo);
                    break;
                default:
                    System.out.println("ERROR de seleccion...");
            }
            System.out.print("QUIERE SEGUIR MODIFICANDO EL REGISTRO SI:1/NO:0");
            sigue= escaner.nextInt();
        }
        boolean ok=controlPersona.modificarPersonaLista(persona,pos);
        if(ok) System.out.println("Registro Modificado...");
        else   System.out.println("Falla en Modificacion...");
    }
    private static void eliminarDatosLista(int pos) {
        //Toma la decision de eliminar registro
            boolean ok= controlPersona.eliminarPersonaLista(pos);
            if(ok) System.out.println("Registro eliminado...Verifique");
            else   System.out.println("Falla en eliminar Registro...");
    }

    private static void desplegarDatosLista() {
        //Presentar datos
        List<Persona> lista=new ArrayList<>();
        lista=controlPersona.getLista();//REscate de lista
        for(int i=0; i< lista.size(); i++) {
            System.out.println("DATOS CONTENIDOS PERSONA :" + lista.get(i));
            System.out.println("DATOS CONTENIDOS CUENTA :" + lista.get(i).getCuenta().toString());
        }
    }
}//Clase
