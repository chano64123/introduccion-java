import java.util.Scanner;

public class ContandoEspaciosEnBlanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        String cadena = sc.nextLine();

        int cantidadEspaciosEnBlanco = 0;

        for (char letra : cadena.toCharArray()) {
            if (Character.isWhitespace(letra)) {
                cantidadEspaciosEnBlanco++;
            }
        }

        String mensaje = "El texto ingresado tiene " + cantidadEspaciosEnBlanco + " espacio(s) en blanco.";
        System.out.println(mensaje);

        sc.close();
    }
}
