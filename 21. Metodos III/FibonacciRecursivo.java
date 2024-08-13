import java.util.InputMismatchException;
import java.util.Scanner;

public class FibonacciRecursivo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int posicion = PedirNumeroEntero("Ingrese la posicion que desea: ");
        
        if (posicion < 0) {
            System.out.println("La posicion debe ser un numero entero positivo.");
            return;
        }
        
        int fibonacci = CalcularFibonacci(posicion);
        System.out.println("El valor en la posicion " + posicion + " de la serie de Fibonacci es: " + fibonacci);
        sc.close();
    }

    public static int CalcularFibonacci(int posicion) {
        if (posicion == 0) {
            return 0;
        } else if (posicion == 1) {
            return 1;
        } else {
            return CalcularFibonacci(posicion - 1) + CalcularFibonacci(posicion - 2);
        }
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