/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1_poo;

import java.util.TreeMap;
import java.util.LinkedList;
/**
 *
 * @author Sebjimort
 */
public class Campeonato {
    private int claveCampeonato;
    private String nombreCampeonato;
    private LinkedList<Carrera> carreras;
    
    private static TreeMap<Integer, Equipo> posicionesEquipos = new TreeMap<>();
    private static TreeMap<Integer, Piloto> posicionesPilotos = new TreeMap<>();

    public Campeonato(int claveCampeonato, String nombreCampeonato, LinkedList<Carrera> carreras) {
        this.claveCampeonato = claveCampeonato;
        this.nombreCampeonato = nombreCampeonato;
        this.carreras = carreras;
    }

    public int getClaveCampeonato() {
        return claveCampeonato;
    }

    public void setClaveCampeonato(int claveCampeonato) {
        this.claveCampeonato = claveCampeonato;
    }

    public String getNombreCampeonato() {
        return nombreCampeonato;
    }

    public void setNombreCampeonato(String nombreCampeonato) {
        this.nombreCampeonato = nombreCampeonato;
    }

    public LinkedList<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(LinkedList<Carrera> carreras) {
        this.carreras = carreras;
    }

    public static TreeMap<Integer, Equipo> getPosicionesEquipos() {
        return posicionesEquipos;
    }

    public static void setPosicionesEquipos(TreeMap<Integer, Equipo> posicionesEquipos) {
        Campeonato.posicionesEquipos = posicionesEquipos;
    }

    public static TreeMap<Integer, Piloto> getPosicionesPilotos() {
        return posicionesPilotos;
    }

    public static void setPosicionesPilotos(TreeMap<Integer, Piloto> posicionesPilotos) {
        Campeonato.posicionesPilotos = posicionesPilotos;
    }
    
    
}
