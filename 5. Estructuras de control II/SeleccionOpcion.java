import java.util.Scanner;

public class SeleccionOpcion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu de opciones:");
        System.out.println("1. Guardar");
        System.out.println("2. Cargar");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opcion: ");
        int numero = sc.nextInt();
        sc.close();
        String mensaje = "";
        switch (numero) {
            case 1 -> mensaje = "Ha seleccionado la opcion: Guardar";
            case 2 -> mensaje = "Ha seleccionado la opcion: Cargar";
            case 3 -> mensaje = "Ha seleccionado la opcion: Salir";
            default -> mensaje = "Opcion no valida. Por favor ingrese un numero del 1 al 3.";
        }
        System.out.println(mensaje);
    }
}
