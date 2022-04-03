/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1.EjercicioPilasColas02;

import java.util.Scanner;

public class MainEjercicio1 {
    
    public static void main(String[] args) {
        Scanner lee= new Scanner(System.in);
         while (true) {            
        Pila P = new Pila();
        String D= lee.next();
        P.llenar(D);
        P.mostrar();
        P.Balanceado();
        }
           
       
        
        
    }
}
