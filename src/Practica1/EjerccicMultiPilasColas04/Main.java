
package Practica1.EjerccicMultiPilasColas04;

public class Main {
    public static void main(String[] args) {
        MultiplePilaNotas MP= new MultiplePilaNotas();
        //MP.llenar();
        MP.LlenarAletoriamente();
        MP.mostrar();
        //a Mostrar la pila que tiene más aprobados y la pila que tiene más reprobados
       // MP.PilaConmasAprobados();
       // MP.PilaConmasReprobados();
      // b. Mostrar el promedio total de TODOS los aprobados.
       MP.MostrarPromedioAprobados();
    }
}
