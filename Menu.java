/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1_poo;

import java.util.ArrayList;
import java.util.Collections;
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
        equiposPrueba[0] = new Equipo("Red Bull", 458, new Piloto("Checo Perez", "Mexicano", 42, 33), new Piloto("Max Verstappen", "Belga", 18, 26));
        equiposPrueba[1] = new Equipo("Ferrari", 512, new Piloto("Michele Alboreto", "Italiano", 15, 39), new Piloto("Lorenzo Bandini", "	Italiano", 2, 42));
        equiposPrueba[2] = new Equipo("Mercedes", 304, new Piloto("Lewis Hamilton", "Britanico", 12, 38), new Piloto("Michael Schumacher", "	Aleman", 7, 54));
        LinkedList<Carrera> carrerasPrueba = new LinkedList<>();
        carrerasPrueba.add(new Carrera(new Pista(5, "Shangai", 230, "Aintree"), new Fecha(25, 7, 2023), 458, new TreeMap<>()));
        carrerasPrueba.add(new Carrera(new Pista(8, "Australia", 510, "Adelaida"), new Fecha(26, 7, 2023), 4502, new TreeMap<>()));
        carrerasPrueba.add(new Carrera(new Pista(8, "Alemania", 300, "Avus"), new Fecha(29, 7, 2023), 478, new TreeMap<>()));
        carrerasPrueba.add(new Carrera(new Pista(8, "Estados Unidos", 510, "Caesars Palace"), new Fecha(3, 8, 2023), 225, new TreeMap<>()));
        campeonatos.add(new Campeonato("Gran Premio Tokyo", equiposPrueba, carrerasPrueba, new ArrayList<Equipo>(), new ArrayList<Piloto>(), true));
        //Terminando de crear campeonato
        while(true){
            Utilerias.clearScreen();
            System.out.println("Sistema de administracion de automovilismo de Formula 1");
            System.out.println("\t1. Crear Campeonato\n\t2. Ver Campeonatos Finalizados\n\t3. Ver Campeonatos Activos\n\t4. Continuar Campeonato");
            System.out.println("Cualquier otro numero para salir");
            switch(In.nextInt()){
                case 1:
                    int numEquipos, claveEquipo, numeroPiloto, edadPiloto, numCarreras, numVueltas, kilometraje, dia, mes, anio, claveCarrera;
                    String nombreCampeonato, nombreEquipo, nombrePiloto, nacionalidad, lugar, nombrePista;
                    Utilerias.clearScreen();
                    System.out.print("\tIntroduce el nombre del Campeonato: ");
                    nombreCampeonato = In2.nextLine();
                    System.out.print("\tIntroduce el numero de equipos a participar: ");
                    numEquipos = In.nextInt();
                    Equipo[] equipos = new Equipo[numEquipos];
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
                        equipos[i] = new Equipo(nombreEquipo, claveEquipo, pilotos[0], pilotos[1]);
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
                    campeonatos.add(new Campeonato(nombreCampeonato, equipos, carreras, new ArrayList<Equipo>(), new ArrayList<Piloto>(), true));
                    Utilerias.pause();
                    break;
                case 2:
                    Utilerias.clearScreen();
                    for(Campeonato i : campeonatos)
                        if(!i.isStatus())
                            i.imprimirCampeonato();
                    Utilerias.pause();
                    break;
                case 3:
                    Utilerias.clearScreen();
                    for(Campeonato i : campeonatos)
                        if(i.isStatus())
                            i.imprimirCampeonato();
                    Utilerias.pause();
                    break;
                case 4:
                    int opC, activos=0;
                    Utilerias.clearScreen();
                    System.out.println("Estos son los campeonatos activos:");
                    for(int i=0; i<campeonatos.size(); i++)
                        if(campeonatos.get(i).isStatus()){
                            System.out.println("\t" + (i+1) + " " + campeonatos.get(i).getNombreCampeonato());
                            activos++;
                        }
                    if(activos>0){
                        System.out.print("Introduce el numero del campeonato que quieres inciar: ");
                        opC = In.nextInt()-1;
                        campeonatos.get(opC).iniciarCampeonato();
                    }else
                        System.out.println("No hay campeonatos activos");
                    Utilerias.pause();
                    break;
                    default:
                    return;
            }
        }
    }  
}
