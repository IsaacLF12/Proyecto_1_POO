package proyecto1_poo;

import java.util.TreeMap;
import java.util.Random;
/**
 * Archivo correspondiente a la clase Carrera
 * @author Daniel H., Isaac L., Sebastian J.
 * @version 1.0
 */
public class Carrera {
    private Pista pista;
    private Fecha fecha;
    private int claveCarrera;
    private TreeMap<Integer, Piloto> posicionesCarrera;

    /**
     * Constructor del objeto Carrera, inicializa los atributos con los valores que recibe como parametros.
     * @param pista Pista donde se va a correr
     * @param fecha Fecha en la que se llevara a cabo la carrera
     * @param claveCarrera Clave asignada a la carrera para distinguirla
     * @param posicionesCarrera Implementacion de la interfaz Map con la clase TreeMap para registrar las posiciones de la carrera
    */

    public Carrera(Pista pista, Fecha fecha, int claveCarrera, TreeMap<Integer, Piloto> posicionesCarrera) {
        this.pista = pista;
        this.fecha = fecha;
        this.claveCarrera = claveCarrera;
        this.posicionesCarrera = posicionesCarrera;
    }

    /**
     * Getter del atributo pista
     * @return Valor que tiene el atributo pista
    */

    public Pista getPista() {
        return pista;
    }

    /**
     * Setter del atributo pista
     * @param pista Valor con el que se quiere actualizar el atributo pista
    */

    public void setPista(Pista pista) {
        this.pista = pista;
    }

    /**
     * Getter del atributo fecha
     * @return Valor que tiene el atributo fecha
    */   

    public Fecha getFecha() {
        return fecha;
    }

    /**
     * Setter del atributo fecha
     * @param fecha Valor con el que se quiere actualizar el atributo fecha
    */

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    /**
     * Getter del atributo claveCarrera
     * @return Valor que tiene el atributo claveCarrera
    */

    public int getClaveCarrera() {
        return claveCarrera;
    }

    /**
     * Setter del atributo claveCarrera
     * @param claveCarrera Valor con el que se quiere actualizar el atributo claveCarrera
    */

    public void setClaveCarrera(int claveCarrera) {
        this.claveCarrera = claveCarrera;
    }

    /**
     * Getter del atributo posicionesCarrera
     * @return Valor que tiene el atributo posicionesCarrera
    */

    public TreeMap<Integer, Piloto> getPosicionesCarrera() {
        return posicionesCarrera;
    }

    /**
     * Setter del atributo posicionesCarrera
     * @param posicionesCarrera Valor con el que se quiere actualizar el atributo posicionesCarrera
    */

    public void setPosicionesCarrera(TreeMap<Integer, Piloto> posicionesCarrera) {
        this.posicionesCarrera = posicionesCarrera;
    }

    /**
     * Se encarga de iniciar la carrera, en la cual las posiciones se generan de manera aleatoria para asignar puntuaciones a cada piloto
     * e ir acumulando sus puntos
     * @param equipos Pista donde se va a correr
    */

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
            equipos[i].setPuntajeEquipo(equipos[i].getPiloto1().getPuntajePiloto() + equipos[i].getPiloto2().getPuntajePiloto());
        }
    }

    /**
     * Se encarga de mostrar en pantalla los resultados de la carrera, es decir, la posicion, puntaje y el piloto
    */

    public void imprimirPosicionesCarrera(){
        System.out.println("Los resultados de la carrera son los siguientes:");
        System.out.println("\t\tPosicion\tPuntaje\t\tPiloto");
        this.posicionesCarrera.forEach((key, value) -> System.out.println("\t\t   " + (key+1) + "\t\t+" + (this.posicionesCarrera.size()-key) + "Puntos" + "\t" + value.getNombrePiloto()));
        System.out.println("");
    }
}