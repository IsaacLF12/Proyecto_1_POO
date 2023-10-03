package proyecto1_poo;

import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Este archivo contiene la clase Campeonato, la cual se compone de las otras clases como atributos
 * @author Daniel H., Isaac L., Sebastian J.
 * @version 1.0
 */
public class Campeonato {
    private String nombreCampeonato;
    private Equipo[] equipos;
    private LinkedList<Carrera> carreras;
    private List<Equipo> posicionesEquipos;
    private List<Piloto> posicionesPilotos;
    private boolean status;
    private int carrerasCorridas;
    /**
    * Constructor del objeto Campeonato, inicializa los atributos con los valores que recibe como parametros.
    * @param nombreCampeonato Nombre del campeonato
    * @param equipos Arreglo con los equipos que participan en el campeonato
    * @param carreras Lista ligada con las carreras del campeonato
    * @param posicionesEquipos Lista con las posiciones actuales de los equipos en el campeonato
    * @param posicionesPilotos Lista con las posiciones actuales de los pilotos en el campeonato
    * @param status Booleano que indica el estado actual del campeonato (activo = true; finalizado = false)
    */
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

    /**
     * Getter del atributo nombreCampeonato
     * @return Valor que tiene el atributo nombreCampeonato
    */

    public String getNombreCampeonato() {
        return this.nombreCampeonato;
    }

    /**
     * Setter del atributo nombreCampeonato
     * @param nombreCampeonato Valor con el que se quiere actualizar el atributo nombreCampeonato
    */

    public void setNombreCampeonato(String nombreCampeonato) {
        this.nombreCampeonato = nombreCampeonato;
    }

    /**
     * Getter del atributo equipos
     * @return Valor que tiene el atributo equipos
    */

    public Equipo[] getEquipos() {
        return this.equipos;
    }

    /**
     * Setter del atributo equipos
     * @param equipos Valor con el que se quiere actualizar el atributo equipos
    */

    public void setEquipos(Equipo[] equipos) {
        this.equipos = equipos;
    }

    /**
     * Getter del atributo carreras
     * @return Valor que tiene el atributo carreras
    */

    public LinkedList<Carrera> getCarreras() {
        return this.carreras;
    }

    /**
     * Setter del atributo carreras
     * @param carreras Valor con el que se quiere actualizar el atributo carreras
    */

    public void setCarreras(LinkedList<Carrera> carreras) {
        this.carreras = carreras;
    }

    /**
     * Getter del atributo posicionesEquipos
     * @return Valor que tiene el atributo posicionesEquipos
    */

    public List<Equipo> getPosicionesEquipos() {
        return this.posicionesEquipos;
    }

    /**
     * Setter del atributo posicionesEquipos
     * @param posicionesEquipos Valor con el que se quiere actualizar el atributo posicionesEquipos
    */

    public void setPosicionesEquipos(List<Equipo> posicionesEquipos) {
        this.posicionesEquipos = posicionesEquipos;
    }

    /**
     * Getter del atributo posicionesPilotos
     * @return Valor que tiene el atributo posicionesPilotos
    */

    public List<Piloto> getPosicionesPilotos() {
        return this.posicionesPilotos;
    }

    /**
     * Setter del atributo posicionesPilotos
     * @param posicionesPilotos Valor con el que se quiere actualizar el atributo posicionesPilotos
    */

    public void setPosicionesPilotos(List<Piloto> posicionesPilotos) {
        this.posicionesPilotos = posicionesPilotos;
    }

    /**
     * Getter del atributo status
     * @return Valor que tiene el atributo status
    */

    public boolean isStatus() {
        return this.status;
    }

    /**
     * Getter del atributo status
     * @return Valor que tiene el atributo status
    */

    public boolean getStatus() {
        return this.status;
    }

    /**
     * Setter del atributo status
     * @param status Valor con el que se quiere actualizar el atributo status
    */

    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * Getter del atributo carrerasCorridas
     * @return Valor que tiene el atributo carrerasCorridas
    */

    public int getCarrerasCorridas(){
        return this.carrerasCorridas;
    }

    /**
     * Setter del atributo carrerasCorridas
     * @param carrerasCorridas Valor con el que se quiere actualizar el atributo carrerasCorridas
    */

    public void setCarrerasCorridas(int carrerasCorridas){
        this.carrerasCorridas = carrerasCorridas;
    }

    /**
    * Se encarga de iniciar la siguiente carrera del objeto campeonato (unicamente una), y posteriormente actualizar las posiciones y el estado del campeonato.
    * De ser la ultima carrera, se marca como finalizado el estado del campeonato.
    */
    public void iniciarSiguienteCarrera(){
        if(this.status){
            Utilerias.clearScreen();
            this.carreras.get(this.carrerasCorridas).iniciarCarrera(this.equipos);
            this.carreras.get(this.carrerasCorridas).imprimirPosicionesCarrera();
            this.carrerasCorridas++;
            this.actualizarCampeonato();
            this.imprimirCampeonato();
        }else
            System.out.println("El campeonato se encuentra finalizado.");
    }

