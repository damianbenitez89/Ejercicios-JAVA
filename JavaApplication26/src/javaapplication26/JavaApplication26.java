/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

/**
 *
 * @author CamiDamiAmelie
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a ,b, c,  d;
        
        a = 1;
        b = 8;
        c = 3;
        d = 2;
        
        int contador = 0;
        
        if (a <3 && b <=9 && c <=5 && d <=9 ){
            contador ++;   
        }
        if (a <3 && b <=9 && d <=5 && c <=9 ){
            contador ++;   
        }
        if (a <3 && c <=9 && b <=5 && d <=9 ){
            contador ++;   
        }
        if (a <3 && c <=9 && d <=5 && b <=9 ){
            contador ++;   
        }
        if (a <3 && d <=9 && c <=5 && b <=9 ){
            contador ++;   
        }
        if (a <3 && d <=9 && b <=5 && c <=9 ){
            contador ++;   
        }
        
        System.out.println(""+contador);
        
        
          if (b <3 && a <=9 && c <=5 && d <=9 ){
            contador ++;   
        }
        if (b <3 && a <=9 && d <=5 && c <=9 ){
            contador ++;   
        }
        if (b <3 && c <=9 && a <=5 && d <=9 ){
            contador ++;   
        }
        if (b <3 && c <=9 && d <=5 && a <=9 ){
            contador ++;   
        }
        if (b <3 && d <=9 && c <=5 && a <=9 ){
            contador ++;   
        }
        if (b <3 && d <=9 && a <=5 && c <=9 ){
            contador ++;   
        }
        
        System.out.println(""+contador);
        
          if (c <3 && b <=9 && a <=5 && d <=9 ){
            contador ++;   
        }
        if (c <3 && b <=9 && d <=5 && a <=9 ){
            contador ++;   
        }
        if (c <3 && a <=9 && b <=5 && d <=9 ){
            contador ++;   
        }
        if (c <3 && a <=9 && d <=5 && b <=9 ){
            contador ++;   
        }
        if (c <3 && d <=9 && a <=5 && b <=9 ){
            contador ++;   
        }
        if (c <3 && d <=9 && b <=5 && a <=9 ){
            contador ++;   
        }
        
        System.out.println(""+contador);
        
          if (d <3 && b <=9 && c <=5 && a <=9 ){
            contador ++;   
        }
        if (d <3 && b <=9 && a <=5 && c <=9 ){
            contador ++;   
        }
        if (d <3 && c <=9 && b <5 && a <=9 ){
            contador ++;   
        }
        if (d <3 && c <=9 && a <=5 && b <=9 ){
            contador ++;   
        }
        if (d <3 && a <=9 && c <=5 && b <=9 ){
            contador ++;   
        }
        if (d <3 && a <=9 && b <=5 && c <=9 ){
            contador ++;   
        }
        
       
        System.out.println(""+contador);
        
    }
    }
    

