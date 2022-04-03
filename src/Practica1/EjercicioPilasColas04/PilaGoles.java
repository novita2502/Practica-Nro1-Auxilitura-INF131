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
public class PilaGoles 
{
    private int max=30;
	private Gol v[]= new Gol[max];
	private int tope;
	
	public PilaGoles() {
		
		tope=0;
	}
	public boolean esvacia(){
		if(tope==0)
			return true;
		return false;
					
	}
	public  boolean esllena(){
		if(tope==max)
			return true;
		return false;
		
	}
	public  void adicinar(Gol elem){
		if(!esllena())
		{
			tope=tope+1;
			v[tope]=elem;
		}
		else
			System.out.println("Pila llena");
		
	}
	public Gol eliminar(){
		Gol elem =null;
		if(!esvacia()){
			elem=v[tope];
			tope=tope-1;
		}
		else
			System.out.println("Pila vacia");
		return elem;
	}
	public void llenar( )
        {
               Scanner lee= new Scanner(System.in);
               System.out.println("introducir cuantos  goles metio  el equipo= ");
               int n= lee.nextInt();
               for (int i = 0; i < n; i++)
               {
                   System.out.print("Datos del gol numero "+i+1+" =");
                   Gol ele =new Gol("Angel");
                    ele.LeerG();
                  this.adicinar(ele);
               }
		
		
	}
	public void llenarRamdomG(PilaJugadores PJ)
        {
            int n = (int)(Math.random()*(12-1+1)+1);
             while (n>PJ.Nroelemntos()) {                
             n = (int)(Math.random()*(12-1+1)+1);
            }
            Jugador[] vec=PJ.getV();
           
            int limite=PJ.getTope();
             for (int i = 0; i <n; i++) 
            {
               int nu= (int)(Math.random()*(limite-1+1)+1);
               String nom= vec[nu].getNombre();
               Gol ele= new Gol(nom);
               this.adicinar(ele);
            }
        }
	public void mostrar(){
		PilaGoles aux = new PilaGoles();
                System.out.println("EL EQUIPO ANOTO "+this.Nroelemntos()+" GOLES Y JUGADORES QUE ANOTARON SON: ");
		while(!esvacia()){
			Gol x=eliminar();
			x.Mostrar();
			aux.adicinar(x);
			
		}
               // System.out.println();
		vaciar(aux);
	}
	public int Nroelemntos(){
            int n=0;
            PilaGoles aux = new PilaGoles();
            while (!this.esvacia()) 
            {    aux.adicinar(this.eliminar());
                 n++; 
            }
            this.vaciar(aux);
            
            return  n;
                 
        }
	public void vaciar(PilaGoles z){
		while(!z.esvacia()){
			adicinar(z.eliminar());
			
		}
	}
}
