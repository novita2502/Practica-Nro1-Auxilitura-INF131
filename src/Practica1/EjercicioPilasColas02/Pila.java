/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1.EjercicioPilasColas02;

import java.util.Scanner;

/**
 *
 * @author ANGELO
 */
public class Pila {
        private int max=30;
	private String  v[]= new String [max];
	private int tope;
	
	public Pila() {
		
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
                      this.adicinar(Ele.substring(i,i+1));
                        
                    }
		}
		
	}
	
	public void mostrar(){
		Pila aux = new Pila();
		while(!esvacia()){
			String x=eliminar();
			System.out.print(x+"");
			aux.adicinar(x);
			
		}
               // System.out.println();
		vaciar(aux);
	}
	public int Nroelemntos(){
            int n=0;
            Pila aux = new Pila();
            while (!this.esvacia()) 
            {    aux.adicinar(this.eliminar());
                 n++; 
            }
            this.vaciar(aux);
            
            return  n;
                 
        }
	public void vaciar(Pila z){
		while(!z.esvacia()){
			adicinar(z.eliminar());
			
		}
	}
        public void Balanceado(){
            Pila Aux1= new Pila();Pila Aux2= new Pila();
            String c="correct"; String in="incorrect";int sw=0;
            if (this.Nroelemntos()%2==0 )
            {
                while (!this.esvacia()&&sw==0) 
                {   String dato=this.eliminar();Aux1.adicinar(dato);
                    if (dato.equals("{")||dato.equals("[")||dato.equals("(")) Aux2.adicinar(dato);
                    else {if (dato.equals("}")||dato.equals(")")||dato.equals("]")) 
                        {if (!Aux2.esvacia())
                        {String dato2= Aux2.eliminar();
                            if (dato.equals("["))if (!dato2.equals("]"))sw=2; 
                              else {
                                if (dato.equals("("))if (!dato2.equals(")")) sw=2; 
                                else if (!dato2.equals("}"))sw=2; 
                                   }
                        } else sw=2;
                        } else sw=2;
                        }
                }
                if (sw==0){this.vaciar(Aux1);this.mostrar();System.out.println(" ==> "+c);  }  
                else{System.out.println(" ==> "+in);Aux2.vaciar(this);this.vaciar(Aux1);}
               
            } else{ System.out.println(" ==> "+in);}
     }
}
