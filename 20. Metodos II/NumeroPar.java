import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroPar {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numero = PedirNumero();
        String mensaje = EsPar(numero) ? "El numero " + numero + " es par" : "El numero " + numero + " no es par";
        System.out.println(mensaje);
        sc.close();
    }

    public static int PedirNumero() {
        int numero = 0;
        System.out.print("Ingrese un numero: ");
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

    public static boolean EsPar(int numero) {
        return numero % 2 == 0;
    }
}
