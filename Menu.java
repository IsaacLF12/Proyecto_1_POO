/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1_poo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;
/**
 *
 * @author Sebjimort
 */
public class Menu {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        Scanner In2 = new Scanner(System.in);
        LinkedList<Campeonato> campeonatos = new LinkedList<>();
        //Creando Campeonato desde codigo
        Equipo[] equiposPrueba = new Equipo[3];
        equiposPrueba[0] = new Equipo("Red Bull    ", 458, new Piloto("Checo Perez           ", "Mexico         ", 42, 33), new Piloto("Max Verstappen        ", "Belga          ", 18, 26));
        equiposPrueba[1] = new Equipo("Ferrari     ", 512, new Piloto("Michele Alboreto      ", "Italiano       ", 15, 39), new Piloto("Lorenzo Bandini       ", "Italiano       ", 2, 42));
        equiposPrueba[2] = new Equipo("Mercedes    ", 304, new Piloto("Lewis Hamilton        ", "Britanico      ", 12, 38), new Piloto("Michael Schumacher    ", "Alemania       ", 7, 54));
        LinkedList<Carrera> carrerasPrueba = new LinkedList<>();
        carrerasPrueba.add(new Carrera(new Pista(5, "Shangai         ", 230, "Aintree                         "), new Fecha(25, 7, 2023), 458, new TreeMap<>()));
        carrerasPrueba.add(new Carrera(new Pista(8, "Australia       ", 510, "Adelaida                        "), new Fecha(26, 7, 2023), 4502, new TreeMap<>()));
        carrerasPrueba.add(new Carrera(new Pista(8, "Alemania        ", 300, "Avus                            "), new Fecha(29, 7, 2023), 478, new TreeMap<>()));
        carrerasPrueba.add(new Carrera(new Pista(8, "Estados Unidos  ", 510, "Caesars Palace                  "), new Fecha(3, 8, 2023), 225, new TreeMap<>()));
        campeonatos.add(new Campeonato("Gran Premio Tokyo", equiposPrueba, carrerasPrueba, new ArrayList<Equipo>(), new ArrayList<Piloto>(), true));
        //Terminando de crear campeonato
        while(true){
            int activos, inactivos, opC;
            Utilerias.clearScreen();
            System.out.println("Sistema de administracion de automovilismo de Formula 1");
            System.out.println("\t1. Crear Campeonato\n\t2. Ver Campeonatos Finalizados\n\t3. Ver Campeonatos Activos\n\t4. Ver informacion sobre los Campeonatos");
            System.out.println("Cualquier otro numero para salir");
            switch(In.nextInt()){
                case 1:
                    int numEquipos, claveEquipo, numeroPiloto, edadPiloto, numCarreras, numVueltas, kilometraje, dia, mes, anio, claveCarrera;
                    String nombreCampeonato, nombreEquipo, nombrePiloto, nacionalidad, lugar, nombrePista;
                    Utilerias.clearScreen();
                    System.out.println("Elige la forma en la que quieres crear el campeonato:\n\t1. Manualmente\n\t2. De forma semi aleatoria");
                    switch(In.nextInt()){
                        case 1:
                            System.out.print("\tIntroduce el nombre del Campeonato: ");
                            nombreCampeonato = In2.nextLine();
                            System.out.print("\tIntroduce el numero de equipos a participar: ");
                            numEquipos = In.nextInt();
                            HashSet<Equipo> equipos = new HashSet<>();
                            for(int i=0; i<numEquipos; i++){
                                System.out.println("\tPara el Equipo " + (i+1) + ": ");
                                System.out.print("\t\tIntroduce el nombre: ");
                                nombreEquipo = In2.nextLine();
                                System.out.print("\t\tIntroduce la clave: ");
                                claveEquipo = In.nextInt();
                                Piloto[] pilotos = new Piloto[2];
                                for(int j=0; j<2; j++){
                                    System.out.println("\t\tIntroduce los datos del piloto " + (j+1) + ": ");
                                    System.out.print("\t\t\tNombre: ");
                                    nombrePiloto = In2.nextLine();
                                    System.out.print("\t\t\tNacionalidad: ");
                                    nacionalidad = In2.nextLine();
                                    System.out.print("\t\t\tNumero: ");
                                    numeroPiloto = In.nextInt();
                                    System.out.print("\t\t\tEdad: ");
                                    edadPiloto = In.nextInt();
                                    pilotos[j] = new Piloto(nombrePiloto, nacionalidad, numeroPiloto, edadPiloto);
                                }
                                if(!equipos.add(new Equipo(nombreEquipo, claveEquipo, pilotos[0], pilotos[1]))){
                                    System.out.println("Ya existe ese equipo introduce otro");
                                    i--;
                                }                              
                            }
                            LinkedList<Carrera> carreras = new LinkedList<>();
                            System.out.println("Introduce el numero de carreras en el campeonato:");
                            numCarreras = In.nextInt();
                            for(int i=0; i<numCarreras; i++){
                                System.out.println("\tPara la carrera " + (i+1) + " introduce:");
                                System.out.print("\t\tNumero de vueltas de la pista: ");
                                numVueltas = In.nextInt();
                                System.out.print("\t\tLugar de la pista: ");
                                lugar = In2.nextLine();
                                System.out.print("\t\tKilometraje de la pista: ");
                                kilometraje = In.nextInt();
                                System.out.print("\t\tNombre de la pista: ");
                                nombrePista = In2.nextLine();
                                System.out.println("\t\tFecha:");
                                System.out.print("\t\t\tDia: ");
                                dia = In.nextInt();
                                System.out.print("\t\t\tMes: ");
                                mes = In.nextInt();
                                System.out.print("\t\t\tAnio: ");
                                anio = In.nextInt();
                                System.out.print("\t\tClave: ");
                                claveCarrera = In.nextInt();
                                carreras.add(new Carrera(new Pista(numVueltas, lugar, kilometraje, nombrePista), new Fecha(dia, mes, anio), claveCarrera, new TreeMap<>()));
                            }
                            campeonatos.add(new Campeonato(nombreCampeonato, equipos.toArray(new Equipo[0]), carreras, new ArrayList<Equipo>(), new ArrayList<Piloto>(), true));
                            break;
                        case 2:
                            System.out.print("Cuantas carreras quieres que tenga el campeonato, introduce un numero entre 3 y 8 para las carreras: ");
                            numCarreras = In.nextInt();
                            while(numCarreras<3 || numCarreras>8){
                                System.out.println("Introduce un valor valido para el numero de carreras.");
                                numCarreras = In.nextInt();
                            }
                            campeonatos.add(Campeonato.crearCampeonatoRandom(numCarreras));
                            break;
                        default:
                            System.out.println("Opcion invalida");
                            break;
                    }
                    Utilerias.pause();
                    break;
                case 2:
                    inactivos = 0;
                    Utilerias.clearScreen();
                    System.out.println("Estos son los campeonatos finalizados:");
                    for(int i=0; i<campeonatos.size(); i++)
                        if(!campeonatos.get(i).isStatus()){
                            System.out.println("\t" + (i+1) + " " + campeonatos.get(i).getNombreCampeonato());
                            inactivos++;
                        }
                    if(inactivos>0){
                        System.out.print("Introduce el numero del campeonato del que quieres ver los resultados: ");
                        opC = In.nextInt()-1;
                        if(opC<0 || opC>=campeonatos.size())
                            System.out.println("Opcion invalida\nRegresando al menu principal");
                        else{
                            campeonatos.get(opC).imprimirCampeonato();
                            numCarreras = campeonatos.get(opC).getCarreras().size();
                            System.out.println("De las " + numCarreras + " carreras, de cual quieres ver los resultados:");
                            for(int i=0; i<numCarreras; i++)
                                System.out.println("\t"+ (i+1) + " " + campeonatos.get(opC).getCarreras().get(i).getPista().getNombrePista());
                            int carreraS = In.nextInt();
                            if(carreraS<0 || carreraS>numCarreras)
                                System.out.println("Opcion invalida");
                            else{
                                System.out.println("Para la carrera de " +  campeonatos.get(opC).getCarreras().get(carreraS-1).getPista().getNombrePista() + ":");
                                campeonatos.get(opC).getCarreras().get(carreraS-1).imprimirPosicionesCarrera();
                            }
                        }
                    }else
                        System.out.println("No hay campeonatos completados");
                    Utilerias.pause();
                    break;
                case 3:
                    activos = 0;
                    Utilerias.clearScreen();
                    System.out.println("Estos son los campeonatos activos:");
                    for(int i=0; i<campeonatos.size(); i++)
                        if(campeonatos.get(i).isStatus()){
                            System.out.println("\t" + (i+1) + " " + campeonatos.get(i).getNombreCampeonato());
                            campeonatos.get(i).imprimirCampeonatoEquipos();
                            activos++;
                        }
                    if(activos>0){
                        System.out.print("Elige uno de los campeonatos para continuarlo o ingresa un numero diferente para regresar al menu principal: ");
                        opC = In.nextInt()-1;
                        if(opC<0 || opC>=campeonatos.size())
                            System.out.println("Regresando al menu principal.");
                        else{
                            System.out.println("Que deseas hacer:\n\t1. Iniciar una carrera\n\t2. Completar el campeonato");
                            switch(In.nextInt()){
                                case 1:
                                    campeonatos.get(opC).iniciarSiguienteCarrera();
                                    break;
                                case 2:
                                    campeonatos.get(opC).completarCampeonato();
                                    break;
                                default:
                                    System.out.println("Opcion invalida.");
                                    Utilerias.pause();
                                    break;
                            }
                        }
                    }else{
                        System.out.println("No hay campeonatos activos.");
                        Utilerias.pause();
                    }
                    break;
                case 4:
                    Utilerias.clearScreen();
                    if(campeonatos.size()==0)
                        System.out.println("No hay campeonatos.");
                    else{
                        System.out.println("Campeonatos:");
                        for(int i=0; i<campeonatos.size(); i++)
                            System.out.println("\t" + (i+1) + " " + campeonatos.get(i).getNombreCampeonato());
                        System.out.print("Introduce el campeonato sobre el que quieras ver mas informacion: ");
                        opC = In.nextInt()-1;
                        if(opC<0 || opC>=campeonatos.size())
                            System.out.println("Opcion invalida.");
                        else{
                            System.out.println("Elige la informacion que desees ver:\n\t1. Pilotos Participantes\n\t2. Calendario de Carreras");
                            switch(In.nextInt()){
                                case 1:
                                    campeonatos.get(opC).imprimirPilotos();
                                    break;
                                case 2:
                                    campeonatos.get(opC).imprimirCalendario();
                                    break;
                                default:
                                    System.out.println("Opcion invalida.");
                                    break;
                            }
                        }
                    }
                    
                    Utilerias.pause();
                    break;
                    default:
                        return;
            }
        }
    }  
}