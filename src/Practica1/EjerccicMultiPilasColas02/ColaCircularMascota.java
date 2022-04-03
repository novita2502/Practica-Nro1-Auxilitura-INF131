
package Practica1.EjerccicMultiPilasColas02;


import java.util.Scanner;

public class ColaCircularMascota {
    int max=100;
	Mascota v[]= new Mascota[max];
	int ini,fin;
	public  ColaCircularMascota() {
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


   public void adicionar (Mascota elem)
    {
        if (!esllena ())
        {

            fin = (fin + 1) % max;
            v [fin] = elem;
        }
        else
            System.out.println ("Cola circular llena");
    }

   public Mascota eliminar ()
    {
        Mascota elem = null;
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
       Mascota elem;
        if (esvacia ())
            System.out.println ("Cola vacia xxx");
        else
        {  
            System.out.println ("\n Datos de la Cola circular "+this.nroelem()+" elemntos");
            ColaCircularMascota aux = new ColaCircularMascota();
            int c=1;
            while (!esvacia ())
            {
               
                elem = eliminar ();
                aux.adicionar (elem);
                System.out.print("Mascota "+c+" . - ");c++;
                elem.MostrarMascota();
                System.out.println("");
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
        System.out.print("introducir cuantas mascotas   tendra la cola= ");
        int i; int n=lee.nextInt();
        for (i = 1 ; i <= n ; i++)
        {
            Mascota ele=new Mascota();
            ele.leerMascota();
            adicionar (ele);
        }
    }

    public void Llenaraletoriamente(){
        // genera una colas  desde 8 hasta 40 mascotas
        int n= (int)(Math.random()*(20-1+1)+1);
               for (int i = 0; i <n; i++) {
             Mascota ele=  new Mascota();
             this.adicionar(ele);
        }
    }
   public int ContarTipoXF(String tipo){//clase ColacircularMascota
       int c=0;
       int nro= this.nroelem();
       for (int i = 0; i < nro; i++) 
       {
            Mascota m= this.eliminar();this.adicionar(m);
            if (!m.sexo & tipo.equals(m.getTipo()))
            { c++; }
       }
       
       return c;
   }
   public void eliminarMacotasmenor2a(){//clase ColaCircularMascotas
       int nro= this.nroelem();
       int c=0;
       for (int i = 0; i < nro; i++)
       {
          Mascota m= this.eliminar();
           if (m.getEdad()>1) 
           {
               this.adicionar(m);
              
           }else c++;
       }
       System.out.println("se elimino a "+c+" mascotas");
   }
   public void llevarGatoAdelante(){//clase ColaCircularMascotas
       ColaCircularMascota au= new ColaCircularMascota();
       int nro= this.nroelem();
       for (int i = 0; i < nro; i++)
       {
          Mascota m= this.eliminar();
           if (m.getTipo().equals("perro"))
           {
               au.adicionar(m);
           } else {
               this.adicionar(m);
           }
       }
       this.vaciar(au);
   }
    

   public void vaciar (ColaCircularMascota a)
    {
        while (!a.esvacia ())
        adicionar (a.eliminar ());

    }
   
}
