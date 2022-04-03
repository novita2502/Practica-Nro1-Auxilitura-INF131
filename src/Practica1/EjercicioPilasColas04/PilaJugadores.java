
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
public class PilaJugadores {
    private int max=30;
	private Jugador v[]= new Jugador[max];
	private int tope;
	
	public PilaJugadores() {
		
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
	public  void adicinar(Jugador elem){
		if(!esllena())
		{
			tope=tope+1;
			v[tope]=elem;
		}
		else
			System.out.println("Pila llena");
		
	}
	public Jugador eliminar(){
		Jugador elem =null;
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
               System.out.println("introducir cuantos jugadores tendra el equipo= ");
               int n= lee.nextInt();
               for (int i = 0; i < n; i++)
               {
                   System.out.print("Datos del jugador numero "+i+1+" =");
                   Jugador ele =new Jugador();
                  ele.LeerJ();
                  this.adicinar(ele);
               }
		
		
	}
	public void llenarRamdom(){
            int n = (int)(Math.random()*(12-10+1)+10);
            for (int i = 0; i <n; i++) 
            {
              Jugador j= new Jugador();
              this.adicinar(j);
            }
        }
	public void mostrar(){
		PilaJugadores aux = new PilaJugadores();
                System.out.println("el quipo tiene "+this.Nroelemntos()+" jugadores ");
		while(!esvacia()){
			Jugador x=eliminar();
			System.out.print("jugador "+(aux.Nroelemntos()+1)+" :");
                        x.Mostrar();
			aux.adicinar(x);
			
		}
               // System.out.println();
		vaciar(aux);
	}
	public int Nroelemntos(){
            int n=0;
            PilaJugadores aux = new PilaJugadores();
            while (!this.esvacia()) 
            {    aux.adicinar(this.eliminar());
                 n++; 
            }
            this.vaciar(aux);
            
            return  n;
                 
        }
	public void vaciar(PilaJugadores z){
		while(!z.esvacia()){
			adicinar(z.eliminar());
			
		}
	}
       public void OrdenarEdadMayorAMenor(){
           PilaJugadores aux1= new PilaJugadores();
           PilaJugadores aux2= new PilaJugadores();
            int may =0; Jugador Jmay=null;
            while (!this.esvacia()) 
            {               
                while (!this.esvacia())
            {               
              Jugador a= this.eliminar();
               if (a.getEdad()>may) 
               {
                   may=a.getEdad();
                   if (Jmay== null) { Jmay=a; } else {aux1.adicinar(Jmay);Jmay=a;}
               }
               else{aux1.adicinar(a);}
               
            }
                aux2.adicinar(Jmay);Jmay= null;may=0;this.vaciar(aux1);
           }
            aux1.vaciar(aux2);
            this.vaciar(aux1);
       }

    public Jugador[] getV() {
        return v;
    }

    public int getTope() {
        return tope;
    }
   
}
