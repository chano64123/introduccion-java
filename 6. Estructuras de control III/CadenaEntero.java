import java.util.Scanner;

public class CadenaEntero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un numero entero: ");
            String input = sc.nextLine();
            int numero = Integer.parseInt(input);

            System.out.println("Numero entero ingresado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: La cadena ingresada no puede ser convertida en un numero entero.");
        } finally {
            sc.close();
        }
    }
}
