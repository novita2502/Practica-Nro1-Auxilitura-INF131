
package Practica1.EjerccicMultiPilasColas04;
import java.util.Scanner;

public class MultiplePilaNotas {
    private int max, n;
    private PilaNotas vec[];

    public MultiplePilaNotas() {
    max= 100;
    n=0;
    vec= new  PilaNotas[100];
        for (int i = 0; i < max; i++) {vec[i]=new PilaNotas();}
     }
    public boolean Esvacia(int i){
        return vec[i].esvacia();
    }
    public boolean Esllena(int i){
        return vec[i].esllena();
    }
    public void Adicionar(int i , Nota m){
        vec[i].adicinar(m);
    }
    public Nota eliminar(int i){
        return vec[i].eliminar();
    }
    public void mostrar(int i){
        vec[i].mostrar();
    }
    public void mostrar(){
        int j;
        System.out.println("LA MULTIPLE PILA DE NOTAS TIENE "+this.getnrocolas()+" ELEMENTOS");
        for (j = 0; j < n; j++)
        {
            System.out.println("Pila "+(j+1));
            this.mostrar(j);
        }
    }
    public void CrearPila(int i){
        vec[i]= new PilaNotas();
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
            this.CrearPila(i);
            this.llenar(i);
        }
    }
    public void LlenarAletoriamente(int i){
        this.CrearPila(i);
        vec[i].llenaraletoriamente();
    }
    public void LlenarAletoriamente(){
        // cre un multiple cola circular  1 hastta 20 colas de forma aletoria
         int n= (int)(Math.random()*(20-1+1)+1);
               for (int i = 0; i <n; i++) {
                
                this.LlenarAletoriamente(i);
               }
    }
    public int Nroelementos(int i){
        return vec[i].Nroelemntos();
    }
    public int CantidadAprobados(int i){//clase multiplePilaNotas
         return vec[i].CantidadAprobados();
    }
     public int CantidadReporbados(int i){//clase multiplePilaNotas
         return vec[i].CantidadReprobados();
    }
     public int SumaCantidadAprobados(int i){
         return vec[i].SumaNotasAprobados();
     }
     public void PilaConmasAprobados(){
         int may =Integer.MIN_VALUE; PilaNotas A=null;int ij=0;
         for (int i = 0; i < n; i++)
         {
             if (this.CantidadAprobados(i)>may) 
             {
                may=this.CantidadAprobados(i);
                A=vec[i];
                ij=i;
             }
         }
         if (A!=null) {
             System.out.println("---------La pila con mayor cantidad de aprobados es "+""
                 + " la Pila Nro "+(ij+1)+" con="+may+" aprobados");
             A.mostrar();
         } else {
             System.out.println("no hay ");
         }
     }
     public void PilaConmasReprobados(){
         int may =Integer.MIN_VALUE; PilaNotas A=null;int ij=0;
         for (int i = 0; i < n; i++)
         {
             if (this.CantidadReporbados(i)>may) 
             {
                may=this.CantidadAprobados(i);
                A=vec[i];
                ij=i;
             }
         }
         if (A!=null) {
             System.out.println("---------La pila con mayor cantidad de Reprobados es "+""
                 + " la Pila Nro "+(ij+1)+" con="+may+" aprobados");
             A.mostrar();
         } else {
             System.out.println("no hay ");
         }
     }
     public void MostrarPromedioAprobados(){
         int SumaAprobados=0;
         int sumaCantidadAprobados=0;
         for (int i = 0; i < n; i++) 
         {
              SumaAprobados=SumaAprobados+this.SumaCantidadAprobados(i);
              sumaCantidadAprobados=sumaCantidadAprobados+this.CantidadAprobados(i);
         }
         System.out.println("El promedio de aprobados es "+SumaAprobados/sumaCantidadAprobados);
     }
}
