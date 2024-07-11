import java.util.Scanner;

public class OperacionesBasicas {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 5;

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        int modulo = numero1 % numero2;

        System.out.println("La suma de las 2 variables es: " + suma);
        System.out.println("La resta de las 2 variables es: " + resta);
        System.out.println("La multiplicacion de las 2 variables es: " + multiplicacion);
        System.out.println("La division de las 2 variables es: " + division);
        System.out.println("El modulo de las 2 variables es: " + modulo);

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        numero1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        numero2 = sc.nextInt();
        sc.close();
        
        suma = numero1 + numero2;

        System.out.println("La suma de los numeros ingresados es: " + suma);
    }
}
