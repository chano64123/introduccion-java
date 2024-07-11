import java.util.Scanner;

public class ConcatenacionCadenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = sc.nextLine();
        sc.close();

        String nombreCompleto = nombre.concat(" ").concat(apellido);

        System.out.println("El nombre completo es: " + nombreCompleto);
    }
}
