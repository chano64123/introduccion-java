import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero del 1 al 7: ");
        int opcion = sc.nextInt();
        sc.close();
        String mensaje = "";
        switch (opcion) {
            case 1 -> mensaje = "Lunes";
            case 2 -> mensaje = "Martes";
            case 3 -> mensaje = "Miercoles";
            case 4 -> mensaje = "Jueves";
            case 5 -> mensaje = "Viernes";
            case 6 -> mensaje = "Sabado";
            case 7 -> mensaje = "Domingo";
            default -> mensaje = "Opcion invalida";    
        }
        System.out.println(mensaje);
    }    
}