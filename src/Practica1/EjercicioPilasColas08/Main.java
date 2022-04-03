
package Practica1.EjercicioPilasColas08;

public class Main {
    public static void main(String[] args) {
        ColaCPlatos CCp= new ColaCPlatos();
        ColaSPedidos Cp= new ColaSPedidos();
        Cp.llenarAletoriamente();
        // Cp.llenar();
        Cp.mostrar();
        CCp.Llenaraletoriamente();
        //CCp.llenar();
        CCp.mostrar();
        //Cp.CalcularCuenta(CCp, "Angel", "01/03/2022");
       // Cp.CalcularCuenta(CCp, "pedro", "01/03/2022");
       Cp.eliminarPedidoPlatodNombre("Locro", CCp);
    }
    
}
