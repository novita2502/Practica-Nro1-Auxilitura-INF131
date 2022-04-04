
package Practica1.EjerccicMultiPilasColas06;

import java.util.Scanner;

public class MultiplePilaNBinario {
    private int max, n;
    private PilaNBinario vec[];

    public MultiplePilaNBinario() {
    max= 100;
    n=0;
    vec= new  PilaNBinario[100];
        for (int i = 0; i < max; i++) {vec[i]=new PilaNBinario();}
     }
    public boolean Esvacia(int i){
        return vec[i].esvacia();
    }
    public boolean Esllena(int i){
        return vec[i].esllena();
    }
    public void Adicionar(int i , int m){
        vec[i].adicinar(m);
    }
    public int eliminar(int i){
        return vec[i].eliminar();
    }
    public void mostrar(int i){
        vec[i].mostrar();
    }
    public void mostrar(){
        int j;
        System.out.println("LA MULTIPLE PILA NUMEROS BINARIOS TIENE "+this.getnrocolas()+" ELEMENTOS");
        for (j = 0; j < n; j++)
        {
            System.out.print("Pila "+(j+1)+"= ");
            this.mostrar(j);
            System.out.println("");
        }
    }
    public void CrearPila(int i){
        vec[i]= new PilaNBinario();
        n++;
    }
    public void llenar(int i){
        vec[i].llenar();
    }
    public int getnrocolas(){return n;}
    public void llenar(){
        Scanner lee=new Scanner(System.in);
        System.out.print("introducir la cantidad de Pila de numero binario tendra =");
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
        // cre un multiple pila   1 hastta 20 colas de forma aletoria
         int n= (int)(Math.random()*(20-1+1)+1);
               for (int i = 0; i <n; i++) {
                
                this.LlenarAletoriamente(i);
               }
    }
    public int Nroelementos(int i){
        return vec[i].Nroelemntos();
    }
    public void MostrarBaseDecimal(int i){
        vec[i].MostrarBaseDecimal();
    }
    public void MostrarBaseDecimal2(int i){
        vec[i].MostrarBaseDecimal2();
    }
    public void BalancearUnoCEros(int i){
        vec[i].BalanceCerosUnos();
    }
}
