import java.util.Scanner;

public class RestaConManejoDeExcepciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer numero: ");
            int numero1 = Integer.parseInt(sc.nextLine());
            System.out.print("Ingrese el segundo numero: ");
            int numero2 = Integer.parseInt(sc.nextLine());

            int resultado = numero1 - numero2;
            System.out.println("El resultado de la resta es: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Error: Por favor, ingrese numeros enteros validos.");
        } finally {
            sc.close();
        }
    }
}
