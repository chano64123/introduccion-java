import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int minimo = PedirNumero("Ingrese minimo: ");
        int maximo = PedirNumero("Ingrese maximo: ");
        int numeroRandom = GenerarNumeroAleatorio(minimo, maximo);
        int numeroAdivinado, intentos = 0;
        do {
            numeroAdivinado = PedirNumero("Adivna el numero aleatorio (" + minimo + "-" + maximo + "): ");
            intentos++;

            if (numeroAdivinado < numeroRandom) {
                System.out.println("El numero aleatorio es mayor.");
            } else if (numeroAdivinado > numeroRandom) {
                System.out.println("El numero aleatorio es menor.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el numero en " + intentos + " intentos.");
            }
        } while (numeroRandom != numeroAdivinado);
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

    public static int GenerarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
