import java.util.Scanner;

public class PromedioElementos {
    public static void main(String[] args) {
        int[] numeros = new int[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        sc.close();
        int sumatoria = 0;
        for (int numero : numeros) {
            sumatoria += numero;
        }
        double promedio = sumatoria / (double) numeros.length;

        System.out.println("La sumatoria es: " + sumatoria);
        System.out.println("El promedio es: " + promedio);
    }
}
