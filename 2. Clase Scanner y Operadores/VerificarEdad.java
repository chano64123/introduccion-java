import java.util.Scanner;

public class VerificarEdad {
    public static void main(String[] args) {
        final int ANIO_ACTUAL = 2024;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su año de nacimiento: ");
        int anioNacimiento = sc.nextInt();
        sc.close();

        int calculoEdad = ANIO_ACTUAL - anioNacimiento;

        System.out.println("Su edad actual es: " + calculoEdad);

        if (calculoEdad >= 18) {
            System.out.println("Usted es mayor de edad.");
        } else {
            System.out.println("Usted es menor de edad.");
        }
    }
}