    /**
    * Ejecuta todas las carreras restantes del campeonato, mostranto los resultados al final de cada una y actualizando las tablas de posiciones.
    * Al final cambia el estado del campeonato a finalizado.
    */
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

    /**
    * Actualiza las tablas de posiciones ordenandolas de acuerdo al puntaje.
    * Si la carrera es la ultima del campeonato, cambia el estado a finalizado.
    */
    public void actualizarCampeonato(){
        this.posicionesEquipos.sort((Comparator.comparing(Equipo::getPuntajeEquipo)).reversed());
        this.posicionesPilotos.sort((Comparator.comparing(Piloto::getPuntajePiloto)).reversed());
        if(this.carrerasCorridas==this.carreras.size())
            this.status = false;
    }

    /**
    * Imprime la informacion completa del campeonato (nombre, carreras corridas, tabla de posiciones por equipos y por pilotos).
    */
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

    /**
    * Imprime la informacion sobre la posiciones de los equipos en el campeonato.
    */
    public void imprimirCampeonatoEquipos(){
        System.out.println("Campeonato: " + this.getNombreCampeonato());
        System.out.println("\tCarreras Corridas: " + this.getCarrerasCorridas() + " de " + this.getCarreras().size());
        System.out.println("\tTabla por Equipos");
        System.out.println("\t\tPosicion\tPuntaje\t\t\tEquipo");
        for(int i=0; i<this.posicionesEquipos.size(); i++)
            System.out.println("\t\t   " + (i+1) + "\t\t" + this.posicionesEquipos.get(i).getPuntajeEquipo() + " Puntos\t\t" + this.posicionesEquipos.get(i).getNombreEquipo());
        System.out.println("");
    }

    /**
    * Imprime la informacion sobre la posiciones de los pilotos en el campeonato.
    */
    public void imprimirPilotos(){
        System.out.println("Campeonato: " + this.getNombreCampeonato() + "\n\t\t\t\t\t\tPilotos Participantes");
        System.out.println("\tEquipo\t\t\tPiloto\t\t\t\tNacionalidad\t\t\tNumero\t\t\tEdad");
        for(int i=0; i<equipos.length; i++){
            System.out.println("\t"+this.getEquipos()[i].getNombreEquipo()+"\t\t"+this.getEquipos()[i].getPiloto1().getNombrePiloto()+"\t\t"+this.getEquipos()[i].getPiloto1().getNacionalidad()
                                +"\t\t\t"+this.getEquipos()[i].getPiloto1().getNumeroPiloto()+"\t\t\t"+this.getEquipos()[i].getPiloto1().getEdadPiloto());
            System.out.println("\t"+this.getEquipos()[i].getNombreEquipo()+"\t\t"+this.getEquipos()[i].getPiloto2().getNombrePiloto()+"\t\t"+this.getEquipos()[i].getPiloto2().getNacionalidad()
                                +"\t\t\t"+this.getEquipos()[i].getPiloto2().getNumeroPiloto()+"\t\t\t"+this.getEquipos()[i].getPiloto2().getEdadPiloto());
        }
        System.out.println("");
    }

    /**
    * Imprime la informacion sobre las carreras (clave, pista, lugar, kilometraje, vueltas y fecha).
    */
    public void imprimirCalendario(){
        System.out.println("Campeonato: " + this.getNombreCampeonato() + "\n\t\t\t\t\t\tCalendario de Carreras");
        System.out.println("\tClave\t\tPista\t\t\t\tLugar\t\tKilometraje\tVueltas\t\tFecha");
        for(int i=0; i<this.getCarreras().size(); i++)
            System.out.println("\t"+this.getCarreras().get(i).getClaveCarrera()+"\t\t"+this.getCarreras().get(i).getPista().getNombrePista()+""+this.getCarreras().get(i).getPista().getLugar()
                                +"  "+this.getCarreras().get(i).getPista().getKilometraje()+"\t\t"+this.getCarreras().get(i).getPista().getNumVueltas()+"\t\t"+this.getCarreras().get(i).getFecha());
            
    }

