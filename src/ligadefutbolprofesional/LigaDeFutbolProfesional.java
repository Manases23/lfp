/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ligadefutbolprofesional;

import java.util.ArrayList;

/**
 *
 * @author Manasés
 */
public class LigaDeFutbolProfesional {

    private static ArrayList<Equipo> lfp = new ArrayList<Equipo>();

    public static void rellenarDatos() {

        EquiposPrimera e1;
        EquiposSegunda e2;
        Jugador jug;
        Entrenador ent;
        Masajista mas;

        for (int i = 0; i < 20; i++) {
            //Creo 10 equipos de primera
            e1 = new EquiposPrimera();
            e1.setNombre("Equipo Primera " + i);
            e1.setAno_fundacion(1901 + i);
            e1.setNombre_estadio("Estadio " + i);
            e1.setCapacidad(32000 + i);

            //le añado 22 jugadores a cada equipo                           
            for (int j = 0; j < 22; j++) {
                jug = new Jugador();
                jug.setNombre("Jugador " + j);
                jug.setEdad(14 + j);
                jug.setAltura(160 + j);
                jug.setPeso(65 + j);
                e1.addJugador(jug);
            }

            //añado 1 entrenador a cada equipo de primera
            ent = new Entrenador();
            ent.setNombre("Entrenador de primera " + i);
            ent.setEdad(35 + i);
            ent.setNacionalidad("Español");
            e1.setEntrenador(ent);
            
            //añado 1 masajista a cada equipo de primera
            mas = new Masajista();
            mas.setNombre("Masajista de primera " + i);
            mas.setEdad(45 + i);
            mas.setNum_colegiado(236540 + i);
            e1.setMasajista(mas);

            //LE AÑADO LOS EQUIPOS DE PRIMERA A LA LIGA DE FUTBOL PROFESIONAL
            lfp.add(e1);

        }

        //-----------CREO 10 EQUIPOS DE SEGUNDA------------
        for (int i = 0; i < 20; i++) {

            e2 = new EquiposSegunda();
            e2.setNombre("Equipo Segunda " + i);
            e2.setAno_fundacion(1921 + i);

            //le añado 22 jugadores a cada equipo                           
            for (int j = 0; j < 22; j++) {
                jug = new Jugador();
                jug.setNombre("Jugador " + j);
                jug.setEdad(14 + j);
                jug.setAltura(160 + j);
                jug.setPeso(65 + j);
                e2.addJugador(jug);
            }

            //añado 1 entrenador a cada equipo de segunda
            ent = new Entrenador();
            ent.setNombre("Entrenador de segunda " + i);
            ent.setEdad(35 + i);
            ent.setNacionalidad("Español");
            e2.setEntrenador(ent);

            //añado 1 masajista a cada equipo de segunda
            mas = new Masajista();
            mas.setNombre("Masajista de segunda " + i);
            mas.setEdad(45 + i);
            mas.setNum_colegiado(236540 + i);
            e2.setMasajista(mas);

            //AÑADO LOS EQUIPOS DE SEGUNDA A LA LIGA DE FUTBOL PROFESIONAL
            lfp.add(e2);
        }
    }

    
    //------------------Traspasar un jugador de un equipo a otro----------------
    public static void traspaso(Equipo origen, Equipo destino, Jugador j){
        destino.addJugador(j);
        origen.borrarJugador(j);
        
    }
    
    
    public static void altaJugador(){
        
    }
    
    
    public static void bajaJugador(){
        
    }
    
    
    public static void main(String[] args) {
        
        rellenarDatos();
        
        Jugador jug = lfp.get(0).getJugadores().get(3);
        traspaso(lfp.get(4), lfp.get(2), jug);
        
        
        //altaJugador();
        
        //bajaJugador();       
        
        //
    }
}

