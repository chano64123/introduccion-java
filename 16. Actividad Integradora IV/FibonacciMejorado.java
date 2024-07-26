import java.util.Scanner;

public class FibonacciMejorado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la posicion que desea: ");
        int posicion = sc.nextInt();
        sc.close();

        if (posicion < 0) {
            System.out.println("La posicion debe ser un numero entero positivo.");
            return;
        }

        int i = 0;
        int numero1 = 0;
        int numero2 = 1;
        int auxiliar = 0;
        int fibonacci = numero1;
        while (i <= posicion) {
            fibonacci = numero1;
            auxiliar = numero1 + numero2;
            numero1 = numero2;
            numero2 = auxiliar;
            i++;
        }
        System.out.println("El valor en la posicion " + posicion + " de la serie de Fibonacci es: " + fibonacci);
    }
}