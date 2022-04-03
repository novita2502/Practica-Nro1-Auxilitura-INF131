
package Practica1.EjerccicMultiPilasColas02;

import java.util.Scanner;

public class Mascota {
    private String nombreMascota,tipo;// tod tipos perro y gato 
    boolean sexo; private int edad;// sexo Macho true , hermbra false

    public Mascota() {
      // generar  aletoreamente  la edad 1 al 12 y el nombre de vector de nombre 
      String[] vecnombres={"Luna","roky","balu","shira","layca","bonita","tayger","Lobo","Angel"};
      int pos = (int)(Math.random()*(7-0+1)+0);
      nombreMascota=vecnombres[pos];
      int numero = (int)(Math.random()*(12-1+1)+1);
      edad=numero;
      String[] vectipo={"perro","gato"};
      int p = (int)(Math.random()*(1-0+1)+0);
      tipo=vectipo[p];
      boolean[] vecsexo={true,false};
      int bo = (int)(Math.random()*(1-0+1)+0);
      sexo=vecsexo[bo];
    }
    public  void leerMascota(){
        Scanner lee= new Scanner(System.in);
        System.out.print("introducir nombre de la mascota=");
        nombreMascota= lee.next();
        System.out.print(nombreMascota+"es  un perro o gato introducir tipo=");
        String tipo= lee.nextLine();
        tipo= tipo.toLowerCase();
        while (!tipo.equals("perro")||!tipo.equals("gato"))
        {            
            System.out.print(nombreMascota+"es perro o gato escribir cual es=");
            tipo= lee.nextLine();
            tipo= tipo.toLowerCase();
        }
        System.out.print("introduzca un 1 si es macho y un cero si hermba=");
        int c=lee.nextInt();
        while (c>1)
        {            
          System.out.print("introduzca un 1 si es macho y un cero si hermba=");
        c=lee.nextInt();     
        }
        if (c==1) { sexo= true;            
        } else {sexo= false;}
        System.out.print("que edad tiene "+nombreMascota+" = ");
        edad= lee.nextInt();
    }
    public  void MostrarMascota(){
        System.out.print("nombre= "+nombreMascota+" edad "+edad+" tipo= "+tipo);
        if (sexo) {System.out.print(" es macho ");} else {System.out.print(" es  hembra");}
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }
    
    
}
