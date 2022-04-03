/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1.EjercicioPilasColas04;


public class Partido {
    private Equipo A;
    private Equipo B;

    public Partido() {
      A= new Equipo("Bolivar");
      B=new Equipo("Barcelona");
    }
    public void Leer(){
        System.out.println("llenar los datos de los equipos de futbol que se jugaron");
        A.Leer();
        B.Leer();
    }
    public void mostrar(){
        System.out.println("Datos de los equipos de futbol");
        A.Mostrar();
        B.Mostrar();
    }
    public void DeternimarGanador(){
        if (A.NroGoles()>B.NroGoles())
        {
            System.out.println("GANADOR "+A.getNombre()+
            " Vs "+B.getNombre()+" ==> "+A.getNombre()+
            " goles ="+A.NroGoles()+" "+B.getNombre()+" goles ="+B.NroGoles());    
        } else {
            System.out.println("GANADOR "+A.getNombre()+
            " Vs "+B.getNombre()+" ==> "+B.getNombre()+
            " goles ="+B.NroGoles()+" "+A.getNombre()+"  contra goles ="+A.NroGoles());    

        }
    }
    public void JugadorMenorEdadCadaEquipo(){
        Jugador a=A.JugadorMenorEdad();
        Jugador b= B.JugadorMenorEdad();
        System.out.print("del equipo "+A.getNombre()+" el jugador  de menor edad es: ");a.Mostrar();
        System.out.print("del equipo "+B.getNombre()+" el jugador  de menor edad es: ");b.Mostrar();
    }
    public void MostrarNombre3JMAsJovenes(){
        PilaJugadores C= new PilaJugadores();
        PilaJugadores a= A.getPJ();
        a.OrdenarEdadMayorAMenor();
        PilaJugadores b= B.getPJ();
        b.OrdenarEdadMayorAMenor();
        for (int i = 0; i < 3; i++)
        {
           C.adicinar(a.eliminar());
           C.adicinar(b.eliminar());
        }
        C.OrdenarEdadMayorAMenor();
        for (int i = 1; i <= 3; i++)
        {
            System.out.println(i+": Jugador mas joven  del partido " +C.eliminar().getNombre());;
        }
        
    }
    public  void LlenarRamdon(){
        String [] vnomequi={"Barcelona","Bolivar","Strongest","Real madrid","Blooming","whister"};
        String a= vnomequi[(int)(Math.random()*(5-0+1)+0)];
        String b= vnomequi[(int)(Math.random()*(5-0+1)+0)];
        while (a.equals(b))
        {            
          b= vnomequi[(int)(Math.random()*(7-0+1)+0)];   
        }
        A.LlenarRamdon(a);
        B.LlenarRamdon(b);
        
    }
    
    
}
