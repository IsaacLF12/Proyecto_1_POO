/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1_poo;


/**
 *
 * @author Sebjimort Doctt
 */
public class Piloto {
    private String nombrePiloto;
    private String nacionalidad;
    private int numeroPiloto;
    private int edadPiloto;
    private int puntajePiloto;
    
    public Piloto(String nombrePiloto, String nacionalidad, int numeroPiloto, int edadPiloto){
        this.nombrePiloto = nombrePiloto;
        this.nacionalidad = nacionalidad;
        this.numeroPiloto = numeroPiloto;
        this.edadPiloto = edadPiloto;
        this.puntajePiloto = 0;
    }

    public String getNombrePiloto() {
        return this.nombrePiloto;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public int getNumeroPiloto() {
        return this.numeroPiloto;
    }

    public int getEdadPiloto() {
        return this.edadPiloto;
    }

    public void setNombrePiloto(String nombrePiloto) {
        this.nombrePiloto = nombrePiloto;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setNumeroPiloto(int numeroPiloto) {
        this.numeroPiloto = numeroPiloto;
    }

    public void setEdadPiloto(int edadPiloto) {
        this.edadPiloto = edadPiloto;
    } 
    
    public int getPuntajePiloto() {
        return this.puntajePiloto;
    }

    public void setPuntajePiloto(int puntajePiloto) {
        this.puntajePiloto = puntajePiloto;
    }
}
