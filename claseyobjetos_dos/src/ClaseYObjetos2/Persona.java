/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseYObjetos2;

/**
 *
 * @author CamiDamiAmelie
 */
public class Persona {
    
    //Atributos
    String nombre;
    int edad;
    
    //Metodo constructor
    public Persona(String _nombre, int _edad){
        nombre = _nombre;
        edad = _edad;
        
        
    }
    public void mostrarDatos (){
        System.out.println("el nombre es"+nombre);
        System.out.println("el nombre es"+edad);
        
    }
            
            
}
