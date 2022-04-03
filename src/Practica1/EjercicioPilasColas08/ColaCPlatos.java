/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1.EjercicioPilasColas08;

import java.util.Arrays;
import java.util.Scanner;

public class ColaCPlatos {
        int max=50;
	Plato v[]= new Plato[max];
	int ini,fin;
	public  ColaCPlatos() {
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


   public void adicionar (Plato elem)
    {
        if (!esllena ())
        {

            fin = (fin + 1) % max;
            v [fin] = elem;
        }
        else
            System.out.println ("Cola circular llena");
    }


   public Plato eliminar ()
    {
        Plato elem = null;
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
       Plato elem;
        if (esvacia ())
            System.out.println ("Cola vacia xxx");
        else
        {  
            System.out.println ("\n Datos de la Cola ");
            ColaCPlatos aux = new ColaCPlatos();
            int c=1;
            while (!esvacia ())
            {
                System.out.println ("plato nro"+c+". - ");
                elem = eliminar ();
                aux.adicionar (elem);
                elem.MostarPlato();
            }
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
        System.out.println("introducir el menu  que tiene 10 platos");
        int i; int n=10;
        for (i = 1 ; i <= n ; i++)
        {
            Plato elem = new Plato("", "", 0);
            elem.LeerPlato();
            while (this.VerificaNomPlato(elem.getNombre())) 
            {                
                   System.out.println("Yaexiste ese nombre de plato vuelva llenar=");  
                   elem.LeerPlato();   
            }
             while (this.VerificaCodigoPlato(elem.getCodigo())) 
            {                
                   System.out.println("Yaexiste ese nombre de plato vuelva llenar=");  
                   elem.LeerPlato();   
            }
            adicionar (elem);
        }
    }

    public void Llenaraletoriamente(){
        String[] veccodigo={"1d","2d","3d","4d","5d","6d","7d","8d","9d","10d"};
        String[] vecnomplatos={"Thimpu","Locro","Sopita de mani","pollo a la broaster","Caldo de  mani",
        "Lomo Montado","Milaneza","Silpancho","Mondongo","Chairo"};
               for (int i = 0; i <10; i++) {
             int pos = (int)(Math.random()*(9-0+1)+0);
             String cod=veccodigo[pos];
             while (this.VerificaCodigoPlato(cod))
             {                
              pos = (int)(Math.random()*(9-0+1)+0);
              cod=veccodigo[pos];    
            }
             int posn = (int)(Math.random()*(9-0+1)+0);
             String nom=vecnomplatos[posn];
             while (this.VerificaNomPlato(nom))
             {                
              pos = (int)(Math.random()*(9-0+1)+0);
              nom=vecnomplatos[pos];    
            }
            double pos3 = (double)(Math.random()*(20-8+1)+8);
            Plato plato= new Plato(nom,cod, pos3);
            this.adicionar(plato);
        }
    }

    public boolean  VerificaNomPlato(String np){
        boolean s= false;
        int nro=this.nroelem();
        for (int i = 0; i < nro; i++)
        {     Plato p =this.eliminar();this.adicionar(p);
             if (np.equals(p.getNombre()))
             {
               s= true; break;   
            }
        }
          return  s;
    }
     public boolean  VerificaCodigoPlato(String codigo){
        boolean s= false;
        int nro=this.nroelem();
        for (int i = 0; i < nro; i++)
        {     Plato p =this.eliminar();this.adicionar(p);
             if (codigo.equals(p.getCodigo()))
             {
               s= true; break;   
            }
        }
          return  s;
    }
     public double RetornaPrecioDelcodigo(String codigo )
     {
          double precio=0;
          if (this.VerificaCodigoPlato(codigo)) 
          {
             int ele= this.nroelem();
              for (int i = 0; i < ele; i++)
              {
                  Plato p= this.eliminar();this.adicionar(p);
                  if (p.getCodigo().equals(codigo))
                  {
                     precio=p.getPrecio();
                  }
                  
              }
         } else {
              System.out.println("no existe ese plato");
         }
          return precio;
     }
     public String RetornaNombeeplato(String nombre){
         String codigo= null;
         if (this.VerificaNomPlato(nombre)) 
         {
               int nro= this.nroelem();
               for (int i = 0; i < nro; i++)
               {
                   Plato a= this.eliminar(); this.adicionar(a);
                   if (a.getNombre().equals(nombre))
                   {
                      codigo=a.getCodigo();
                   }
             }
         } else {
             System.out.println("no esite  plato con ese nombre");
         }
         return codigo;
     }

   public void vaciar (ColaCPlatos a)
    {
        while (!a.esvacia ())
            adicionar (a.eliminar ());

    }
}
