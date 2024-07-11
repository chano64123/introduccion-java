import java.util.Scanner;

public class CopiandoElementos {
    public static void main(String[] args) {
        int[] arrayInicial = { 2, 5, 9 };
        int[] nuevoArray = new int[arrayInicial.length + 2];
        for (int i = 0; i < arrayInicial.length; i++) {
            nuevoArray[i] = arrayInicial[i];
        }
        Scanner sc = new Scanner(System.in);
        for (int i = 3; i < nuevoArray.length; i++) {
            System.out.print("Ingrese numero " + (i + 1) + ": ");
            nuevoArray[i] = sc.nextInt();
        }
        sc.close();
        System.out.print("El nuevo array es: ");
        for (int numero : nuevoArray) {
            System.out.print(numero + " ");
        }
    }
}
