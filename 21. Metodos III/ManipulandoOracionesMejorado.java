import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ManipulandoOracionesMejorado {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        String oracion = "";

        while (opcion != 9) {
            ImprimirMenu();
            opcion = PedirNumeroEntero("Ingrese una opcion: ");
            System.out.println();
            switch (opcion) {
                case 1 -> oracion = ActualizarOracion(oracion);
                case 2 -> CantidadCaracteres(oracion);
                case 3 -> CantidadPalabras(oracion);
                case 4 -> OrdenarAlfabeticamente(oracion);
                case 5 -> PalabraDeIndice(oracion);
                case 6 -> BuscarPalabra(oracion);
                case 7 -> oracion = ModificarPalabraEnOracion(oracion);
                case 8 -> oracion = AgregarContenido(oracion);
                case 9 -> System.out.println("Seleccionaste \"Salir\"");
                default -> System.out.println("Ingresa una opcion valida.");
            }
        }
        sc.close();
    }

    public static int PedirNumeroEntero(String mensaje) {
        int numero = 0;
        System.out.print(mensaje);
        while (true) {
            try {
                numero = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.print("No ingreso un numero, intente nuevamente:");
            }
        }
        return numero;
    }

    public static String PedirTexto(String mensaje) {
        String texto = "";
        sc.nextLine();
        System.out.print(mensaje);
        while (true) {
            try {
                texto = sc.nextLine();
                if (!texto.trim().isEmpty()) {
                    break;
                } else {
                    System.out.print("No ingreso un texto valido, intente nuevamente: ");
                }
            } catch (Exception e) {
                System.out.print("Hubo un error, intente nuevamente: ");
            }
        }
        return texto;
    }

    public static void ImprimirMenu() {
        System.out.println();
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
    }

    public static boolean ValidarOracion(String oracion) {
        if (oracion.isEmpty()) {
            System.out.println("La oracion esta vacia.");
        }
        return !oracion.isEmpty();
    }

    public static String ActualizarOracion(String oracion) {
        if (oracion.isEmpty()) {
            oracion = PedirTexto("Ingrese una oracion: ");
            System.out.println();
            return oracion;
        } else {
            System.out.println("Oracion borrada correctamente");
            return "";
        }
    }

    public static void CantidadCaracteres(String oracion) {
        if (!ValidarOracion(oracion)) {
            return;
        }

        System.out.println("Oracion: " + oracion);
        System.out.println("Cantidad de caracteres en la oracion: " + oracion.length());
    }

    public static void CantidadPalabras(String oracion) {
        if (!ValidarOracion(oracion)) {
            return;
        }

        System.out.println("Oracion: " + oracion);
        System.out.println("Cantidad de palabras en la oracion: " + oracion.split(" ").length);
    }

    public static void OrdenarAlfabeticamente(String oracion) {
        if (!ValidarOracion(oracion)) {
            return;
        }

        System.out.println("Oracion: " + oracion);
        String[] palabras = oracion.split(" ");
        Arrays.sort(palabras);
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }

    public static void PalabraDeIndice(String oracion) {
        if (!ValidarOracion(oracion)) {
            return;
        }

        int index = PedirNumeroEntero("Ingrese una posicion: ");
        System.out.println("Oracion: " + oracion);
        String[] palabras = oracion.split(" ");
        if (index < 1 || index > palabras.length) {
            System.out.println("Numero invalido, intente nuevamente");
            return;
        }
        System.out.println("Palabra en la posicion " + index + ": " + palabras[index - 1]);
    }

    public static void BuscarPalabra(String oracion) {
        if (!ValidarOracion(oracion)) {
            return;
        }

        String palabraBuscada = PedirTexto("Palabra a buscar: ");
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
            System.out.println("La palabra \"" + palabraBuscada + "\" fue encontrada en la posicion: " + posicion);
        } else {
            System.out.println("La palabra \"" + palabraBuscada + "\" no fue encontrada en la oracion.");
        }
    }

    public static String ModificarPalabraEnOracion(String oracion) {
        if (!ValidarOracion(oracion)) {
            return oracion;
        }

        while (true) {
            String palabraCambiar = PedirTexto("Ingrese palabra a cambiar: ");
            if (oracion.contains(palabraCambiar)) {
                String palabraNueva = "";
                while (true) {
                    palabraNueva = PedirTexto("Ingrese palabra nueva: ");
                    if (palabraNueva.matches("[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ ]+")) {
                        break;
                    } else {
                        System.out.println("La nueva palabra o frase solo debe contener letras y espacios. Intentelo de nuevo.");
                    }
                }
                System.out.println("Oracion antigua: " + oracion);
                oracion = oracion.replace(palabraCambiar, palabraNueva);
                System.out.println("La nueva oracion es: " + oracion);
            } else {
                System.out.println("La palabra \"" + palabraCambiar + "\" no fue encontrada en la oracion. Intentelo de nuevo.");
            }
            return oracion;
        }
    }

    public static String AgregarContenido(String oracion) {
        if (!ValidarOracion(oracion)) {
            return oracion;
        }
        
        String contenidoExtra = PedirTexto("Ingrese contenido para agregar a la oracion: ");
        System.out.println("Oracion anterior: " + oracion);
        oracion += " " + contenidoExtra;
        System.out.println("Oracion nueva: " + oracion);
        return oracion;
    }
}