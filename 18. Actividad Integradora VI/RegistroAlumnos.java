import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class RegistroAlumnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        List<String> nombres = new ArrayList<String>(Arrays.asList("Juan", "Pedro", "Alberto"));
        List<Double> notas = new ArrayList<Double>(Arrays.asList(9.6, 3.4, 7.6));

        int opcion = 0;
        while (opcion != 7) {
            System.out.println("MENU DE OPCIONES");
            System.out.println("================");
            System.out.println("1. Registrar Alumno");
            System.out.println("2. Listar Alumnos");
            System.out.println("3. Promedio de notas");
            System.out.println("4. Buscar Alumno por nombre");
            System.out.println("5. Modificar nota por nombre");
            System.out.println("6. Eliminar alumno por nombre");
            System.out.println("7. Salir");
            System.out.print("Ingrese una opcion: ");
            try {
                opcion = sc.nextInt();
                System.out.println();
            } catch (InputMismatchException e) {
                System.out.println("\nIngrese una opción valida.\n");
                sc.next();
                continue;
            }
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.nextLine();
                    double nota = 0.0;
                    while (true) {
                        System.out.print("Ingrese nota: ");
                        try {
                            nota = sc.nextDouble();
                            if (nota >= 0 && nota <= 10) {
                                break;
                            } else {
                                System.out.println("Ingrese una nota valida, mayor o igual a cero y menor o igual a 10.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Ingrese un valor valido para la nota");
                            sc.next();
                        }
                    }

                    sc.nextLine();

                    nombres.add(nombre);
                    notas.add(nota);

                    System.out.println("Alumno registrado correctamente");
                }
                case 2 -> {
                    for (int i = 0; i < nombres.size(); i++) {
                        System.out.println((i + 1) + ". " + nombres.get(i) + " - " + df.format(notas.get(i)));
                    }
                }
                case 3 -> {
                    Double acumulado = 0.0;
                    for (Double nota : notas) {
                        acumulado += nota;
                    }
                    double promedio = acumulado / notas.size();
                    System.out.println("El promedio de notas es: " + df.format(promedio));
                }
                case 4,5,6 -> {
                    System.out.print("Ingrese nombre de alumno: ");
                    String nombreBusqueda = sc.nextLine().toLowerCase();

                    boolean existe = false;
                    int i = 0;
                    for (String nombre : nombres) {
                        if (nombre.toLowerCase().equals(nombreBusqueda)) {
                            existe = true;
                            break;
                        }
                        i++;
                    }

                    if (existe) {
                        switch (opcion) {
                            case 4 -> {
                                System.out.println(nombres.get(i) + " - " + df.format(notas.get(i)));
                            }
                            case 5 -> {
                                double nota = 0.0;
                                while (true) {
                                    System.out.print("Ingrese nueva nota: ");
                                    try {
                                        nota = sc.nextDouble();
                                        if (nota >= 0 && nota <= 10) {
                                            break;
                                        } else {
                                            System.out.println("Ingrese una nota valida, mayor o igual a cero y menor o igual a 10.");
                                        }
                                    } catch (InputMismatchException e) {
                                        System.out.println("Ingrese un valor valido para la nota");
                                        sc.next();
                                    }
                                }
                                sc.nextLine();
                                notas.set(i, nota);
                                System.out.println(nombres.get(i) + " - " + notas.get(i));
                                System.out.println("Nota actualizada correctamente");
                            }
                            case 6 -> {
                                nombres.remove(i);
                                notas.remove(i);
                                System.out.println("Alumno eliminado correctamente");
                            }
                        }
                    } else {
                        System.out.println("No hay ni un alumno registrado con el nombre " + nombreBusqueda);
                    }
                }
                case 7 -> System.out.println("Seleccionaste \"Salir\"");
                default -> System.out.println("Ingresa una opcion valida.");
            }
            System.out.println();
        }
        sc.close();
    }
}
