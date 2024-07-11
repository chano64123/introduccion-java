import java.util.Scanner;

public class LongitudSinEspacios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String texto = sc.nextLine();
        sc.close();

        int longitudSinEspacios = texto.replace(" ", "").length();
        System.out.println("Longitud de la cadena sin espacios: " + longitudSinEspacios);
    }
}
