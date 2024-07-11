import java.util.Scanner;

public class EncontrandoMaximo {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        sc.close();
        int numeroMaximo = Integer.MIN_VALUE;
        for (int numero : numeros) {
            if (numero > numeroMaximo) {
                numeroMaximo = numero;
            }
        }
        System.out.println("El numero maximo es: " + numeroMaximo);
    }
}
