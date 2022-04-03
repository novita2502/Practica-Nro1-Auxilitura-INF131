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
public class Equipo {
    private String nombre;
    private PilaJugadores PJ;
    private PilaGoles PG;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.PJ = new PilaJugadores();
        this.PG =  new PilaGoles();
    }
    public void Leer(){
        Scanner lee= new Scanner(System.in);
        System.out.print("introdcuir el nombre del equipo= ");
         nombre = lee.nextLine();
        PJ.llenar();
        PG.llenar();
    }
    public void Mostrar(){
        System.out.println("___________________________________________");
        System.out.println("nombre del equipo  de futbol = "+nombre);
        PJ.mostrar();
        PG.mostrar();
        
    }
    public int NroGoles(){
         return PG.Nroelemntos();
    }
    public Jugador JugadorMenorEdad(){
        Jugador j= null;
        PJ.OrdenarEdadMayorAMenor();
        j=PJ.eliminar();
        PJ.adicinar(j);
        return j;
    }
    public void LlenarRamdon(String nom){
        nombre=nom;
        PJ.llenarRamdom();
        PG.llenarRamdomG(PJ);
        
    }
    public PilaGoles getPG() {
        return PG;
    }

    public String getNombre() {
        return nombre;
    }

    public PilaJugadores getPJ() {
        return PJ;
    }
    
    
}
