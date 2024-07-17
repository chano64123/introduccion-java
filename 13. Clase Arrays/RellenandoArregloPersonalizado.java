import java.util.Arrays;
import java.util.Scanner;

public class RellenandoArregloPersonalizado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el tamaño del arreglo: ");
        int tamano = sc.nextInt();

        if (tamano <= 0) {
            System.out.println("El tamaño del arreglo debe ser mayor que 0.");
            sc.close();
            return;
        }

        int[] arreglo = new int[tamano];
        int ultimoIndice = 0;

        while (true) {
            System.out.print("Ingresa el número para rellenar el arreglo: ");
            int numero = sc.nextInt();
            System.out.print("Ingresa el índice hasta el cual desea rellenar el arreglo: ");
            int indice = sc.nextInt();

            if (indice >= tamano || indice < ultimoIndice) {
                System.out.println("Índice no válido.");
            } else {
                Arrays.fill(arreglo, ultimoIndice, indice + 1, numero);
                ultimoIndice = indice;

                if (ultimoIndice == tamano - 1) {
                    break;
                }
            }
        }

        System.out.println("Arreglo final: " + Arrays.toString(arreglo));

        sc.close();
    }
}
