/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1.EjercicioPilasColas08;

import java.util.Scanner;

public class Pedido {
    // codigo  de plato es numero del 1 al 10 seguido "d" ejemplo "1d"
    public  int numMesa,cantidadPlatos;
    private String fecha,codigoPlato;
    private Cliente cliente;

    public Pedido() {
    // genera un pedido aletoriamente
      String[] vecfecha={"01/03/2022","02/03/2022","04/03/2022","06/03/2022","15/03/2022","22/03/2022","23/03/2022","28/03/2022","01/04/2022"};
      int pos = (int)(Math.random()*(7-0+1)+0);
      fecha=vecfecha[pos];
       String[] veccodigo={"1d","2d","3d","4d","5d","6d","7d","8d","9d","10d"};
      int pos2 = (int)(Math.random()*(9-0+1)+0);
       codigoPlato= veccodigo[pos2];
      int nt2 = (int)(Math.random()*(10-1+1)+1);
      cantidadPlatos=nt2;
      cliente= new Cliente();
      int pos3 = (int)(Math.random()*(15-1+1)+1);
      numMesa=pos3;
    }
    public void LeerPedido(){
        Scanner lee= new Scanner (System.in) ;
        System.out.print("introducir fecha del pedido (ejemplo 01/02/2022)=");
        fecha= lee.next();
        System.out.print("introducirnumero de mesa= ");numMesa= lee.nextInt();
        System.out.print(" codigo del plato numero de 1 al 10= ");int a=lee.nextInt();
        while (a<0|| a > 9)
        {            
          System.out.print(" codigo del plato numero de 1 al 10= ");a=lee.nextInt();  
        }
        codigoPlato = Integer.toString(a)+"d";
        System.out.print("cantidad de platos a pedir = ");cantidadPlatos= lee.nextInt();
        cliente.LeerDatosCliente();
        
    }
    public  void MostrarPedido(){
        System.out.println("fecha= "+fecha+" codigo del plato= "+codigoPlato+" cantidad= "+cantidadPlatos);
        System.out.print(" datos del cliente. - "); cliente.MostrardatosCliente();
    }

    public int getNumMesa() {
        return numMesa;
    }

    public int getCantidadPlatos() {
        return cantidadPlatos;
    }

    public String getFecha() {
        return fecha;
    }

    public String getCodigoPlato() {
        return codigoPlato;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    
    
}
