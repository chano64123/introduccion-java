import java.util.Scanner;

public class VerificarClave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        String claveUsuario = sc.nextLine();
        sc.close();
        String claveSistema = "chano64123";
        String mensaje = claveUsuario.equals(claveSistema) ? "Acceso concedido" : "Acceso denegado";
        System.out.println(mensaje);
    }
}
