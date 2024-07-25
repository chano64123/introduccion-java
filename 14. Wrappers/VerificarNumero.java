import java.util.Scanner;

public class VerificarNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero = 0;
        System.out.print("Ingrese un valor numerico: ");
        String cadena = sc.nextLine();
        try {
            numero = Double.valueOf(cadena);
            System.out.println("El valor ingresado es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("El valor ingresado no es un numero valido.");
        }

        sc.close();
    }
}