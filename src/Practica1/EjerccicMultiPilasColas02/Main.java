
package Practica1.EjerccicMultiPilasColas02;
public class Main {
    public static void main(String[] args) {
     MultipleColaCMascotas M= new MultipleColaCMascotas();
       // M.llenar();
       M.LlenarAletoriamente();
        M.mostrar();
        //c.	 De cada cola llevar a las mascotas de tipo “gato” al principio de esta
         System.out.println("LAS COLAS QUE SE LLEVARON A DELANTE A LOS GATOS SON");
 for (int i = 0; i < M.getnrocolas(); i++)
        {
             System.out.println("________COLA CIRCULAR YA ORDENADA ");
            M.llevarGatoAdelante(i);
            M.mostrar(i);
            
        }
    //   M.mostrar();
        
    }
}
