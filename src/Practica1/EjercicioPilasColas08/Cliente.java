/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1.EjercicioPilasColas08;

import java.util.Scanner;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

public class Cliente {
    private String nombre;
    private int nit;

    public Cliente() {
      String[] vecnombres={"Angel","juan","miguel","pedro","manuel","serapio","tom ate","ronaldiño","messi"};
      int pos = (int)(Math.random()*(7-0+1)+0);
      nombre=vecnombres[pos];
      int nt = (int)(Math.random()*(99999999-11111111+1)+111);
      nit=nt;
    }
    public void MostrardatosCliente(){
        System.out.println("nombre= "+nombre+" nit= "+nit);
    }
    public void LeerDatosCliente(){
        Scanner lee= new Scanner(System.in);
        System.out.print("introducir el nombre=");
        nombre= lee.nextLine();
        System.out.print("introducir el nit de "+nombre+" = ");
        nit= lee.nextInt();
        
    }
    public String getNombre() {
        return nombre;
    }

    public int getNit() {
        return nit;
    }
    
    
}