    /**
    * Genera un campeonato de manera semi-aleatoria, los equipos y pilotos siempre son los mismos, la demas informacion es una combinacion generada de forma aletoria
    * utilizando la informacion previamente definida en las listas (nombres de campeonatos, lugares y pistas).
    * @param numeroCarreras Numero de carreras que tendra el campeonato.
    * @return Regresa un objeto de tipo campeonato generado de forma semi-aleatoria, listo para utilizarse en el programa.
    */
    public static Campeonato crearCampeonatoRandom(int numeroCarreras){
        Random aleatorio = new Random();
        List<String> nombresCampeonatos = Arrays.asList("Gran Premio Shibuya", "Gran Premio Monaco", "Gran Premio Canada", "Gran Premio Austria", "Gran Premio Italia", "Gran Premio Japon",
                                         "Gran Premio Singapur", "Gran Premio Catar", "Gran Premio de Estados Unidos", "Gran Premio Brasil", "Gran Premio de las Vegas");
        List<String> nombresLugares = Arrays.asList("Australia       ", "Bahrein         ", "China           ", "Espania         ", "Monaco          ", "Canada          ", "Francia         ", 
                                                         "Austria         ", "Reino Unido     ", "Holanda         ", "Belgica         ", "Italia          ", "Rusia           ", "Turquia         ", 
                                                         "Estados Unidos  ", "Mexico          ", "Arabia Saudita  ", "Abu Dhabi       "); 
        List<String> nombresPistas = Arrays.asList("Albert Park                     ","Bahrain International Circuit   ","Shanghai International Circuit  ","Circuit de Barcelona-Catalunya  ",
                                                        "Circuit de Monaco               ","Circuit Gilles Villeneuve       ","Circuit Paul Ricard             ","Red Bull Ring                   ",
                                                        "Silverstone Circuit             ","Circuit Zandvoort               ","Circuit de Spa-Francorchamps    ","Autodromo Nazionale Monza       ",
                                                        "Sochi Autodrom                  ","Istanbul Park                   ","Circuit of the Americas         ","Autodromo Hermanos Rodríguez    ",
                                                        "Jeddah Corniche Circuit         ","Yas Marina Circuit              ","Hockenheimring                  ","Hungaroring                     ",
                                                        "Marina Bay Street Circuit       ","Suzuka Circuit                  ","Baku City Circuit               ","Circuit de Nevers Magny-Cours   ",
                                                        "Autodromo Jose Carlos Pace      ","Kyalami Racing Circuit          ","Watkins Glen International      ","Anderstorp Raceway              ",
                                                        "Imola Circuit                   ");                       
        Equipo[] modeloEquipos = new Equipo[10];
        modeloEquipos[0] = new Equipo("Mercedes    ", 145, new Piloto("Lewis Hamilton        ", "Reino Unido    ", 44, 38), new Piloto("George Russell      ", "Reino Unido    ", 63, 25));
        modeloEquipos[1] = new Equipo("Alpine      ", 280, new Piloto("Pierre Gasly          ", "Francia        ", 10, 27), new Piloto("Esteban Ocon        ", "Francia        ", 31, 27));
        modeloEquipos[2] = new Equipo("Haas        ", 315, new Piloto("Kevin Magnussen       ", "Dinamarca      ", 20, 31), new Piloto("Nico Hulkenberg     ", "Alemania       ", 27, 36));
        modeloEquipos[3] = new Equipo("Mclaren     ", 269, new Piloto("Lando Norris          ", "Reino Unido    ", 4, 24), new Piloto("Oscar Piastri       ", "Australia      ", 81, 22));
        modeloEquipos[4] = new Equipo("Red Bull    ", 389, new Piloto("Max Verstappen        ", "Holanda        ", 1, 26), new Piloto("Sergio 'Checo' Perez", "Mexico         ", 11, 33));
        modeloEquipos[5] = new Equipo("Aston Martin", 570, new Piloto("Fernando Alonso       ", "Espania        ", 14, 42), new Piloto("Lance Stroll        ", "Canada         ", 18, 25));
        modeloEquipos[6] = new Equipo("Alphatauri  ", 996, new Piloto("Nyck de Vries         ", "Paises Bajos   ", 21, 28), new Piloto("Yuki Tsunoda        ", "Japon          ", 22, 23));
        modeloEquipos[7] = new Equipo("Ferrari     ", 854, new Piloto("Charles Leclerc       ", "Monaco         ", 16, 26), new Piloto("Carlos Sainz        ", "Espania        ", 55, 29));
        modeloEquipos[8] = new Equipo("Alfa Romeo  ", 669, new Piloto("Guanyu Zhou           ", "China          ", 24, 24), new Piloto("Valtteri Bottas     ", "Finlandia      ", 77, 34));
        modeloEquipos[9] = new Equipo("Williams    ", 420, new Piloto("Logan Sargeant        ", "Estados Unidos ", 2, 22), new Piloto("Alexander Albon     ", "Tailandia      ", 23, 27));
        LinkedList<Carrera> modeloCarreras = new LinkedList<>();
        for(int i=0; i<numeroCarreras; i++){
            modeloCarreras.add(new Carrera(new Pista(aleatorio.nextInt(74)+30, nombresLugares.get(aleatorio.nextInt(nombresLugares.size())), aleatorio.nextInt(305)+100, 
                            nombresPistas.get(aleatorio.nextInt(nombresPistas.size()))), new Fecha(aleatorio.nextInt(31)+1, aleatorio.nextInt(12)+1, 2023),
                            aleatorio.nextInt(99999), new TreeMap<>()));
        }
        return new Campeonato(nombresCampeonatos.get(aleatorio.nextInt(nombresCampeonatos.size())), modeloEquipos, modeloCarreras, new ArrayList<Equipo>(), new ArrayList<Piloto>(), true);
    }
}