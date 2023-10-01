/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1_poo;

import java.util.TreeMap;
import java.util.Random;
/**
 *
 * @author Sebjimort, Doctt
 */
public class Carrera {
    private Pista pista;
    private Fecha fecha;
    private int claveCarrera;
    private TreeMap<Integer, Piloto> posicionesCarrera;

    public Carrera(Pista pista, Fecha fecha, int claveCarrera, TreeMap<Integer, Piloto> posicionesCarrera) {
        this.pista = pista;
        this.fecha = fecha;
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

    public void iniciarCarrera(Equipo[] equipos){
        Random aleatorio = new Random();
        int posicion;
        int numeroPilotos = 2*equipos.length;
        for(int i=0; i<equipos.length; i++){
            posicion = ((aleatorio.nextInt(1001)+1)%numeroPilotos);
            while(this.posicionesCarrera.containsKey(posicion))
                posicion = (posicion+1)%numeroPilotos;
            this.posicionesCarrera.put(posicion, equipos[i].getPiloto1());
            equipos[i].getPiloto1().setPuntajePiloto(equipos[i].getPiloto1().getPuntajePiloto()+(numeroPilotos-posicion));
            posicion = ((aleatorio.nextInt(1001)+1)%numeroPilotos);
            while(this.posicionesCarrera.containsKey(posicion))
                posicion = (posicion+1)%numeroPilotos;
            this.posicionesCarrera.put(posicion, equipos[i].getPiloto2());
            equipos[i].getPiloto2().setPuntajePiloto(equipos[i].getPiloto2().getPuntajePiloto()+(numeroPilotos-posicion));
            equipos[i].setPuntajeEquipo(equipos[i].getPuntajeEquipo() + equipos[i].getPiloto1().getPuntajePiloto() + equipos[i].getPiloto2().getPuntajePiloto());
        }
    }
    public void imprimirPosicionesCarrera(){
        System.out.println("Los resultados de la carrera son los siguientes:");
        System.out.println("\t\tPosicion\tPuntaje\t\tPiloto");
        this.posicionesCarrera.forEach((key, value) -> System.out.println("\t\t   " + (key+1) + "\t\t+" + (this.posicionesCarrera.size()-key) + "Puntos" + "\t" + value.getNombrePiloto()));
        System.out.println("");
    }
}
