package tarea8discovery;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Tarea8Discovery {

    public static void main(String[] args) {
        Scanner enteros = new Scanner(System.in);
        Scanner orac = new Scanner(System.in);
        Scanner car = new Scanner(System.in);
        int opcion;
        Transportistas tr = new Transportistas();
        Persona temp = new Persona();
        Alumnos temp2 = new Alumnos();
        Transportes temp3 = new Transportes();
        ArrayList<Clases> clases = new ArrayList();
        ArrayList<Estaciones> estaciones = new ArrayList();
        ArrayList<Persona> personas = new ArrayList();
        ArrayList<Alumnos> alumnos = new ArrayList();
        ArrayList<Transportes> transportes = new ArrayList();
        ArrayList<Transportistas> transportistas = new ArrayList();
        do {
            System.out.println("""
                               0. Salir
                               1. Crear Clase
                               2. Crear Ruta
                               3. Crear Alumno
                               4. Agregar Clase a Alumno
                               5. Crear Transportista
                               6. Crear Transporte
                               7. Simulación
                               8. Listar Clases
                               9. Listar Rutas
                               10. Listar Alumnos
                               11. Listar Transportistas
                               12. Listar Transportes
                               """);
            System.out.print("Ingrese la opcion a evaluar: ");
            opcion = enteros.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("Saliendoooooooo.........");
                    break;
                case 1:
                    Clases clase = new Clases();
                    System.out.print("Ingrese el nombre de la clase: ");
                    String nombreclase = orac.nextLine();
                    boolean sera;
                    String codigoclase;
                    do {
                        System.out.print("Ingrese el codigo de la clase: ");
                        codigoclase = orac.nextLine();
                        sera = clase.codigounico(clases, codigoclase);
                        if (sera == false) {
                            System.out.println("Ese codigo ya lo tiene otra clase, ingrese de nuevo");
                        }
                    } while (sera == false);
                    clases.add(new Clases(nombreclase, codigoclase));
                    System.out.println("Se creo la clase correctamente");
                    break;
                case 2:
                    System.out.print("Ingrese el nombre de la estacion: ");
                    String nombreestacion = orac.nextLine();
                    System.out.print("Ingrese la coordenada x: ");
                    int x = enteros.nextInt();
                    System.out.print("Ingrese la coordenada y: ");
                    int y = enteros.nextInt();
                    estaciones.add(new Estaciones(nombreestacion, x, y));
                    System.out.println("Se creo la estacion correctamente");
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del alumno: ");
                    String nombrealumno = orac.nextLine();
                    int id;
                    boolean bandera;
                    do {
                        System.out.print("Ingrese el numero de identidad del alumno: ");
                        id = enteros.nextInt();
                        bandera = temp.identidadunica(personas, id);
                        if (bandera == false) {
                            System.out.println("Este numero de identidad ya tiene duenio, ingrese de nuevo");
                        }
                    } while (bandera == false);
                    System.out.print("Ingrese el dia de nacimiento: ");
                    int dia = enteros.nextInt();
                    System.out.print("Ingrese el numero del mes de nacimiento: ");
                    int mes = enteros.nextInt();
                    System.out.print("Ingrese el anio de nacimiento: ");
                    int anio = enteros.nextInt();
                    Date fechanacimiento = new Date(anio - 1900, mes - 1, dia);
                    personas.add(new Alumnos(alumnos.size() + 1, nombrealumno, id, fechanacimiento));
                    alumnos.add(new Alumnos(alumnos.size() + 1, nombrealumno, id, fechanacimiento));
                    System.out.println("Se creo el alumno correctamente");

                    break;
                case 4:
                    if (clases.isEmpty() || alumnos.isEmpty()) {
                        System.out.println("No se puede, o no hay alumnos, o no hay clases");
                    } else {
                        int cual;
                        do {
                            for (Alumnos a : alumnos) {
                                System.out.println(alumnos.indexOf(a) + "- " + a);
                            }
                            System.out.print("Ingrese que alumno desea: ");
                            cual = enteros.nextInt();
                            if (cual >= alumnos.size() || cual < 0) {
                                System.out.println("Opcion no valida, ingrese de nuevo");
                            }
                        } while (cual >= alumnos.size() || cual < 0);
                        int cual2;
                        do {
                            for (Clases c : clases) {
                                System.out.println(clases.indexOf(c) + "- " + c);
                            }
                            System.out.print("Ingrese que clase quiere meterle al alumno: ");
                            cual2 = enteros.nextInt();
                            if (cual2 >= clases.size() || cual2 < 0) {
                                System.out.println("Opcion no valida, ingrese de nuevo");
                            }
                        } while (cual2 >= clases.size() || cual2 < 0);
                        alumnos.get(cual).getClases().add(clases.get(cual2));
                        System.out.println("Se ha agregado correctamente");
                    }
                    break;
                case 5:
                    System.out.print("Ingrese el nombre del alumno: ");
                    String nombretransp = orac.nextLine();
                    int idtransp;
                    boolean bandera3;
                    do {
                        System.out.print("Ingrese el numero de identidad del alumno: ");
                        idtransp = enteros.nextInt();
                        bandera3 = temp.identidadunica(personas, idtransp);
                        if (bandera3 == false) {
                            System.out.println("Este numero de identidad ya tiene duenio, ingrese de nuevo");
                        }
                    } while (bandera3 == false);
                    System.out.print("Ingrese sus anios de experiencia: ");
                    int aniosexp = enteros.nextInt();
                    System.out.print("Ingrese su apodo de barrio: ");
                    String apodo = orac.nextLine();
                    System.out.print("Ingrese el dia de nacimiento: ");
                    int dia2 = enteros.nextInt();
                    System.out.print("Ingrese el numero del mes de nacimiento: ");
                    int mes2 = enteros.nextInt();
                    System.out.print("Ingrese el anio de nacimiento: ");
                    int anio2 = enteros.nextInt();
                    Date fechanacimiento2 = new Date(anio2 - 1900, mes2 - 1, dia2);
                    personas.add(new Transportistas(aniosexp, apodo, nombretransp, idtransp, fechanacimiento2));
                    transportistas.add(new Transportistas(aniosexp, apodo, nombretransp, idtransp, fechanacimiento2));
                    break;
                case 6:
                    if (transportistas.isEmpty()) {
                        System.out.println("no hay transportista");
                    } else {
                        boolean repe;
                        String placa;
                        do {
                            System.out.print("Ingrese la placa: ");
                            placa = orac.nextLine();
                            repe = temp3.unico(transportes, placa);
                            if (repe == false) {
                                System.out.println("Esta placa ya la tiene otro transporte, ingrese una nueva");
                            }
                        } while (repe == false);
                        Color color = JColorChooser.showDialog(null, "Ingrese el color del transporte", Color.WHITE);
                        int op;
                        do {
                            for (Transportistas u : transportistas) {
                                System.out.println(transportistas.indexOf(u) + "- " + u);
                            }
                            System.out.println("Ingrese que transportista quiere: ");
                            op = enteros.nextInt();
                            if (op >= transportistas.size() || op < 0) {
                                System.out.println("Opcion no valida, ingrese de nuevo");
                            }
                        } while (op >= transportistas.size() || op < 0);

                        int quetrans;
                        do {
                            System.out.println("""
                                               1- Bus
                                               2- Rapidito
                                               3- Taxi
                                               4 Mototaxi""");
                            System.out.print("Ingrese que tipo de transporte tiene: ");
                            quetrans = enteros.nextInt();
                            if (quetrans > 4 || quetrans < 1) {
                                System.out.println("Opcion no valida, ingrese de nuevo");
                            }
                        } while (quetrans > 4 || quetrans < 1);
                        switch (quetrans) {
                            case 1:
                                System.out.print("Ingrese el numero de sillas: ");
                                int numsillas = enteros.nextInt();
                                System.out.print("Ingrese la capacidad de personas en pie: ");
                                int personasenpie = enteros.nextInt();
                                transportes.add(new Buses(numsillas, personasenpie, placa, color, transportistas.get(op)));
                                System.out.println("Se ha creado el bus");
                                break;
                            case 2:
                                System.out.print("Ingrese el numero de sillas: ");
                                int numsillas2 = enteros.nextInt();
                                transportes.add(new Rapiditos(numsillas2, placa, color, transportistas.get(op)));
                                System.out.println("Se ha creado el rapidito");
                                break;
                            case 3:
                                System.out.print("Ingrese el numero del taxi: ");
                                int numtaxi = enteros.nextInt();
                                transportes.add(new Taxis(numtaxi, placa, color, transportistas.get(op)));
                                System.out.println("Se ha creado el taxi");
                                break;
                            case 4:
                                transportes.add(new Mototaxis(placa, color, transportistas.get(op)));
                                System.out.println("Se ha creado la mototaxi");
                                break;
                        }
                    }
                    break;

                case 7:
                    int sim;
                    int transp;
                    ArrayList<Alumnos> copia = new ArrayList();
                    copia = alumnos;
                    do {
                        for (Transportes r : transportes) {
                            System.out.println(transportes.indexOf(r) + "- " + r);
                        }
                        System.out.print("Ingrese que transporte va a usar: ");
                        transp = enteros.nextInt();
                        if (transp >= transportes.size() || transp < 0) {
                            System.out.println("Opcion no valida, inserte de nuevo");
                        }
                    } while (transp >= transportes.size() || transp < 0);
                    do {
                        System.out.println("""
                                           0. Salir
                                           1. Subir alumno al transporte
                                           2. Bajar alumno del transporte
                                           3. Listar alumnos del transporte
                                           4. Escoger transportista
                                           5. Quitar transportista
                                           6. Añadir ruta
                                           7. Quitar ruta
                                           8. Imprimir transporte
                                           9. Comenzar
                                           """);
                        System.out.print("Ingrese que quiere hacer: ");
                        sim = enteros.nextInt();
                        switch (sim) {
                            case 0:
                                System.out.println("Se ha salido de la simulacion");
                                break;
                            case 1:
                                if (transportes.get(transp) instanceof Buses) {
                                    if (((Buses) (transportes.get(transp))).getNumsillas() + ((Buses) (transportes.get(transp))).getNumpersonasenpie() > ((Buses) (transportes.get(transp))).getLista().size()) {
                                        int ran = new Random().nextInt((copia.size() - 1 - 0) + 1) + 0;
                                        ((Buses) (transportes.get(transp))).getLista().add(copia.get(ran));
                                        System.out.println("Se ha subido " + copia.get(ran).getNombre());
                                        copia.remove(ran);
                                    } else {
                                        System.out.println("Ya no hay mas espacio sorry");
                                    }
                                } else if (transportes.get(transp) instanceof Rapiditos) {
                                    if ((((Rapiditos) (transportes.get(transp))).getNumsillas() > ((Rapiditos) (transportes.get(transp))).getLista().size())) {
                                        int ran2 = new Random().nextInt((copia.size() - 1 - 0) + 1) + 0;
                                        ((Rapiditos) (transportes.get(transp))).getLista().add(copia.get(ran2));
                                        System.out.println("Se ha subido " + copia.get(ran2).getNombre());
                                        copia.remove(ran2);
                                    } else {
                                        System.out.println("Ya no hay espacio");
                                    }
                                } else if (transportes.get(transp) instanceof Taxis) {
                                    if (((Taxis) (transportes.get(transp))).getLista().size() < 4) {
                                        int ran3 = new Random().nextInt((copia.size() - 1 - 0) + 1) + 0;
                                        ((Taxis) (transportes.get(transp))).getLista().add(copia.get(ran3));
                                        System.out.println("Se ha subido " + copia.get(ran3).getNombre());
                                        copia.remove(ran3);
                                    } else {
                                        System.out.println("Ya no hay espacio");
                                    }
                                } else if (transportes.get(transp) instanceof Mototaxis) {
                                    if (((Mototaxis) (transportes.get(transp))).getLista().size() < 2) {
                                        int ran4 = new Random().nextInt((copia.size() - 1 - 0) + 1) + 0;
                                        ((Mototaxis) (transportes.get(transp))).getLista().add(copia.get(ran4));
                                        System.out.println("Se ha subido " + copia.get(ran4).getNombre());
                                        copia.remove(ran4);
                                    } else {
                                        System.out.println("Ya no hay espacio");
                                    }
                                }
                                break;
                            case 2:
                                if (transportes.get(transp) instanceof Buses) {
                                    if (((Buses) (transportes.get(transp))).getLista().isEmpty()) {
                                        System.out.println("No hay alumnos en el transporte");
                                    } else {
                                        int rand = new Random().nextInt((((Buses) (transportes.get(transp))).getLista().size() - 1 - 0) + 1) + 0;
                                        System.out.println("Se ha bajado " + ((Buses) (transportes.get(transp))).getLista().get(rand).getNombre());
                                        ((Buses) (transportes.get(transp))).getLista().remove(rand);
                                    }
                                } else if (transportes.get(transp) instanceof Rapiditos) {
                                    if (((Rapiditos) (transportes.get(transp))).getLista().isEmpty()) {
                                        System.out.println("No hay alumnos en el transporte");
                                    } else {
                                        int rand2 = new Random().nextInt((((Rapiditos) (transportes.get(transp))).getLista().size() - 1 - 0) + 1) + 0;
                                        System.out.println("Se ha bajado " + ((Rapiditos) (transportes.get(transp))).getLista().get(rand2).getNombre());
                                        ((Rapiditos) (transportes.get(transp))).getLista().remove(rand2);
                                    }
                                } else if (transportes.get(transp) instanceof Taxis) {
                                    if (((Taxis) (transportes.get(transp))).getLista().isEmpty()) {
                                        System.out.println("No hay alumnos en el transporte");
                                    } else {
                                        int rand3 = new Random().nextInt((((Taxis) (transportes.get(transp))).getLista().size() - 1 - 0) + 1) + 0;
                                        System.out.println("Se ha bajado " + ((Taxis) (transportes.get(transp))).getLista().get(rand3).getNombre());
                                        ((Taxis) (transportes.get(transp))).getLista().remove(rand3);
                                    }
                                } else if (transportes.get(transp) instanceof Mototaxis) {
                                    if (((Mototaxis) (transportes.get(transp))).getLista().isEmpty()) {
                                        System.out.println("No hay alumnos en el transporte");
                                    } else {
                                        int rand4 = new Random().nextInt((((Mototaxis) (transportes.get(transp))).getLista().size() - 1 - 0) + 1) + 0;
                                        System.out.println("Se ha bajado " + ((Mototaxis) (transportes.get(transp))).getLista().get(rand4).getNombre());
                                        ((Mototaxis) (transportes.get(transp))).getLista().remove(rand4);
                                    }
                                }
                                break;
                            case 3:
                                if (transportes.get(transp) instanceof Buses) {
                                    for (Alumnos q : ((Buses) (transportes.get(transp))).getLista()) {
                                        System.out.println(((Buses) (transportes.get(transp))).getLista().indexOf(q) + "- " + q);
                                    }
                                } else if (transportes.get(transp) instanceof Rapiditos) {
                                    for (Alumnos q : ((Rapiditos) (transportes.get(transp))).getLista()) {
                                        System.out.println(((Rapiditos) (transportes.get(transp))).getLista().indexOf(q) + "- " + q);
                                    }
                                } else if (transportes.get(transp) instanceof Taxis) {
                                    for (Alumnos q : ((Taxis) (transportes.get(transp))).getLista()) {
                                        System.out.println(((Taxis) (transportes.get(transp))).getLista().indexOf(q) + "- " + q);
                                    }
                                } else if (transportes.get(transp) instanceof Mototaxis) {
                                    for (Alumnos q : ((Mototaxis) (transportes.get(transp))).getLista()) {
                                        System.out.println(((Mototaxis) (transportes.get(transp))).getLista().indexOf(q) + "- " + q);
                                    }
                                }
                                break;
                            case 4:
                                int tra;
                                do {
                                    for (Transportistas b : transportistas) {
                                        System.out.println(transportistas.indexOf(b) + "- " + b);
                                    }
                                    System.out.println("Ingrese que transportista quiere: ");
                                    tra = enteros.nextInt();
                                    if (tra >= transportistas.size() || tra < 0) {
                                        System.out.println("Opcion no valida, ingrese de nuevo");
                                    }
                                } while (tra >= transportistas.size() || tra < 0);
                                transportes.get(transp).setTransportista(transportistas.get(tra));
                                System.out.println("Se ha agregado el transportista " + transportistas.get(tra).getApodo());
                                break;
                            case 5:
                                if (transportes.get(transp).getTransportista() == null) {
                                    System.out.println("No hay transportista");
                                } else {
                                    System.out.println("El transportista ha dedicido marcharse");
                                    transportes.get(transp).setTransportista(null);
                                }
                                break;
                            case 6:
                                char resp = 'n';
                                int contest = 0;
                                int est;
                                do {
                                    do {
                                        for (Estaciones i : estaciones) {
                                            System.out.println(estaciones.indexOf(i) + "- " + i);
                                        }
                                        System.out.print("Ingrese que estacion quiere aniadir: ");
                                        est = enteros.nextInt();
                                        if (est >= estaciones.size() || est < 0) {
                                            System.out.println("Opcion no valida, ingrese de nuevo");
                                        }
                                    } while (est >= estaciones.size() || est < 0);
                                    transportes.get(transp).getEstaciones().add(estaciones.get(est));
                                    System.out.println("Se ha aniadido la estacion");
                                    contest++;
                                    System.out.print("Desea salir[s\n]: ");
                                    resp = car.next().charAt(0);
                                } while (((resp == 'N') || (resp == 'n')));
                                break;
                            case 7:
                                if (estaciones.isEmpty()) {
                                    System.out.println("No hay estaciones");
                                } else {
                                    int quit;
                                    do {
                                        for (Estaciones n : estaciones) {
                                            System.out.println(estaciones.indexOf(n) + "- " + n);
                                        }
                                        System.out.print("Ingrese que estacion quiere quitar: ");
                                        quit = enteros.nextInt();
                                        if (quit >= estaciones.size() || quit < 0) {
                                            System.out.println("Opcion no valida, ingrese de nuevo");
                                        }
                                    } while (quit >= estaciones.size() || quit < 0);
                                    transportes.get(transp).getEstaciones().remove(quit);
                                    System.out.println("Se ha eliminado la estacion");
                                }
                                break;
                            case 8:
                                System.out.println(transportes.get(transp));
                                break;
                            case 9:
                                System.out.println("Salimos del colegio");
                                int contt = 0;
                                double calc = Math.sqrt(Math.pow(transportes.get(transp).getEstaciones().get(0).getX() - 0, 2) + Math.pow(transportes.get(transp).getEstaciones().get(0).getY() - 0, 2));
                                System.out.println(calc);
                                contt++;
                                while (contt < estaciones.size() - 1) {
                                    calc = Math.sqrt(Math.pow(transportes.get(transp).getEstaciones().get(contt).getX() - transportes.get(transp).getEstaciones().get(contt - 1).getX(), 2) + Math.pow(transportes.get(transp).getEstaciones().get(contt).getY() - transportes.get(transp).getEstaciones().get(contt - 1).getY(), 2));;
                                    System.out.println(calc);
                                    contt++;
                                    int cuant = 0;
                                    if (transportes.get(transp) instanceof Buses) {
                                        cuant = ((Buses) (transportes.get(transp))).getLista().size() / transportes.get(transp).getEstaciones().size();
                                    } else if (transportes.get(transp) instanceof Rapiditos) {
                                        cuant = ((Rapiditos) (transportes.get(transp))).getLista().size() / transportes.get(transp).getEstaciones().size();
                                    } else if (transportes.get(transp) instanceof Taxis) {
                                        cuant = ((Taxis) (transportes.get(transp))).getLista().size() / transportes.get(transp).getEstaciones().size();
                                    } else if (transportes.get(transp) instanceof Mototaxis) {
                                        cuant = ((Mototaxis) (transportes.get(transp))).getLista().size() / transportes.get(transp).getEstaciones().size();
                                    }
                                    for (int i = 0; i < cuant; i++) {
                                        if (transportes.get(transp) instanceof Buses) {
                                            ((Buses) (transportes.get(transp))).getLista().remove(0);
                                        } else if (transportes.get(transp) instanceof Rapiditos) {
                                            ((Rapiditos) (transportes.get(transp))).getLista().remove(0);
                                        } else if (transportes.get(transp) instanceof Taxis) {
                                            ((Taxis) (transportes.get(transp))).getLista().remove(0);
                                        } else if (transportes.get(transp) instanceof Mototaxis) {
                                            ((Mototaxis) (transportes.get(transp))).getLista().remove(0);
                                        }
                                    }
                                    System.out.println("Se bajaron "+cuant+" alumnos");
                                }
                                transportes.get(transp).setTransportista(null);
                                System.out.println("Se ha bajado el transportista");
                                break;
                            default:
                                System.out.println("Opcion no valida, ingrese de nuevo");
                                break;

                        }
                    } while (sim != 0);

                    break;
                case 8:
                    if (clases.isEmpty()) {
                        System.out.println("No hay clases");
                    } else {
                        for (Clases f : clases) {
                            System.out.println(clases.indexOf(f) + "- " + f);
                        }
                    }
                    break;
                case 9:
                    if (estaciones.isEmpty()) {
                        System.out.println("No hay estaciones");
                    } else {
                        for (Estaciones v : estaciones) {
                            System.out.println(estaciones.indexOf(v) + "- " + v);
                        }
                    }
                    break;
                case 10:
                    if (alumnos.isEmpty()) {
                        System.out.println("No hay alumnos");
                    } else {
                        for (Persona h : personas) {
                            if (h instanceof Alumnos) {
                                System.out.println(h);
                            }
                        }
                    }
                    break;
                case 11:
                    if (transportistas.isEmpty()) {
                        System.out.println("No hay transportistas");
                    } else {
                        for (Persona g : personas) {
                            if (g instanceof Transportistas) {
                                System.out.println(g);
                            }
                        }
                    }
                    break;
                case 12:
                    if (transportes.isEmpty()) {
                        System.out.println("No hay transportes");
                    } else {
                        for (Transportes q : transportes) {
                            System.out.println(transportes.indexOf(q) + "- " + q);
                        }
                    }
                    break;
                default:
                    System.out.println("Opcion no valida, ingrese de nuevo");
                    break;
            }
        } while (opcion != 0);
        System.out.println("Se ha salido perfectamente");
    }
}
