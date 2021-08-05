/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author CamiDamiAmelie
 */
public class principal {
    public static void main (String [] args){
        persona persona1 = new persona("carlos",31);
        
        persona1.setEdad(33);
        
        persona1.mostrarDatos();
        
    }
    
    //atributo statico permite que cuando hagas un cambio se hagan para todos los objetos asi mismo a los metodos
    // es porque ya no le ppertenece a los objetos sino a la clase
    
}
