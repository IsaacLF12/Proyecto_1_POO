/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1_poo;

import java.util.TreeMap;
/**
 *
 * @author Sebjimort
 */
public class Carrera {
    private Pista pista;
    private Fecha fecha;
    private Equipo[] equipos;
    private int claveCarrera;
    private TreeMap<Integer, Piloto> posicionesCarrera;

    public Carrera(Pista pista, Fecha fecha, Equipo[] equipos, int claveCarrera, TreeMap<Integer, Piloto> posicionesCarrera) {
        this.pista = pista;
        this.fecha = fecha;
        this.equipos = equipos;
        this.claveCarrera = claveCarrera;
        this.posicionesCarrera = posicionesCarrera;
    }

    public Pista getPista() {
        return pista;
    }

    public void setPista(Pista pista) {
        this.pista = pista;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Equipo[] getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipo[] equipos) {
        this.equipos = equipos;
    }

    public int getClaveCarrera() {
        return claveCarrera;
    }

    public void setClaveCarrera(int claveCarrera) {
        this.claveCarrera = claveCarrera;
    }

    public TreeMap<Integer, Piloto> getPosicionesCarrera() {
        return posicionesCarrera;
    }

    public void setPosicionesCarrera(TreeMap<Integer, Piloto> posicionesCarrera) {
        this.posicionesCarrera = posicionesCarrera;
    }

    public void iniciarCarrera(){
        
    }
}
