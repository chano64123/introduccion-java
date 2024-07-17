import java.util.Arrays;
import java.util.Scanner;

public class RellenandoArreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el tamaño del arreglo: ");
        int tamano = sc.nextInt();
        System.out.print("Ingresa el número para rellenar el arreglo: ");
        int numero = sc.nextInt();
        sc.close();

        int[] arreglo = new int[tamano];
        Arrays.fill(arreglo, numero);

        System.out.println("Arreglo rellenado: " + Arrays.toString(arreglo));
    }
}
