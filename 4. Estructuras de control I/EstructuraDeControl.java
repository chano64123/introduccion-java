import java.util.Scanner;

public class EstructuraDeControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero de 0 a 100: ");
        int numero = sc.nextInt();
        sc.close();
        String mensaje = "";
        if (numero >= 0 && numero <= 59) {
            mensaje = "Su calificacion es F";
        } else if (numero >= 60 && numero <= 69) {
            mensaje = "Su calificacion es D";
        } else if (numero >= 70 && numero <= 79) {
            mensaje = "Su calificacion es C";
        } else if (numero >= 80 && numero <= 89) {
            mensaje = "Su calificacion es B";
        } else if (numero >= 90 && numero <= 100) {
            mensaje = "Su calificacion es A";
        } else {
            mensaje = "El numero ingresado esta fuera del rango valido.";
        }
        System.out.println(mensaje);
    }
}
