/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1_poo;

/**
 *
 * @author Sebjimort
 */
public class Piloto {
    private String nombrePiloto;
    private String nacionalidad;
    private int numeroPiloto;
    private int edadPiloto;
    
    public Piloto(String nombrePiloto, String nacionalidad, int numeroPiloto, int edadPiloto){
        this.nombrePiloto = nombrePiloto;
        this.nacionalidad = nacionalidad;
        this.numeroPiloto = numeroPiloto;
        this.edadPiloto = edadPiloto;
    }

    public String getNombrePiloto() {
        return nombrePiloto;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getNumeroPiloto() {
        return numeroPiloto;
    }

    public int getEdadPiloto() {
        return edadPiloto;
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
}
