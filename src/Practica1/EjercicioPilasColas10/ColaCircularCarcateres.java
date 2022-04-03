
package Practica1.EjercicioPilasColas10;

import java.util.Scanner;

public class ColaCircularCarcateres {
     int max=50;
	char v[]= new char [max];
	int ini,fin;
	public  ColaCircularCarcateres() {
		ini=fin=0;
                
	}
	
public	int nroelem ()
    {
        return ((max + fin - ini) % max);
    }


 public   boolean esvacia ()
    {
        if (nroelem () == 0)
            return (true);
        return (false);
    }


   public boolean esllena ()
    {
        if (nroelem () == max - 1)
            return (true);
        return (false);
    }


   public void adicionar (char elem)
    {
        if (!esllena ())
        {

            fin = (fin + 1) % max;
            v [fin] = elem;
        }
        else
            System.out.println ("Cola circular llena");
    }

   public char eliminar ()
    {
        Character elem = null;
        if (!esvacia ())
        {
            ini = (ini + 1) % max;
            elem = v [ini];
            if (nroelem () == 0)
                ini = fin = 0;
        }
        else
            System.out.println ("Cola circular vacia");
        return (elem);
    }


   public void mostrar ()
    {
       char elem;
        if (esvacia ())
            System.out.println ("Cola vacia xxx");
        else
        {  
            System.out.println ("\n Datos de la Cola circular ");
            ColaCircularCarcateres aux = new ColaCircularCarcateres();
            int c=1;
            while (!esvacia ())
            {
               
                elem = eliminar ();
                aux.adicionar (elem);
                System.out.print (elem+" ");
            }
            System.out.println("");
            while (!aux.esvacia ())
            {
                elem = aux.eliminar ();

                adicionar (elem);
            }
        }
    }


   public void llenar ()
    {
       Scanner lee= new Scanner (System.in) ;
        System.out.println("introducir numero  caracteres que tendra la cola");
        int i; int n=lee.nextInt();
        for (i = 1 ; i <= n ; i++)
        {
            char ele= lee.next().charAt(0);
            adicionar (ele);
        }
    }

    public void Llenaraletoriamente(){
        char[] veccodigo={'a','b','c','d','e','f','g','h','i','j',
        'k','l','m','n','o','p','q','r','s','t','u','w','x','y','z'};
        int n= (int)(Math.random()*(30-8+1)+8);
               for (int i = 0; i <n; i++) {
             int pos = (int)(Math.random()*(24-0+1)+0);
             char cod=veccodigo[pos];
             this.adicionar(cod);
        }
    }

    public void VerificaPalabraX (String x){//  clase ColaCircularCaracteres
       int nro= this.nroelem();
       String texto="";
        for (int i = 0; i < nro; i++)
        {
             char e=this.eliminar();
             this.adicionar(e);
             texto=texto+e;
             
        }
        if (texto.contains(x))
        {
            System.out.println("Si se encuentra el texto "+x+" ");    
        } else {
            System.out.println("NO se encuentra el texto "+x+" "); 
        }
    }
   
 

   public void vaciar (ColaCircularCarcateres a)
    {
        while (!a.esvacia ())
            adicionar (a.eliminar ());

    }
}
