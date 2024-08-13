import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroPrimoRecursivo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numero;
        do {
            numero = PedirNumeroEntero("Ingresa un numero (0 para salir): ");

            if (numero == 0) {
                break;
            }

            if (EsPrimo(numero, 2)) {
                System.out.println("El numero " + numero + " es primo.");
            } else {
                System.out.println("El numero " + numero + " no es primo. Intente nuevamente.");
            }
            System.out.println();
        } while (numero != 0);
        sc.close();
    }

    public static boolean EsPrimo(int numero, int divisor) {
        if (numero < 2) {
            return false;
        }
        if (divisor > Math.sqrt(numero)) {
            return true;
        }
        if (numero % divisor == 0) {
            return false;
        }
        return EsPrimo(numero, divisor + 1);
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
}
