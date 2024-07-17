import java.util.Arrays;
import java.util.Scanner;

public class CopiandoParteArreglo {
    public static void main(String[] args) {
        int[] numeros = { 12, 30, 0, 4, 9, -12, 123, 10, 63 };
        System.out.println("Arreglo: " + Arrays.toString(numeros));
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + i + ": " + numeros[i]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("\nIngrese indice inicial: ");
        int indiceInicial = sc.nextInt();
        System.out.print("Ingrese indice final: ");
        int indiceFinal = sc.nextInt();
        sc.close();

        if (indiceInicial < 0 || indiceFinal >= numeros.length || indiceInicial > indiceFinal) {
            System.out.println("Indices no validos.");
            return;
        }

        int[] numerosCopia = Arrays.copyOfRange(numeros, indiceInicial, indiceFinal+1);
        System.out.println("Arreglo copia: " + Arrays.toString(numerosCopia));
    }
}
