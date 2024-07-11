import java.util.Scanner;

public class ConversionCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero del 1 al 5: ");
        int numero = sc.nextInt();
        sc.close();
        String mensaje = "";
        switch (numero) {
            case 1 -> mensaje = "Muy deficiente";
            case 2 -> mensaje = "Deficiente";
            case 3 -> mensaje = "Suficiente";
            case 4 -> mensaje = "Notable";
            case 5 -> mensaje = "Sobresaliente";
            default -> mensaje = "Opcion invalida";    
        }
        System.out.println(mensaje);
    }
}
