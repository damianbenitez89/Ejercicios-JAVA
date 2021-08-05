/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author CamiDamiAmelie
 */
public class Operaciones {
     //Atributos
    
    int suma;
    int resta;
    int division;
    int multiplicacion;
    
    //metodos
    
    //metodos para sumar ambos numeros
    public void sumar (int a, int b){
        suma=a+b;
    }
     
    public void restar (int a, int b){
        resta=a-b;
    }
    
    public void dividir (int a, int b){
        division=a/b;
    }
    
    public void multiplicacion (int a, int b){
        multiplicacion=a*b;
    }
    
    public void resultados(){
        JOptionPane.showMessageDialog(null,"el resultado de de la suma es "+suma);
        JOptionPane.showMessageDialog(null,"el resultado de de la resta es "+resta);
        JOptionPane.showMessageDialog(null,"el resultado de de la Division es "+division);
        JOptionPane.showMessageDialog(null,"el resultado de de la multiplicacion es "+multiplicacion);
    }
}
