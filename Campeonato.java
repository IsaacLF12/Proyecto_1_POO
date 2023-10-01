/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1_poo;

import java.util.TreeMap;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Sebjimort
 */
public class Campeonato {
    private String nombreCampeonato;
    private Equipo[] equipos;
    private LinkedList<Carrera> carreras;
    private List<Equipo> posicionesEquipos;
    private List<Piloto> posicionesPilotos;
    private boolean status;
    private int carrerasCorridas;

    public Campeonato(String nombreCampeonato, Equipo[] equipos, LinkedList<Carrera> carreras, List<Equipo> posicionesEquipos,List<Piloto> posicionesPilotos, boolean status) {
        this.nombreCampeonato = nombreCampeonato;
        this.equipos = equipos;
        this.carreras = carreras;
        this.posicionesEquipos = posicionesEquipos;
        this.posicionesPilotos = posicionesPilotos;
        this.status = status;
        this.carrerasCorridas = 0;
        for(int i=0; i<equipos.length; i++)
            this.posicionesEquipos.add(equipos[i]);
        for(int i=0; i<equipos.length; i++){
            this.posicionesPilotos.add(equipos[i].getPiloto1());
            this.posicionesPilotos.add(equipos[i].getPiloto2());
        }
    }

    public String getNombreCampeonato() {
        return this.nombreCampeonato;
    }

    public void setNombreCampeonato(String nombreCampeonato) {
        this.nombreCampeonato = nombreCampeonato;
    }

    public Equipo[] getEquipos() {
        return this.equipos;
    }

    public void setEquipos(Equipo[] equipos) {
        this.equipos = equipos;
    }

    public LinkedList<Carrera> getCarreras() {
        return this.carreras;
    }

    public void setCarreras(LinkedList<Carrera> carreras) {
        this.carreras = carreras;
    }

    public List<Equipo> getPosicionesEquipos() {
        return this.posicionesEquipos;
    }

    public void setPosicionesEquipos(List<Equipo> posicionesEquipos) {
        this.posicionesEquipos = posicionesEquipos;
    }

    public List<Piloto> getPosicionesPilotos() {
        return this.posicionesPilotos;
    }

    public void setPosicionesPilotos(List<Piloto> posicionesPilotos) {
        this.posicionesPilotos = posicionesPilotos;
    }

    public boolean isStatus() {
        return this.status;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCarrerasCorridas(){
        return this.carrerasCorridas;
    }

    public void setCarrerasCorridas(int carrerasCorridas){
        this.carrerasCorridas = carrerasCorridas;
    }

    public void completarCampeonato(){
        while(this.carrerasCorridas<this.carreras.size()){
            Utilerias.clearScreen();
            this.carreras.get(this.carrerasCorridas).iniciarCarrera(this.equipos);
            this.carreras.get(this.carrerasCorridas).imprimirPosicionesCarrera();
            this.carrerasCorridas++;
            this.actualizarCampeonato();
            this.imprimirCampeonato();
            Utilerias.pause();

        }
    }

    public void actualizarCampeonato(){
        this.posicionesEquipos.sort((Comparator.comparing(Equipo::getPuntajeEquipo)).reversed());
        this.posicionesPilotos.sort((Comparator.comparing(Piloto::getPuntajePiloto)).reversed());
        if(this.carrerasCorridas==this.carreras.size())
            this.status = false;
    }

    public void imprimirCampeonato(){
        System.out.println("Campeonato: " + this.getNombreCampeonato());
        System.out.println("\tCarreras Corridas: " + this.getCarrerasCorridas() + " de " + this.getCarreras().size());
        System.out.println("\tTabla por Equipos");
        System.out.println("\t\tPosicion\tPuntaje\t\t\tEquipo");
        for(int i=0; i<this.posicionesEquipos.size(); i++)
            System.out.println("\t\t   " + (i+1) + "\t\t" + this.posicionesEquipos.get(i).getPuntajeEquipo() + " Puntos\t\t" + this.posicionesEquipos.get(i).getNombreEquipo());
        System.out.println("\tTabla por Pilotos");
        System.out.println("\t\tPosicion\tPuntaje\t\t\tPiloto");
        for(int i=0; i<this.posicionesPilotos.size(); i++)
            System.out.println("\t\t   " + (i+1) + "\t\t" + this.posicionesPilotos.get(i).getPuntajePiloto() + " Puntos\t\t" + this.posicionesPilotos.get(i).getNombrePiloto());
        System.out.println("");
    }
}
