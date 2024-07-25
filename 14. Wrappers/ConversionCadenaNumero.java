import java.util.Scanner;

public class ConversionCadenaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        System.out.print("Ingrese un valor numerico: ");
        String cadena = sc.nextLine();
        try {
            numero = Integer.parseInt(cadena);
            System.out.println("El valor ingresado es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("El valor ingresado no es un numero entero valido.");
        }

        sc.close();
    }
}
