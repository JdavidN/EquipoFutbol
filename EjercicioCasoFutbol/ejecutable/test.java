package ejecutable;

import modelo.Equipo;
import modelo.Jugador;

public class test {
    public static void main(String[] args)
    {
        Equipo Equipo1 = new Equipo("sergio",12);
        Jugador Jugador1 = new Jugador("Crisitano", 13, 18);
        Equipo1.crearJugador();
        System.out.println(Equipo1.toString());
    }
    
}
