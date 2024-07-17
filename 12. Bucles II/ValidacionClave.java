import java.util.Scanner;

public class ValidacionClave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String CLAVE_CORRECTA = "secreto";
        boolean claveCorrecta = false;
        String clave = "", mensaje = "";

        while (!claveCorrecta) {
            System.out.print("Ingrese la clave: ");
            clave = sc.nextLine();
            claveCorrecta = CLAVE_CORRECTA.equals(clave);
            mensaje = claveCorrecta ? "Felicidades!!! Ingresaste la clave correcta." : "Clave Incorrecta!!! Intentalo de nuevo.";
            System.out.println(mensaje);
        }
        sc.close();
    }
}