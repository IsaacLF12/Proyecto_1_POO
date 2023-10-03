package proyecto1_poo;


/**
 * Archivo correspondiente a la clase Piloto
 * @author Daniel H., Isaac L., Sebastian J.
 * @version 1.0
 */
public class Piloto {
    private String nombrePiloto;
    private String nacionalidad;
    private int numeroPiloto;
    private int edadPiloto;
    private int puntajePiloto;
    
    /**
     * Constructor del objeto Piloto, inicializa los atributos con los valores que recibe como parametros.
     * @param nombrePiloto Nombre del piloto que competira
     * @param nacionalidad Nacionalidad del piloto para la premiacion
     * @param numeroPiloto Numero del piloto para distinguirlo
     * @param edadPiloto Edad del piloto
    */

    public Piloto(String nombrePiloto, String nacionalidad, int numeroPiloto, int edadPiloto){
        this.nombrePiloto = nombrePiloto;
        this.nacionalidad = nacionalidad;
        this.numeroPiloto = numeroPiloto;
        this.edadPiloto = edadPiloto;
        this.puntajePiloto = 0;
    }

    /**
     * Getter del atributo nombrePiloto
     * @return Valor que tiene el atributo nombrePiloto
    */

    public String getNombrePiloto() {
        return this.nombrePiloto;
    }

    /**
     * Getter del atributo nacionalidad
     * @return Valor que tiene el atributo nacionalidad
    */

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    /**
     * Getter del atributo numeroPiloto
     * @return Valor que tiene el atributo numeroPiloto
    */

    public int getNumeroPiloto() {
        return this.numeroPiloto;
    }

    /**
     * Getter del atributo edadPiloto
     * @return Valor que tiene el atributo edadPiloto
    */

    public int getEdadPiloto() {
        return this.edadPiloto;
    }

    /**
     * Setter del atributo nombrePiloto
     * @param nombrePiloto Valor con el que se quiere actualizar el atributo nombrePiloto
    */

    public void setNombrePiloto(String nombrePiloto) {
        this.nombrePiloto = nombrePiloto;
    }

    /**
     * Setter del atributo nacionalidad
     * @param nacionalidad Valor con el que se quiere actualizar el atributo nacionalidad
    */

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * Setter del atributo numeroPiloto
     * @param numeroPiloto Valor con el que se quiere actualizar el atributo numeroPiloto
    */

    public void setNumeroPiloto(int numeroPiloto) {
        this.numeroPiloto = numeroPiloto;
    }

    /**
     * Setter del atributo edadPiloto
     * @param edadPiloto Valor con el que se quiere actualizar el atributo edadPiloto
    */

    public void setEdadPiloto(int edadPiloto) {
        this.edadPiloto = edadPiloto;
    } 
    
    /**
     * Getter del atributo puntajePiloto
     * @return Valor que tiene el atributo puntajePiloto
    */

    public int getPuntajePiloto() {
        return this.puntajePiloto;
    }

    /**
     * Setter del atributo puntajePiloto
     * @param puntajePiloto Valor con el que se quiere actualizar el atributo puntajePiloto
    */

    public void setPuntajePiloto(int puntajePiloto) {
        this.puntajePiloto = puntajePiloto;
    }
}
