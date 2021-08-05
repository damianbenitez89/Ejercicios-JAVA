/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseYObjetos;

import javax.swing.JOptionPane;



public class Operacion {
        //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;


    //Metodos

    //Metodo para pedirle al usuario que nos digite 2 numeros

    public void leerNumeros (){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
    }
    
    public void sumar (){
        suma = numero1+numero2;
    }
    
    public void restar (){
        resta = numero1-numero2;
    }
    
    public void multiplicar (){
        multiplicacion = numero1*numero2;
    }
    
    public void dividir (){
        division = numero1/numero2;
    }
    
    public void mostrarResultados(){
        System.out.println("La suma es : "+suma);
        System.out.println("La resta es : "+resta);
        System.out.println("La multiplicaicon es : "+multiplicacion);
        System.out.println("La division es : "+division);
        
    }
    

}
