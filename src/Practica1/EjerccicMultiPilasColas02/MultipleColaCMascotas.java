
package Practica1.EjerccicMultiPilasColas02;

import java.util.Scanner;

public class MultipleColaCMascotas {
    private int max, n;
    private ColaCircularMascota vec[];

    public MultipleColaCMascotas() {
    max= 100;
    n=0;
    vec= new  ColaCircularMascota[100];
        for (int i = 0; i < max; i++) {vec[i]=new ColaCircularMascota();}
     }
    public boolean Esvacia(int i){
        return vec[i].esvacia();
    }
    public boolean Esllena(int i){
        return vec[i].esllena();
    }
    public void Adicionar(int i , Mascota m){
        vec[i].adicionar(m);
    }
    public Mascota eliminar(int i){
        return vec[i].eliminar();
    }
    public void mostrar(int i){
        vec[i].mostrar();
    }
    public void mostrar(){
        int j;
        System.out.println("LA MULTIPLE COLA CIRCULAR DE MASCOTAS TIENE "+this.getnrocolas()+" ELEMENTOS");
        for (j = 0; j < n; j++)
        {
            System.out.println("Cola circular "+(j+1));
            this.mostrar(j);
        }
    }
    public void CrearColaCircular(int i){
        vec[i]= new ColaCircularMascota();
        n++;
    }
    public void llenar(int i){
        vec[i].llenar();
    }
    public int getnrocolas(){return n;}
    public void llenar(){
        Scanner lee=new Scanner(System.in);
        System.out.print("introducir la cantidad de cola circulares Mascotas =");
        int n= lee.nextInt();
        for (int i = 0; i < n; i++)
        {
            this.CrearColaCircular(i);
            this.llenar(i);
        }
    }
    public void LlenarAletoriamente(int i){
        this.CrearColaCircular(i);
        vec[i].Llenaraletoriamente();
    }
    public void LlenarAletoriamente(){
        // cre un multiple cola circular  1 hastta 20 colas de forma aletoria
         int n= (int)(Math.random()*(20-1+1)+1);
               for (int i = 0; i <n; i++) {
                
                this.LlenarAletoriamente(i);
               }
    }
    public int contarTipoXF(int i, String x){
       //clase multipleColaCMascotas
        return vec[i].ContarTipoXF( x);
    }
    public void EliminarMAcotasmenor2a(int i){
        //clase MultipleColaCMascotas
        System.out.print("Cola Circular Nro "+(i+1)+" ");vec[i].eliminarMacotasmenor2a();
    }
    public void llevarGatoAdelante(int i){
        //clase MultipleColacMAscotas
        vec[i].llevarGatoAdelante();
    }
    
}
