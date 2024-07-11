import java.util.Scanner;

public class BusquedaCaracter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();
        System.out.print("Ingrese un caracter: ");
        char caracter = scanner.nextLine().charAt(0);
        scanner.close();

        int indice = palabra.indexOf(caracter);
        if (indice != -1) {
            System.out.println("El caracter '" + caracter + "' esta presente en la palabra.");
        } else {
            System.out.println("El caracter '" + caracter + "' NO esta presente en la palabra.");
        }
    }
}
