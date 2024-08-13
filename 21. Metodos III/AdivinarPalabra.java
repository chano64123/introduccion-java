import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdivinarPalabra {
    static Scanner sc = new Scanner(System.in);
    static String[] palabras = { "tomate", "elefante", "celular", "hola", "mundo", "mundo", "esternocleidomastoideo", "muercielago" };

    public static void main(String[] args) {
        int vidas = 5;
        String letra = "";
        String palabra = ElegirPalabraAleatoria();
        List<String> intentosCorrectos = new ArrayList<String>();
        List<String> intentosIncorrectos = new ArrayList<String>();

        do {
            MostrarEstadoJuego(vidas, palabra, intentosCorrectos);
            if (VerificarVictoria(palabra, intentosCorrectos)) {
                MostrarMensajeVictoria();
                return;
            }

            letra = PedirLetra("Ingrese una letra: ");

            if (EsLetraRepetida(letra, intentosCorrectos, intentosIncorrectos)) {
                System.out.println("Ya realizaste un intento con la letra '" + letra + "', intenta con otra letra.");
                continue;
            }

            if (palabra.contains(letra)) {
                intentosCorrectos.add(letra);
            } else {
                intentosIncorrectos.add(letra);
                vidas--;
            }
        } while (vidas > 0);
        FinalizarJuego(palabra);
    }

    public static String PedirLetra(String mensaje) {
        String letra;
        System.out.print(mensaje);
        while (true) {
            letra = sc.nextLine().trim();
            if (letra.length() == 1 && Character.isLetter(letra.charAt(0))) {
                return letra;
            } else {
                System.out.print("No ingresaste una letra valida, intenta nuevamente: ");
            }
        }
    }

    public static String ElegirPalabraAleatoria() {
        int indice = (int) (Math.random() * palabras.length);
        return palabras[indice];
    }

    public static void MostrarEstadoJuego(int vidas, String palabra, List<String> intentosCorrectos) {
        System.out.println("\nVidas: " + vidas);
        ImprimirPista(palabra, intentosCorrectos);
    }

    public static boolean EsLetraRepetida(String letra, List<String> intentosCorrectos, List<String> intentosIncorrectos) {
        return intentosCorrectos.contains(letra) || intentosIncorrectos.contains(letra);
    }

    public static boolean VerificarVictoria(String palabra, List<String> intentosCorrectos) {
        for (char letra : palabra.toCharArray()) {
            if (!intentosCorrectos.contains(String.valueOf(letra))) {
                return false;
            }
        }
        return true;
    }

    public static void ImprimirPista(String palabra, List<String> intentosCorrectos) {
        System.out.print("Palabra: ");
        for (char letra : palabra.toCharArray()) {
            String caracter = intentosCorrectos.contains(String.valueOf(letra)) ? String.valueOf(letra) : "_";
            System.out.print(caracter + " ");
        }
        System.out.println();
    }

    public static void MostrarMensajeVictoria() {
        System.out.println("¡Felicidades! Has adivinado la palabra.");
        sc.close();
    }

    public static void FinalizarJuego(String palabra) {
        System.out.println("\nLo siento, has perdido todas tus vidas.");
        System.out.println("La palabra correcta era: " + palabra);
        sc.close();
    }
}
