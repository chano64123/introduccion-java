import java.util.Scanner;

public class GraficoBarras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[4];
        char caracter = '*';

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println();
        for (int numero : numeros) {
            System.out.print(numero);
            for (int i = 0; i < numero; i++) {
                System.out.print(caracter);
                
            }
            System.out.println();
        }

        sc.close();
    }
}
