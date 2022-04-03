
package Practica1.EjercicioPilasColas06;

import java.util.Arrays;
import java.util.Scanner;

public class ColaSCaracteres {
    int max=50;
	Character v[]= new Character[max];
	int ini,fin;
	public ColaSCaracteres(){
		ini=fin=0;
	}

   public boolean esvacia ()
    {
	if (ini == 0 && fin == 0)
	    return (true);
	return (false);
    }


    public boolean esllena ()
    {
	if (fin == max)
	    return (true);
	return (false);
    }


    public int nroelem ()
    {
	return (fin - ini);
    }


    public void adicionar (Character elem)
    {
	if (!esllena ())
	{
	    fin++;
	    v [fin] = elem;
	}
	else
	    System.out.println ("Cola Simple llena");
    }


   public  Character eliminar ()
    {
	Character elem = null;
	if (!esvacia ())
	{
	    ini++;
	    elem = v [ini];
	    if (ini == fin)
		ini = fin = 0;
	}
	else
	    System.out.println ("Cola Simple vacia");
	return (elem);
    }


    public void mostrar ()
    {
	 Character elem;
	if (esvacia ())
	    System.out.println ("Cola vacia");
	else
	{
	    System.out.println ("\n Datos de la Cola ");
	    
	           ColaSCaracteres aux = new ColaSCaracteres();
	    while (!esvacia ())
	    {
		elem = eliminar ();
		aux.adicionar (elem);
		System.out.print(elem+", ");;
	    }
	    while (!aux.esvacia ())
	    {
		elem = aux.eliminar ();

		adicionar (elem);
	    }
	}
        System.out.println("");
    }


   public  void llenar (int n)
    {
	Scanner lee = new Scanner (System.in);
        System.out.println("cuantos carcateres tendra la cola simple ");      
        int i;
	for (i = 1 ; i <= n ; i++)
	{
	    Character z = lee.next().charAt(0);
	    adicionar (z);
	}
    }
    public   void llenar (String x)// sobrecarga de metodo al cual recibe un string "a,b,c,c,c"con el cual se llena la cola
    {
	       
	       for (int i = 0; i < x.length(); i++)
               {
                   
                   if (x.charAt(i)!=','&x.charAt(i)!=';'& x.charAt(i)!='.'& x.charAt(i)!=' ') {
                       this.adicionar(x.charAt(i));
                   }
               }
        
    }
    
    
    public void vaciar (ColaSCaracteres a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());

    }
    public ColaSCaracteres ColaSordena( ){// retorn la cola copia this ordenada
       ColaSCaracteres ordenada= new ColaSCaracteres();
       ColaSCaracteres aux= new ColaSCaracteres();
       String cadena="";
        while (!this.esvacia())
        {            
          Character c= this.eliminar();
          cadena=cadena+c;
          aux.adicionar(c);
        }
          String vc[]=cadena.split("");
          Arrays.sort(vc);
          cadena=vc.toString();
          
          
  
       return  ordenada;
       
    } 
    public int Nveces(Character a)
    { // clae ColaCarcateres  retorna la cantidad de veces que repite un elemento 
        int n=1;ColaSCaracteres au= new ColaSCaracteres();
        while (!this.esvacia()) 
        { Character g=this.eliminar();
          if (g.equals(a)) {n++;}
            au.adicionar(g);
        }
        this.vaciar(au);
        return  n;
    }
    public void OrdenAscendente(){
         // clase Colacarcateres ordena de menor a mayor veces repeticion
         ColaSCaracteres au= new ColaSCaracteres();
         ColaSCaracteres ordenado= new ColaSCaracteres();
         while (!this.esvacia())
         {            
            int men=9999;Character menor=null;
             while (!this.esvacia())
             { Character d= this.eliminar();
                    if (this.Nveces(d)<men) {
                     menor=d;men=this.Nveces(d);
                 }
                 
                 au.adicionar(d);
             }
              this.vaciar(au);
             while (!this.esvacia())
             { Character d= this.eliminar();
                 if (menor.equals(d)) {ordenado.adicionar(d);
                 } else {
                     au.adicionar(d);
                 }
             }
             this.vaciar(au);
        }
        this.vaciar(ordenado);
    }
    public void OrdenDecendente(){
        // clase Colacarcateres ordena de mayor a menor veces repeticion
         ColaSCaracteres au= new ColaSCaracteres();
         ColaSCaracteres ordenado= new ColaSCaracteres();
         while (!this.esvacia())
         {            
            int may=0;Character mayor=null;
             while (!this.esvacia())
             { Character d= this.eliminar();
                 if (this.Nveces(d)>may) {
                     mayor=d;may=this.Nveces(d);
                 }
                au.adicionar(d);
             }
             this.vaciar(au);
             while (!this.esvacia())
             { Character d= this.eliminar();
                 if (mayor.equals(d)) {ordenado.adicionar(d);
                 } else {
                     au.adicionar(d);
                 }
             }
             this.vaciar(au);
        }
        this.vaciar(ordenado);
    }
    
}
