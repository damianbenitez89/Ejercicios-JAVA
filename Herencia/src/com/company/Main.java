package com.company;

import Controlador.TFuncionario;
import Models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static TFuncionario tFuncionario=new TFuncionario();
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int op=0;
        do{
            System.out.println("Menu de operaciones");
            System.out.println("====================");
            System.out.println("1. - Ingreso de Datos");
            System.out.println("2. - Edicion de Datos");
            System.out.println("3. - Listado de Datos");
            System.out.println("4. - Salir");
            System.out.println("Sleccione una opcion"); op=scan.nextInt();


            switch (op){
                case 1: ingresarDatos();break;
                case 2: editarDatos();break;
                case 3: listarDatos();break;
                case 4: System.out.println("saliendo de la aplicacion");break;
                default: System.out.println("opciones 1/2/3/4...");
            }

        }while (op!=4);
        System.exit(6);

    }
    private static void ingresarDatos() {
        String id="", nombre="", apel="",sueldo="", codigo="",especialidad="", turno="";
        int tipo=0;
        System.out.println("ingresa 1:Medico 2:Especialista 3: enfermera");tipo=scan.nextInt();
        System.out.println("Identificacion"); id=scan.next();
        System.out.println("Nombre");nombre=scan.next();
        System.out.println("Apellido");apel=scan.next();
        System.out.println("Sueldo");sueldo=scan.next();
        if(tipo == 1 ){
            System.out.println("Codigo info: ");codigo=scan.next();
            Medico medico =new Medico(id,nombre,apel,sueldo,codigo);
            tFuncionario.ingresarFuncionario(medico);
        }
        if(tipo == 2 ){
            System.out.println("Codigo info: ");codigo=scan.next();
            System.out.println("Especialista: ");especialidad=scan.next();
            Especialista especialista =new Especialista(id,nombre,apel,sueldo,codigo,especialidad);
            tFuncionario.ingresarFuncionario(especialista);
        }
        if(tipo == 3 ){
            System.out.println("Turno: ");turno=scan.next();
            Enfermera enfermera =new Enfermera(id,nombre,apel,sueldo,turno);
            tFuncionario.ingresarFuncionario(enfermera);
        }
    }

    private static void listarDatos() {
        List<Funcionario> lista = new ArrayList<>();
        lista=tFuncionario.getLista();
        for(int i=0 ;i< lista.size();i++ ){
            System.out.println(lista.get(i));
        }
    }

    private static void editarDatos() {
        String id = ""; int pos= -1;
        String[] vector = new String[6];
        System.out.println("ingrese identificacion: ");id=scan.next();
        pos=tFuncionario.buscanFuncionario(id);
        if(pos > 0){
            System.out.println("Resgistro Funcionario");
            vector= tFuncionario.editarFuncionario(pos);
            System.out.println("id: "+vector[0]);
            System.out.println("Nombre: "+vector[1]);
            System.out.println("Apellido: "+vector[2]);
            System.out.println("Sueldo: "+vector[3]);
            if(vector[5].equals("1")){
                System.out.println("Codigo: " +vector[4]);
            }else if(vector[5].equals("2")){
                System.out.println("Turno: " + vector[4]);
            }else {
                System.out.println("Codigo: "+ vector[4]);
                System.out.println("Especialidad: "+ vector[5]);
            }

        }
    }


}
