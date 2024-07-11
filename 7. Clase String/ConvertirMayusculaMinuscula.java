import java.util.Scanner;

public class ConvertirMayusculaMinuscula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String texto = sc.nextLine();
        System.out.println("Opciones:");
        System.out.println("1. Convertir a mayusculas");
        System.out.println("2. Convertir a minusculas");
        System.out.print("Seleccione una opcion: ");
        int opcion = sc.nextInt();
        sc.close();

        String resultado = switch (opcion) {
            case 1 -> texto.toUpperCase();
            case 2 -> texto.toLowerCase();
            default -> {
                System.out.println("Opcion no valida.");
                yield "";
            }
        };

        if (!resultado.isEmpty()) {
            System.out.print("Texto convertido: " + resultado);
        }
    }
}
