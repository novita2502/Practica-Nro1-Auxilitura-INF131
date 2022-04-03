/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1.EjercicioPilasColas04;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Partido A= new Partido();
        Scanner lee=  new Scanner(System.in);
        int sw=0;
        while (sw==0)
        {  
            System.out.println("___________________________________MENU___________________________________________");
            System.out.println("introduca 1 = si quiere llenar manualmente los datos de los equipos de futbol");
            System.out.println("introduca 2 = si quiere que se llenen d emanera aleatoria los datos de los equipos de futbol");
            System.out.println("introduca 3= Salir");
            System.out.print("introducir =");
            int n= lee.nextInt();
            while (n>3 || n==0)
            {                
            System.out.println("introduca 1 = si quiere llenar manualmente los datos de los equipos de futbol");
            System.out.println("introduca 2 = si quiere que se llenen d emanera aleatoria los datos de los equipos de futbol");
            System.out.println("introduca 3= Salir");
            System.out.print("introducir =");
            n= lee.nextInt();
     
            }
            if (n==1) 
            {
                A.Leer();
                A.mostrar();
                A.DeternimarGanador();
                A.JugadorMenorEdadCadaEquipo();
                A.MostrarNombre3JMAsJovenes();
 
            } else {
                if (n==2)
                {
                  A.LlenarRamdon();
                  A.mostrar();
                  A.DeternimarGanador();
                  A.JugadorMenorEdadCadaEquipo();
                  A.MostrarNombre3JMAsJovenes();
    
                } else {
                    sw=2;
                }
            }
        
            
        }
    }
}
