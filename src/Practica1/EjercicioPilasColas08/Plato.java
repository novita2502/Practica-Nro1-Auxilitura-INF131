
package Practica1.EjercicioPilasColas08;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Plato {
    private String nombre,codigo;
    private double precio;

    public Plato(String nombre, String codigo, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }
    public void MostarPlato()
    {   DecimalFormat formato1 = new DecimalFormat("#.00");
    
        System.out.println("nombre del plato= "+nombre+" codigo= "+codigo+" precio= "+formato1.format(precio));
    }
    public void LeerPlato(){
        Scanner lee = new Scanner(System.in);
        System.out.print("nombre del Plato=");
        nombre=lee.nextLine();
        System.out.print(" codigo del plato introduzcaun  numero de 1 al 10= ");int a=lee.nextInt();
        while (a<0|| a > 9)
        {            
          System.out.print(" codigo del plato numero de 1 al 10= ");a=lee.nextInt();  
        }
        codigo = Integer.toString(a)+"d";
        System.out.print("introduza el precio del plato "+nombre+" = ");
        precio= lee.nextDouble();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }
    
}
