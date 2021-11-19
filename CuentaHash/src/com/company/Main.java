package com.company;

import com.company.model.Cuenta;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cuenta cuenta1 = new Cuenta(1,"corriente",1200);
        Cuenta cuenta2 = new Cuenta(12,"ahorro",4000);
        Cuenta cuenta3 = new Cuenta(1,"vista",5600);
        Cuenta cuenta4 = new Cuenta(1,"corriente",1200);

        Map<Integer,Cuenta> mapa = new HashMap<Integer,Cuenta>();

        mapa.put(1,cuenta1);
        mapa.put(2,cuenta2);
        mapa.put(3,cuenta3);
        mapa.put(4,cuenta4);

        for(Map.Entry<Integer,Cuenta> cta : mapa.entrySet()){
            System.out.println(cta.getKey()+" "+cta.getValue());
        }

        System.out.println( " AHORA VAMOS A MODIFICAR LA 2Da CUENTA");

        Cuenta cuenta5 = new Cuenta(3,"cliente",7000);
        mapa.replace(2,cuenta5);

        for(Map.Entry<Integer,Cuenta> cta : mapa.entrySet()){
            System.out.println(cta.getKey()+" "+cta.getValue());
        }

        System.out.println("AHORA VAMOS A ELIMINAR 1er CUENTA");

        mapa.remove(1);
        for(Map.Entry<Integer,Cuenta> cta : mapa.entrySet()){
            System.out.println(cta.getKey()+" "+cta.getValue());
        }
    }
}
