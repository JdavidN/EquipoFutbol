package modelo;

import javax.swing.JOptionPane;

public class Equipo
{
    //Atributos
    private String nombreEquipo;
    private int numJugadores;
    private Jugador[] jugadores;
    private String nomGoleador;
    private int golesGoleador;
    private int edadProm;

    //Metodos
    public Equipo(String nom, int n)
    {
        nombreEquipo = nom;
        numJugadores = n;
        jugadores = new Jugador[n];
    }

    public void cargar()
    {
        for(int i=0; i< numJugadores;i++)
        {
            jugadores[i] = crearJugador();
        }
    }

    public Jugador crearJugador()
    {
        String nom = "";
        int goles = 0;
        int edad = 0;
        nom = JOptionPane.showInputDialog("Nombre del jugador: ");
        goles = Integer.parseInt(JOptionPane.showInputDialog("Goles del jugador: "));
        edad = Integer.parseInt(JOptionPane.showInputDialog("Edad del jugador: "));
        return new Jugador(nom, goles, edad);
    }

    public int calcularTotalGoles()
    {
        int totalGolesEquipo = 0;
        for(int i=0; i<numJugadores; i++)
        {
            totalGolesEquipo += jugadores[i].getGoles();
            if(jugadores[i].getGoles() > golesGoleador)
            {
                golesGoleador = jugadores[i].getGoles();
                nomGoleador = jugadores[i].getNombre();
            }
        }
        return totalGolesEquipo;
    }
    public int calcularMayorGoles()
    {
        for(int i=0; i<numJugadores; i++)
        {
            if(jugadores[i].getGoles() > golesGoleador)
            {
                golesGoleador = jugadores[i].getGoles();

            }
        }
        return golesGoleador;
    }
    public String calcularGoleador()
    {
        for(int i=0; i<numJugadores; i++)
        {
            if(jugadores[i].getGoles() > golesGoleador)
            {
                golesGoleador = jugadores[i].getGoles();
                nomGoleador = jugadores[i].getNombre();
            }
        }
        return nomGoleador;
    }
    public int calcularPromedioEdades()
    {
        for(int i=0; i<numJugadores; i++)
        {     
            edadProm += jugadores[i].getEdad();
        }
        edadProm= edadProm/numJugadores;
        return edadProm;
    }
    public String toString() 
    {
        return calcularPromedioEdades() +".";
    }

}
