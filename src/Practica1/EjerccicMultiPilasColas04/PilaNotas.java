
package Practica1.EjerccicMultiPilasColas04;

import java.util.Scanner;


public class PilaNotas {
      private int max;
	private Nota v[];
	private int tope;
	
	public PilaNotas() {
		max=100;
                v= new Nota [max];
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
	public  void adicinar(Nota elem){
		if(!esllena())
		{
			tope=tope+1;
			v[tope]=elem;
		}
		else
			System.out.println("Pila llena");
		
	}
	public Nota  eliminar(){
		Nota elem =null;
		if(!esvacia()){
			elem=v[tope];
			tope=tope-1;
		}
		else
			System.out.println("Pila vacia");
		return elem;
	}
	
	
	public void mostrar(){
		PilaNotas aux = new PilaNotas();
                int c=0;
		while(!esvacia()){
			Nota x=eliminar();
                        aux.adicinar(x);
                        c++;
                        System.out.print("Nro"+c+".- ");x.MostrarNota();
			
                        }
               // System.out.println();
		vaciar(aux);
	}
	public int Nroelemntos(){
            int n=0;
            PilaNotas aux = new PilaNotas();
            while (!this.esvacia()) 
            {    aux.adicinar(this.eliminar());
                 n++; 
            }
            this.vaciar(aux);
            
            return  n;
                 
        }
	public void vaciar(PilaNotas z){
		while(!z.esvacia()){
			adicinar(z.eliminar());
			
		}
	}
        public int CantidadAprobados(){
            int cantidad=0;
            PilaNotas au= new PilaNotas();
            while (!this.esvacia()) 
            {                
                 Nota n= this.eliminar();
                 au.adicinar(n);
                 if (n.getNotafinal()>50)
                 {
                    cantidad++;   
                }
            }
            this.vaciar(au);
            return  cantidad;
        }
        public int CantidadReprobados(){
            int cantidad=0;
            PilaNotas au= new PilaNotas();
            while (!this.esvacia()) 
            {                
                 Nota n= this.eliminar();
                 au.adicinar(n);
                 if (n.getNotafinal()<51)
                 {
                    cantidad++;   
                }
            }
            this.vaciar(au);
            return  cantidad;
        }
        public int SumaNotasAprobados(){
            int suma=0;
            PilaNotas au= new PilaNotas();
            while (!this.esvacia()) 
            {                
                 Nota n= this.eliminar();
                 au.adicinar(n);
                 if (n.getNotafinal()>51)
                 {
                    suma= suma+n.getNotafinal();
                }
            }
            this.vaciar(au);
            return  suma;
        }
        public void llenar(){
            Scanner lee=new Scanner(System.in);
            System.out.print("cuantas elementos tendra la pila = ");
            int n= lee.nextInt();
            for (int i = 0; i < n; i++)
            {
               Nota k= new Nota();
               k.LeerNota();
               this.adicinar(k);
            }
        }
        public void llenaraletoriamente(){
            int n=(int)(Math.random()*(15-1+1)+1);
            for (int i = 0; i < n; i++)
            {
               Nota k= new Nota();
               this.adicinar(k);
            }
        }
}
