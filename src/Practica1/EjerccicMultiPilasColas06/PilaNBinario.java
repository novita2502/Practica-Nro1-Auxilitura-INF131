
package Practica1.EjerccicMultiPilasColas06;
import java.util.Scanner;


public class PilaNBinario {
      private int max;
	private int v[];
	private int tope;
	
	public PilaNBinario() {
		max=100;
                v= new int [max];
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
	public  void adicinar(int elem){
		if(!esllena())
		{
			tope=tope+1;
			v[tope]=elem;
		}
		else
			System.out.println("Pila llena");
		
	}
	public int eliminar(){
		int elem =Integer.MIN_VALUE;
		if(!esvacia()){
			elem=v[tope];
			tope=tope-1;
		}
		else
			System.out.println("Pila vacia");
		return elem;
	}
	
	
	public void mostrar(){
		PilaNBinario aux = new PilaNBinario();
                int c=0;
		while(!esvacia()){
			int x=eliminar();
                        aux.adicinar(x);
                        c++;
                        System.out.print(x+" ");
			
                        }
               // System.out.println();
		vaciar(aux);
	}
	public int Nroelemntos(){
            int n=0;
            PilaNBinario aux = new PilaNBinario();
            while (!this.esvacia()) 
            {    aux.adicinar(this.eliminar());
                 n++; 
            }
            this.vaciar(aux);
            
            return  n;
                 
        }
	public void vaciar(PilaNBinario z){
		while(!z.esvacia()){
			adicinar(z.eliminar());
			
		}
	}
       
        public void llenar(){
            Scanner lee=new Scanner(System.in);
            System.out.print("cuantas elementos tendra la pila = ");
            int n= lee.nextInt();
            for (int i = 0; i < n; i++)
            {
                System.out.print("introducir  1 o 0 =");  
                int k= lee.nextInt();
                while (k>1) 
                {  System.out.print("introducir  1 o 0 =");                  
                   k= lee.nextInt(); 
                }
              
               this.adicinar(k);
            }
        }
        public void llenaraletoriamente(){
            int n=(int)(Math.random()*(100-10+1)+10);
            String binario = Long.toBinaryString(n);
            for (int i = 0; i <binario.length(); i++)
            {
                 String g= " "+binario.charAt(i);
                 g=g.trim();
                int k= Integer.parseInt(g);
               this.adicinar(k);
            }
        }
        public void MostrarBaseDecimal(){
            String binario="";
            PilaNBinario au= new PilaNBinario();
            while (!this.esvacia())
            {                
                 int a=this.eliminar();
                 au.adicinar(a);
                 String ad= Integer.toString(a);
                 binario=binario+ad;
            }
            this.vaciar(au);
            int decimal=Integer.parseInt(binario,2);
            System.out.println("numero binario = "+binario+" en base  decimal es "+decimal);
        }
        public void MostrarBaseDecimal2(){
            String binario="";
            PilaNBinario au= new PilaNBinario();
            while (!this.esvacia())
            {                
                 int a=this.eliminar();
                 au.adicinar(a);
                 String ad= Integer.toString(a);
                 binario=binario+ad;
            }
            binario= binario.trim();
            StringBuilder strb = new StringBuilder(binario);
            binario= strb.reverse().toString();
            boolean esnumero= binario.matches("[+-]?\\d*(\\.\\d+)?" );
            if (esnumero)
            {
               int decimal=Integer.parseInt(binario,2);  
               System.out.println("numero binario = "+binario+" en base  decimal es "+decimal);
            } else {
                System.out.println("no es numero decimal");
            }
            this.vaciar(au);
            
        }
        public int CantidadCero(){
            int c=0;
            PilaNBinario p= new PilaNBinario();
            while (!this.esvacia())
            {                
               int e= this.eliminar();
               p.adicinar(e);
                if (e==0) {c++;
                    
                }
            }
            this.vaciar(p);
            return  c;
        } public int CantidadUnos(){
            int c=0;
            PilaNBinario p= new PilaNBinario();
            while (!this.esvacia())
            {                
               int e= this.eliminar();
                p.adicinar(e);
                if (e==1) {c++;
                    
                }
            }
             this.vaciar(p);
            return  c;
        }
        public void BalanceCerosUnos(){
            int cero= this.CantidadCero();
            int uno=this.CantidadUnos();
            PilaNBinario au= new PilaNBinario();
            if (cero!=uno& cero!=0& uno!=0)
            {     if (cero>uno)
                {  int celi=cero-uno;
                   int c=0;
                    while (!this.esvacia())
                    { int e= this.eliminar();
                        if (e!=0) { au.adicinar(e);
                        } else {c++;
                            if (c>celi) {   au.adicinar(e); }
                        }                 
                    }                       
                } else {int celi=uno-cero;
                   int c=0;
                    while (!this.esvacia())
                    { int e= this.eliminar();
                        if (e!=1) { au.adicinar(e);
                        } else {c++; if (c>celi) { au.adicinar(e);}
                        }                       
                    }      }       this.vaciar(au);
            }
            
        }
 }
