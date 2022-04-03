/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1.EjercicioPilasColas08;

import Practica1.EjercicioPilasColas06.ColaSCaracteres;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author ANGELO
 */
public class ColaSPedidos {
    int max=50;
	Pedido v[]= new Pedido[max];
	int ini,fin;
	public ColaSPedidos()
        {
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


    public void adicionar (Pedido elem)
    {
	if (!esllena ())
	{
	    fin++;
	    v [fin] = elem;
	}
	else
	    System.out.println ("Cola Simple llena");
    }


   public  Pedido eliminar ()
    {
	Pedido elem = null;
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
	 Pedido elem;
	if (esvacia ())
	    System.out.println ("Cola vacia");
	else
	{
	    System.out.println ("\n Datos de la Cola ");
	    int c=0;
	     ColaSPedidos aux = new ColaSPedidos();
	    while (!esvacia ())
	    {
		elem = eliminar ();
		aux.adicionar (elem);
                c++;
		System.out.println("pedido nro"+c+": ");
                elem.MostrarPedido();
	    }
	    while (!aux.esvacia ())
	    {
		elem = aux.eliminar ();

		adicionar (elem);
	    }
	}
        System.out.println("");
    }


   public  void llenar ()
    {
	Scanner lee = new Scanner (System.in);
        System.out.println("cuantos pedidos tendra la cola simple ");  
        int n =lee.nextInt();
        int i;
	for (i = 1 ; i <= n ; i++)
	{
	     Pedido z = new Pedido();
              z.LeerPedido();
             adicionar (z);
	}
    }
    public   void llenarAletoriamente ()
    {
	       int pos = (int)(Math.random()*(20-1+1)+1);
	       for (int i = 0; i < pos; i++)
               {
                   
                  Pedido z = new Pedido();
                    adicionar (z);
               }
        
    }
    
    
    public void vaciar (ColaSPedidos a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());

    }
    public void CalcularCuenta(ColaCPlatos p,String nom, String fecha)
    {  // clase cola simple de pedidos 
        double cuenta=0;
        ColaSPedidos au= new ColaSPedidos();
        Pedido pe=null;
        while (!this.esvacia())
        {            
            Pedido pedido= this.eliminar();
            if (pedido.getFecha().equals(fecha)& pedido.getCliente().getNombre().equals(nom))
            {
                if (p.VerificaCodigoPlato(pedido.getCodigoPlato()))
             {
              cuenta= cuenta+(p.RetornaPrecioDelcodigo(pedido.getCodigoPlato())*pedido.cantidadPlatos);
              pe=pedido;
              }    
            }
            au.adicionar(pedido);
        }
        this.vaciar(au);
        if (cuenta==0) {
            System.out.println("no exite consumo ");
        } else {
            DecimalFormat formato1 = new DecimalFormat("#.00");
            System.out.println("--------------TOtAL GASTOS MESA Nro "+pe.getNumMesa()+
             " del cliente "+pe.getCliente().getNombre()+"="+formato1.format(cuenta));
        }
    }
    public void eliminarPedidoPlatodNombre(String nomplato, ColaCPlatos cplatos){
        if (cplatos.VerificaNomPlato(nomplato))
        {
           ColaSPedidos au= new ColaSPedidos();
           String codigo=cplatos.RetornaNombeeplato(nomplato);
            while (!this.esvacia()) 
            {                
               Pedido p= this.eliminar();
                if (!p.getCodigoPlato().equals(codigo)) {
                    au.adicionar(p);
                    
                }
                else System.out.println("Sea eliminado el pedido de codigo "+p.getCodigoPlato());
            }
            this.vaciar(au);
        } else {
            System.out.println("no existe  plato con ese nombre en el menu");
        }
        
    }
    
}
