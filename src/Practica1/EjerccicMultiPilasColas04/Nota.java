
package Practica1.EjerccicMultiPilasColas04;

import java.util.Scanner;

public class Nota {
    public String nombre;
    public int notafinal;
    public Nota() {
     String[] vecnombres={"Angel","juan","miguel","pedro","manuel","serapio","tom ate","ronaldiño","messi"};
      int pos = (int)(Math.random()*(7-0+1)+0);
      nombre=vecnombres[pos];
      int numero = (int)(Math.random()*(100-34+1)+34);
      notafinal=numero;   
    }
    public void LeerNota(){
        Scanner lee= new Scanner(System.in);
        System.out.print("introducir el nombre=");
        nombre=lee.nextLine();
        System.out.print("introducir la  nota final de "+nombre+" =");
        notafinal=lee.nextInt();
        lee.nextLine();
    }
    public void MostrarNota(){
        System.out.println("nombre= "+nombre+" nota final= "+notafinal);
    }

    public String getNombre() {
        return nombre;
    }

    public int getNotafinal() {
        return notafinal;
    }
    
}
