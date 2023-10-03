package proyecto1_poo;

/**
 * Archivo correspondiente a la clase Pista
 * @author Daniel H., Isaac L., Sebastian J.
 * @version 1.0
 */
public class Pista {
    private int numVueltas;
    private String lugar;
    private int kilometraje;
    private String nombrePista;

    /**
     * Constructor del objeto Pista, inicializa los atributos con los valores que recibe como parametros.
     * @param numVueltas Numero de vueltas de la pista
     * @param lugar Lugar geografico en el que se ubica la pista
     * @param kilometraje Numero de kilometros que componen la pista
     * @param nombrePista Nombre de la pista
    */
    public Pista(int numVueltas, String lugar, int kilometraje, String nombrePista) {
        this.numVueltas = numVueltas;
        this.lugar = lugar;
        this.kilometraje = kilometraje;
        this.nombrePista = nombrePista;
    }

    /**
     * Getter del atributo numVueltas
     * @return Valor que tiene el atributo numVueltas
    */

    public int getNumVueltas() {
        return this.numVueltas;
    }

    /**
     * Setter del atributo numVueltas
     * @param numVueltas Valor con el que se quiere actualizar el atributo numVueltas
    */

    public void setNumVueltas(int numVueltas) {
        this.numVueltas = numVueltas;
    }

    /**
     * Getter del atributo lugar
     * @return Valor que tiene el atributo lugar
    */

    public String getLugar() {
        return this.lugar;
    }

    /**
     * Setter del atributo lugar
     * @param lugar Valor con el que se quiere actualizar el atributo lugar
    */

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
     * Getter del atributo kilometraje
     * @return Valor que tiene el atributo kilometraje
    */

    public int getKilometraje() {
        return this.kilometraje;
    }

    /**
     * Setter del atributo kilometraje
     * @param kilometraje Valor con el que se quiere actualizar el atributo kilometraje
    */

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    /**
     * Getter del atributo nombrePista
     * @return Valor que tiene el atributo nombrePista
    */

    public String getNombrePista() {
        return this.nombrePista;
    }

    /**
     * Setter del atributo nombrePista
     * @param nombrePista Valor con el que se quiere actualizar el atributo nombrePista
    */

    public void setNombrePista(String nombrePista) {
        this.nombrePista = nombrePista;
    }
    
}