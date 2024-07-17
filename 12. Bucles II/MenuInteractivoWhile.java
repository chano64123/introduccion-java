import java.util.Scanner;

public class MenuInteractivoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("MENU DE OPCIONES");
            System.out.println("================");
            System.out.println("1. Comprar producto");
            System.out.println("2. Realizar devolucion");
            System.out.println("3. Ver mis pedidos");
            System.out.println("4. Preguntas frecuentes");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();
            System.out.println();
            switch (opcion) {
                case 1 -> System.out.println("Seleccionaste \"Comprar producto\"");
                case 2 -> System.out.println("Seleccionaste \"Realizar devolucion\"");
                case 3 -> System.out.println("Seleccionaste \"Ver mis pedidos\"");
                case 4 -> System.out.println("Seleccionaste \"Preguntas frecuentes\"");
                case 5 -> System.out.println("Seleccionaste \"Salir\"");
                default -> System.out.println("Ingresa  una opcion valida.");
            }
            System.out.println();
        }
        sc.close();
    }
}