import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArregloPersonalizado {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int cantidad = PedirNumero("Ingrese la cantidad de elementos: ");
        int[] numeros = new int[cantidad];

        int posicionesRestantes = cantidad;
        int indiceActual = 0;
        int posicionAnterior = 0;

        while (posicionesRestantes > 0) {
            int numero = PedirNumero("\nIngrese numero con el que quiere rellenar el array: ");
            int posicionHasta = PedirNumero("Ingrese hasta que posicion quiere completar con el numero anterior: ");

            if (!EsPosicionValida(posicionHasta, cantidad, posicionAnterior)) {
                continue;
            }

            for (int i = indiceActual; i <= posicionHasta; i++) {
                numeros[i] = numero;
            }

            posicionesRestantes -= (posicionHasta - indiceActual + 1);
            indiceActual = posicionHasta + 1;
            posicionAnterior = posicionHasta;

            ImprimirArray(numeros);
        }
    }

    public static int PedirNumero(String mensaje) {
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

    private static boolean EsPosicionValida(int posicionHasta, int cantidad, int posicionAnterior) {
        if (posicionHasta >= cantidad) {
            System.out.println("Posición fuera del rango del array.");
            return false;
        }
        if (posicionHasta <= posicionAnterior) {
            System.out.println("Ingrese una posición mayor, ya está ocupado hasta la posición " + posicionAnterior);
            return false;
        }
        return true;
    }

    public static void ImprimirArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
