import java.util.Scanner;

public class ComparacionCadenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la primera palabra: ");
        String palabra1 = sc.nextLine();
        System.out.print("Ingrese la segunda palabra: ");
        String palabra2 = sc.nextLine();
        sc.close();

        String mensaje = palabra1.equals(palabra2) ? "Las palabras ingresadas son iguales." : "Las palabras ingresadas son diferentes.";
        System.out.println(mensaje);
    }
}
