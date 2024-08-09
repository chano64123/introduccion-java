import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayAleatorio {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int cantidad = PedirNumero("Ingrese el tamaño del array: ");
        int minimo = 0;
        int maximo = 0;
        boolean correcto = false;
        do {
            minimo = PedirNumero("Ingrese valor minimo: ");
            maximo = PedirNumero("Ingrese valor maximo: ");
            correcto = maximo >= minimo;
            if (!correcto) {
                System.out.println("El valor minimo no puede ser mayor que el valor maximo.");
            }
        } while (!correcto);

        int[] arrayAleatorio = GenerarArrayAleatorio(cantidad, minimo, maximo);

        System.out.println("Array generado: " + Arrays.toString(arrayAleatorio));

        sc.close();
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

    public static int[] GenerarArrayAleatorio(int cantidad, int minimo, int maximo) {
        int[] array = new int[cantidad];
        for (int i = 0; i < array.length; i++) {
            array[i] = GenerarNumeroAleatorio(minimo, maximo);
        }
        return array;
    }

    public static int GenerarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
