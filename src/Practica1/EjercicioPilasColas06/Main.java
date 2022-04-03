/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1.EjercicioPilasColas06;

public class Main {
     public static void main(String[] args) {
        ColaSCaracteres  cola= new ColaSCaracteres();
        cola.llenar("abcdabcdfa");
        cola.mostrar();
        System.out.print("cola ordenada Ascendetemente");
        cola.OrdenAscendente();
        cola.mostrar();
         System.out.println("cola ordenada descendetemente");
        cola.OrdenDecendente();
        cola.mostrar();
        
    }
    
}
