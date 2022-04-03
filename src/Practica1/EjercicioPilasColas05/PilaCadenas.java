/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1.EjercicioPilasColas05;

import Practica1.EjercicioPilasColas02.Pila;

/**
 *
 * @author ANGELO
 */
public class PilaCadenas {
     private int max=30;
	private String  v[]= new String [max];
	private int tope;
	
	public PilaCadenas() {
		
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
	public  void adicinar(String elem){
		if(!esllena())
		{
			tope=tope+1;
			v[tope]=elem;
		}
		else
			System.out.println("Pila llena");
		
	}
	public String  eliminar(){
		String elem = "";
		if(!esvacia()){
			elem=v[tope];
			tope=tope-1;
		}
		else
	        System.out.println("Pila vacia");
		return elem;
	}
	public void llenar(String Ele)
        {
               
	           	
            for (int i = Ele.length()-1; i >=0; i--) {
	             if (!Ele.substring(i,i+1).equals(" "))
                    {
                      //  System.out.println(Ele.substring(i,i+1));
                      this.adicinar(Ele.substring(i,i+1));
                        
                    }
		}
		
	}
	public  void Capicua(){
            PilaCadenas aux1= new PilaCadenas();
             aux1=this.CopiaInvertida();
            int sw=0;
            PilaCadenas au= new PilaCadenas();
            while (!this.esvacia())
            {                
                 String ele=this.eliminar();
                 String ele2=aux1.eliminar();
                 au.adicinar(ele);
                 if (!ele.equals(ele2))
                 {
                    sw=2;   
                 }
            }
            if (sw==0)
            {
                System.out.println("True");
            } else {System.out.println("False");
            }
            
            
            
        }
        public PilaCadenas CopiaInvertida(){
            PilaCadenas copia= new PilaCadenas(); 
            PilaCadenas  aux3=new PilaCadenas();
            while (!this.esvacia())
            {                
                String d= this.eliminar();
                copia.adicinar(d);
                aux3.adicinar(d);
                
            }
            this.vaciar(copia);
            return  aux3;
        }
	public void mostrar(){
		PilaCadenas aux = new PilaCadenas();
		while(!esvacia()){
			String x=eliminar();
			System.out.println(x+"");
			aux.adicinar(x);
			
		}
               // System.out.println();
		vaciar(aux);
	}
	public int Nroelemntos(){
            int n=0;
            PilaCadenas aux = new PilaCadenas();
            while (!this.esvacia()) 
            {    aux.adicinar(this.eliminar());
                 n++; 
            }
            this.vaciar(aux);
            
            return  n;
                 
        }
	
    public void vaciar(PilaCadenas z) {
        while(!z.esvacia()){
		adicinar(z.eliminar());
			
		}
    
    }
}
