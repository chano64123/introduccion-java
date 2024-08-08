import java.util.Arrays;
import java.util.Scanner;

public class ManipulandoOraciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ORACION_VACIA = "La oracion esta vacia.";
        String oracion = "";
        int opcion = 0;
        while (opcion != 9) {
            System.out.println("MENU DE OPCIONES");
            System.out.println("================");
            System.out.println("1. Crear o borrar oracion");
            System.out.println("2. Cantidad de caracteres");
            System.out.println("3. Cantidad de palabras");
            System.out.println("4. Palabras ordenadas alfabeticamente");
            System.out.println("5. Palabra por posicion");
            System.out.println("6. Buscar palabra");
            System.out.println("7. Modificar palabra");
            System.out.println("8. Agregar contenido");
            System.out.println("9. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();
            System.out.println();
            switch (opcion) {
                case 1 -> {
                    if (oracion.isEmpty()) {
                        System.out.print("Ingrese una oracion: ");
                        sc.nextLine();
                        oracion = sc.nextLine();
                        System.out.println();
                    } else {
                        oracion = "";
                        System.out.println("Oracion borrada correctamente");
                    }
                }
                case 2 -> {
                    if (oracion.isEmpty()) {
                        System.out.println(ORACION_VACIA);
                        break;
                    }
                    System.out.println("Oracion: " + oracion);
                    System.out.println("Cantidad de caracteres en la oracion: " + oracion.length());
                }
                case 3 -> {
                    if (oracion.isEmpty()) {
                        System.out.println(ORACION_VACIA);
                        break;
                    }
                    System.out.println("Oracion: " + oracion);
                    System.out.println("Cantidad de palabras en la oracion: " + oracion.split(" ").length);
                }
                case 4 -> {
                    if (oracion.isEmpty()) {
                        System.out.println(ORACION_VACIA);
                        break;
                    }
                    System.out.println("Oracion: " + oracion);
                    String[] palabras = oracion.split(" ");
                    Arrays.sort(palabras);
                    for (String palabra : palabras) {
                        System.out.println(palabra);
                    }
                }
                case 5 -> {
                    if (oracion.isEmpty()) {
                        System.out.println(ORACION_VACIA);
                        break;
                    }
                    System.out.print("Ingrese una posicion: ");
                    int index = sc.nextInt();
                    System.out.println("Oracion: " + oracion);
                    String[] palabras = oracion.split(" ");
                    if (index < 1 || index > palabras.length) {
                        System.out.println("Numero invalido, intente nuevamente");
                        break;
                    }
                    System.out.println("Palabra en la posicion " + index + ": " + palabras[index - 1]);
                }
                case 6 -> {
                    if (oracion.isEmpty()) {
                        System.out.println(ORACION_VACIA);
                        break;
                    }
                    System.out.print("Palabra a buscar: ");
                    sc.nextLine();
                    String palabraBuscada = sc.nextLine();
                    String[] palabras = oracion.split(" ");
                    System.out.println("Oracion: " + oracion);
                    boolean existe = false;
                    int posicion = 0;
                    for (int i = 0; i < palabras.length; i++) {
                        if (palabras[i].equals(palabraBuscada)) {
                            existe = true;
                            posicion = i + 1;
                            break;
                        }
                    }

                    if (existe) {
                        System.out.println(
                                "La palabra \"" + palabraBuscada + "\" fue encontrada en la posicion: " + posicion);
                    } else {
                        System.out.println("La palabra \"" + palabraBuscada + "\" no fue encontrada en la oracion.");
                    }
                }
                case 7 -> {
                    if (oracion.isEmpty()) {
                        System.out.println(ORACION_VACIA);
                        break;
                    }
                    while (true) {
                        System.out.print("Ingrese palabra a cambiar: ");
                        sc.nextLine();
                        String palabraCambiar = sc.nextLine();
                        if (oracion.contains(palabraCambiar)) {
                            String palabraNueva = "";
                            while (true) {
                                System.out.print("Ingrese palabra nueva: ");
                                palabraNueva = sc.nextLine();
                                if (palabraNueva.matches("[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ ]+")) {
                                    break;
                                } else {
                                    System.out.println("La nueva palabra o frase solo debe contener letras y espacios. Inténtelo de nuevo.");
                                }
                            }
                            System.out.println("Oracion antigua: " + oracion);
                            oracion = oracion.replace(palabraCambiar, palabraNueva);
                            System.out.println("La nueva oración es: " + oracion);
                            break;
                        } else {
                            System.out.println("La palabra \"" + palabraCambiar + "\" no fue encontrada en la oracion. Inténtelo de nuevo.");
                        }
                    }
                }
                case 8 -> {
                    if (oracion.isEmpty()) {
                        System.out.println(ORACION_VACIA);
                        break;
                    }
                    System.out.print("Ingrese contenido para agregar a la oracion: ");
                    sc.nextLine();
                    String contenidoExtra = sc.nextLine();
                    System.out.println("Oracion anterior: " + oracion);
                    oracion += " " + contenidoExtra;
                    System.out.println("Oracion nueva: " + oracion);
                }
                case 9 -> System.out.println("Seleccionaste \"Salir\"");

                default -> System.out.println("Ingresa una opcion valida.");
            }
            System.out.println();
        }
        sc.close();
    }
}
