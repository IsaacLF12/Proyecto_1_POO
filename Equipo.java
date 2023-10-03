package proyecto1_poo;

import java.util.Objects;

/**
 * Archivo correspondiente a la clase Equipo
 * @author Daniel H., Isaac L., Sebastian J.
 * @version 1.0
 */
public class Equipo {
    private String nombreEquipo;
    private int claveEquipo;
    private Piloto piloto1;
    private Piloto piloto2;
    private int puntajeEquipo;

    /**
     * Constructor del objeto Equipo, inicializa los atributos con los valores que recibe como parametros.
     * @param nombreEquipo Nombre que se le desea asignar al equipo
     * @param claveEquipo Clave numerica que se le desea asignar al equipo
     * @param piloto1 Informacion completa del primer piloto
     * @param piloto2 Informacion completa del segundo piloto
    */

    public Equipo(String nombreEquipo, int claveEquipo, Piloto piloto1, Piloto piloto2){
        this.nombreEquipo = nombreEquipo;
        this.claveEquipo = claveEquipo;
        this.piloto1 = piloto1;
        this.piloto2 = piloto2;
        this.puntajeEquipo = 0;
    }
    
    /**
     * Getter del atributo nombreEquipo
     * @return Valor que tiene el atributo nombreEquipo
    */

    public String getNombreEquipo() {
        return this.nombreEquipo;
    }

    /**
     * Setter del atributo nombreEquipo
     * @param nombreEquipo Valor con el que se quiere actualizar el atributo nombreEquipo
    */

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    /**
     * Getter del atributo claveEquipo
     * @return Valor que tiene el atributo claveEquipo
    */

    public int getClaveEquipo() {
        return this.claveEquipo;
    }

    /**
     * Setter del atributo claveEquipo
     * @param claveEquipo Valor con el que se quiere actualizar el atributo claveEquipo
    */

    public void setClaveEquipo(int claveEquipo) {
        this.claveEquipo = claveEquipo;
    }

    /**
     * Getter del atributo piloto1
     * @return Valor que tiene el atributo piloto1
    */

    public Piloto getPiloto1() {
        return this.piloto1;
    }

    /**
     * Setter del atributo piloto1
     * @param piloto1 Valor con el que se quiere actualizar el atributo piloto1
    */

    public void setPiloto1(Piloto piloto1) {
        this.piloto1 = piloto1;
    }

    /**
     * Getter del atributo piloto2
     * @return Valor que tiene el atributo piloto2
    */

    public Piloto getPiloto2() {
        return this.piloto2;
    }

    /**
     * Setter del atributo piloto2
     * @param piloto2 Valor con el que se quiere actualizar el atributo piloto2
    */

    public void setPiloto2(Piloto piloto2) {
        this.piloto2 = piloto2;
    }

    /**
     * Getter del atributo puntajeEquipo
     * @return Valor que tiene el atributo puntajeEquipo
    */

    public int getPuntajeEquipo() {
        return this.puntajeEquipo;
    }

    /**
     * Setter del atributo puntajeEquipo
     * @param puntajeEquipo Valor con el que se quiere actualizar el atributo puntajeEquipo
    */

    public void setPuntajeEquipo(int puntajeEquipo) {
        this.puntajeEquipo = puntajeEquipo;
    }

    /**
     * La funcion equals esta sobreescrita para que solo considere el atributo nombre al compararse con otro objeto
     * @param o Objeto con el que se va a comparar el atributo nombre
     * @return Resultado booleano luego de la comparacion
    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipo equipo = (Equipo) o;
        return Objects.equals(nombreEquipo, equipo.nombreEquipo);
    }
    
    /**
     * La funcion hashCode esta sobreescrita para que solo considere el atributo nombre al general el indice de la funcion hash
     * @return Indice de la funcion hash
    */

    @Override
    public int hashCode() {
        return Objects.hash(nombreEquipo);
    }
}