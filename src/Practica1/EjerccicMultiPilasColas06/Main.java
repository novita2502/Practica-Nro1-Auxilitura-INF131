
package Practica1.EjerccicMultiPilasColas06;

public class Main {
    public static void main(String[] args) {
        MultiplePilaNBinario p= new MultiplePilaNBinario();
        // p.llenar();
        p.LlenarAletoriamente();
        p.mostrar();
        //a)	Mostrar de cada pila el número en su representación en base 10, tomando en cuenta 
        //que el digito del tope de la pila es el bit más significativo.
        int nro= p.getnrocolas();
        for (int i = 0; i < nro; i++) {
            p.MostrarBaseDecimal(i);
        }
        System.out.println("---------------");
 //b)	Mostrar de cada pila el número en su representación en base 10, tomando
// en cuenta que el digito del fondo de la pila es el bit más significativo.
    int nro2= p.getnrocolas();
        for (int i = 0; i < nro2; i++) {
            p.MostrarBaseDecimal2(i);
        }
    //c)	Eliminar de cada pila la cantidad necesaria de dígitos tal que la cantidad
    //de 0’s en esa pila sea la misma que la cantidad de 1’s de esta (No importa el orden de eliminación).
     int nro3= p.getnrocolas();
        for (int i = 0; i < nro3; i++) {
            p.BalancearUnoCEros(i);
        }
       p.mostrar();
    }
     
    
}
