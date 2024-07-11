import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero entero: ");
        int numero1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero entero: ");
        int numero2 = sc.nextInt();

        try {
            int resultado = numero1 / numero2;
            System.out.println("El resultado de la division es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero. Por favor, ingrese un divisor diferente de cero.");
        } finally {
            sc.close();
        }
    }
}