import java.util.Scanner;

public class VerificacionDiaHabil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero del 1 al 7 (representando un dia de la semana): ");
        int dia = sc.nextInt();
        sc.close();

        
        String mensaje = switch (dia) {
            case 1, 2, 3, 4, 5 -> "Es un dia habil (Lunes a Viernes).";
            case 6, 7 -> "Es un dia no habil (Sabado o Domingo).";
            default -> "Numero de dia invalido.";
        };

        System.out.println(mensaje);
    }
}
