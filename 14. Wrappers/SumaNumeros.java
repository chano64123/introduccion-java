import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un valor numerico entero: ");
        String cadenaEntero = sc.nextLine();
        System.out.print("Ingrese un valor numerico decimal: ");
        String cadenaDecimal = sc.nextLine();

        try {
            int numeroEntero = Integer.parseInt(cadenaEntero);
            double numeroDecimal = Double.parseDouble(cadenaDecimal);

            double suma = Integer.valueOf(numeroEntero) + Double.valueOf(numeroDecimal);
            System.out.println("El resultado de " + numeroEntero + " + " + numeroDecimal + " es: " + suma);
        } catch (NumberFormatException e) {
            System.out.println("El valor ingresado para algun numero no es valido.");
        }

        sc.close();
    }
}
