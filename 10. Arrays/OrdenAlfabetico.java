import java.util.Arrays;
import java.util.Scanner;

public class OrdenAlfabetico {
    public static void main(String[] args) {
        String[] nombres = new String[4];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
        }
        sc.close();

        Arrays.sort(nombres);
        System.out.println("Nombres ordenados alfabeticamente:");
        for (String nombre : nombres) {
            System.out.println("- " + nombre);
        }
    }
}
