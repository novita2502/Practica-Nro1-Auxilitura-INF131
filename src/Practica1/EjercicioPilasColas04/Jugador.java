/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1.EjercicioPilasColas04;

import java.util.Scanner;

public class Jugador {
   private String nombre;
   private int edad;

    public Jugador() {
      // generar  aletoreamente  la edad 14 al 35 y el nombre de vector de nombre 
      String[] vecnombres={"Angel","juan","miguel","pedro","manuel","serapio","tom ate","ronaldiño","messi"};
      int pos = (int)(Math.random()*(7-0+1)+0);
      nombre=vecnombres[pos];
      int numero = (int)(Math.random()*(35-14+1)+14);
      edad=numero;
    }
    public  void LeerJ(){
        Scanner lee= new Scanner (System.in);
        System.out.print("intrducir  el nombre = ");
        nombre= lee.nextLine();
        System.out.print("introducir la eda edad  de "+nombre+" =");
        edad= lee.nextInt();
        System.out.println("");
    }
    public void Mostrar(){
        System.out.println("nombre= "+nombre+ " edad= "+edad);
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }
    
   
}
