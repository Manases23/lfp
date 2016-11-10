/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ligadefutbolprofesional;

import java.util.ArrayList;

/**
 *
 * @author JUAN
 */
public abstract class Equipo {
    private String nombre;
    private int ano_fundacion;
    private ArrayList <Jugador> jugadores = new ArrayList<Jugador>();
    private Entrenador entrenador;
    private Masajista masajista;
    
    
    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public Masajista getMasajista() {
        return masajista;
    }

    public void setMasajista(Masajista masajista) {
        this.masajista = masajista;
    }
    

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }


    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAno_fundacion() {
        return ano_fundacion;
    }

    public void setAno_fundacion(int ano_fundacion) {
        this.ano_fundacion = ano_fundacion;
    }
    
        public void addJugador(Jugador jug){
        this.jugadores.add(jug);
    }
        public void borrarJugador(Jugador jug){
        this.jugadores.remove(jug);
    }
        
}
