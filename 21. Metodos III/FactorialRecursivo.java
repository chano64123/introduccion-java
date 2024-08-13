import java.util.InputMismatchException;
import java.util.Scanner;

public class FactorialRecursivo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numero = PedirNumeroEntero("Ingrese un numero: ");
        if (numero < 0) {
            System.out.println("El numero debe ser un entero positivo.");
            return;
        }
        int factorial = CalcularFactorial(numero);
        System.out.println(numero + "! = " + factorial);
        sc.close();
    }

    public static int CalcularFactorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * CalcularFactorial(numero - 1);
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
