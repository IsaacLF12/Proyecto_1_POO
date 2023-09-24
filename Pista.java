/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1_poo;

/**
 *
 * @author Sebjimort
 */
public class Pista {
    private int numVueltas;
    private String lugar;
    private int kilometraje;
    private String nombrePista;

    public Pista(int numVueltas, String lugar, int kilometraje, String nombrePista) {
        this.numVueltas = numVueltas;
        this.lugar = lugar;
        this.kilometraje = kilometraje;
        this.nombrePista = nombrePista;
    }

    public int getNumVueltas() {
        return numVueltas;
    }

    public void setNumVueltas(int numVueltas) {
        this.numVueltas = numVueltas;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getNombrePista() {
        return nombrePista;
    }

    public void setNombrePista(String nombrePista) {
        this.nombrePista = nombrePista;
    }
    
}