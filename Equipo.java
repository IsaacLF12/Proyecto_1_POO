/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1_poo;

/**
 *
 * @author Sebjimort
 */
public class Equipo {
    private String nombreEquipo;
    private int claveEquipo;
    private Piloto piloto1;
    private Piloto piloto2;
    private int puntajeEquipo;

    public Equipo(String nombreEquipo, int claveEquipo, Piloto piloto1, Piloto piloto2){
        this.nombreEquipo = nombreEquipo;
        this.claveEquipo = claveEquipo;
        this.piloto1 = piloto1;
        this.piloto2 = piloto2;
        this.puntajeEquipo = 0;
    }
    
    public String getNombreEquipo() {
        return this.nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getClaveEquipo() {
        return this.claveEquipo;
    }

    public void setClaveEquipo(int claveEquipo) {
        this.claveEquipo = claveEquipo;
    }

    public Piloto getPiloto1() {
        return this.piloto1;
    }

    public void setPiloto1(Piloto piloto1) {
        this.piloto1 = piloto1;
    }

    public Piloto getPiloto2() {
        return this.piloto2;
    }

    public void setPiloto2(Piloto piloto2) {
        this.piloto2 = piloto2;
    }

    public int getPuntajeEquipo() {
        return this.puntajeEquipo;
    }

    public void setPuntajeEquipo(int puntajeEquipo) {
        this.puntajeEquipo = puntajeEquipo;
    }

}
