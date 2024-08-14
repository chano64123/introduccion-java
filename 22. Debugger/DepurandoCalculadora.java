import java.util.InputMismatchException;
import java.util.Scanner;

public class DepurandoCalculadora {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 0;
        int opcion = 0;
        while (opcion != 5) {
            ImprimirMenu();
            opcion = PedirNumero("Ingrese una opcion: ");
            System.out.println();
            numero1 = PedirNumero("Ingrese numero 1: ");
            numero2 = PedirNumero("Ingrese numero 2: ");

            String mensaje = switch (opcion) {
                case 1 -> "La suma es: " + Sumar(numero1, numero2);
                case 2 -> "La resta es: " + Restar(numero1, numero2);
                case 3 -> "La multiplicacion es: " + Multiplicar(numero1, numero2);
                case 4 -> "La division es: " + Dividir(numero1, numero2);
                case 5 -> "Seleccionaste \"Salir\"";
                default -> "Ingresa una opcion valida.";
            };
            System.out.println(mensaje);
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

    public static void ImprimirMenu() {
        System.out.println();
        System.out.println("MENU DE OPCIONES");
        System.out.println("================");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Salir");
    }

    public static double Sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static double Restar(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public static double Dividir(int numero1, int numero2) {
        try {
            return numero1 / numero2;
        } catch (Exception e) {
            return 0;
        }
    }

    public static double Multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }
}