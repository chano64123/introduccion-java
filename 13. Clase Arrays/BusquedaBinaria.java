import java.util.Arrays;
import java.util.Scanner;

public class BusquedaBinaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = { 12, 30, 0, 4, 9, -12, 123, 10, 63 };
        Arrays.sort(numeros);

        System.out.println(Arrays.toString(numeros));

        System.out.print("Ingresa el valor a buscar: ");
        int numero = sc.nextInt();

        int index = Arrays.binarySearch(numeros, numero);
        
        String mensaje = index < 0 ? "No se enontro el numero " + numero : "El numero " + numero + " se encuentra en la posicion: " + index;
        System.out.println(mensaje);
        sc.close();
    }
}
