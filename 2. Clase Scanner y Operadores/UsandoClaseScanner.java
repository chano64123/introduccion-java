import java.util.Scanner;

public class UsandoClaseScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        sc.close();
        System.out.println("Su nombre es " + nombre + " y su edad es " + edad + ".");
    }
}
