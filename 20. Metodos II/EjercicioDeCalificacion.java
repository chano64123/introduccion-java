import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioDeCalificacion {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int puntuacion = PedirNumero("Ingrese un numero de 0 a 100: ");
        String mensaje = ObtenerNota(puntuacion);
        System.out.println(mensaje);
        sc.close();
    }

        public static int PedirNumero(String mensaje) {
        int numero = 0;
        System.out.print(mensaje);
        while (true) {
            try {
                while (true) {
                    numero = sc.nextInt();
                    if (numero>=0 &&numero<=100) {
                        break;
                    } else {
                        sc.nextLine();
                        System.out.print("No ingreso un numero valido, intente nuevamente:");
                    }
                }
                break;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.print("No ingreso un numero, intente nuevamente:");
            }
        }
        return numero;
    }

    public static String ObtenerNota(int puntuacion) {
        return switch (puntuacion / 10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            case 5, 4, 3, 2, 1, 0 -> "F";
            default -> "Puntuacion invalida";
        };
    }
}
