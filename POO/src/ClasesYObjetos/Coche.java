/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos;

/**
 *
 * @author CamiDamiAmelie
 */
public class Coche {
    //atributos
    String color;
    String marca;
    int km;
    
    //metodo
    public static void main(String []args){
        Coche coche1 = new Coche();
        
        coche1.color= "marron";
        coche1.km= 100;
        coche1.marca= "ford";
        
        System.out.println("el color del coche 1 es "+coche1.color);
        System.out.println("el KM del coche es "+coche1.km);
        System.out.println("la marca del coche es "+coche1.marca);
        
        Coche coche2 =new Coche();
        
        coche2.color="rojo";
        coche2.km=250000;
        coche2.marca="fiat";
        System.out.println("\nel color del coche 2 es"+coche2.color);
        System.out.println("el KM del coche es "+coche2.km);
        System.out.println("la marca del coche es"+coche2.marca);
        
    }
    
    
}
