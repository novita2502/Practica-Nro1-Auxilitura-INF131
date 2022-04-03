/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1.EjercicioPilasColas04;

import java.util.Scanner;

/**
 *
 * @author ANGELO
 */
public class Gol {
    private String hora;
    private String nombre;

    public Gol(String nombre) 
    {   // generar la hora ramdom
     String[] vechoras={"14:00","14:45","15:00","15:25","15:35","15:55"};

        this.hora =vechoras[(int)(Math.random()*(5-0+1)+0)] ;
        this.nombre = nombre;
    }
     public  void LeerG(){
        Scanner lee= new Scanner (System.in);
        System.out.print("introducir la nombre de juagador que metio gol = ");
        nombre= lee.nextLine();
        System.out.print("introducir la hora del gol del gugador "+nombre+" = ");
        hora= lee.next();
        System.out.println("");
    }
    public void Mostrar(){
        System.out.println("nombre= "+nombre+ " hora del gol = "+hora);
    }

    public String getHora() {
        return hora;
    }

    public String getNombre() {
        return nombre;
    }
            
}
