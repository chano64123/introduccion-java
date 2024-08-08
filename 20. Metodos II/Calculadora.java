import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numero1 = PedirNumero("Ingrese numero 1: ");
        int numero2 = PedirNumero("Ingrese numero 2: ");
        int opcion = 0;
        while (opcion != 5) {
            ImprimirMenu();
            opcion = PedirNumero("Ingrese una opcion: ");

            String mensaje = switch (opcion) {
                case 1 -> "La suma es: " + Sumar(numero1, numero2);
                case 2 -> "La resta es: " + Restar(numero1, numero2);
                case 3 -> "La multiplicacion es: " + Multiplicar(numero1, numero2);
                case 4 -> {
                    try {
                        yield "La division es: " + Dividir(numero1, numero2);
                    } catch (IllegalArgumentException e) {
                        yield e.getMessage();
                    }
                }
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

    public static double Sumar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static double Restar(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public static double Dividir(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new IllegalArgumentException("El segundo numero no puede ser igual a cero.");
        }
        return numero1 / numero2;
    }

    public static double Multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }
}
