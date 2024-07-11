import java.util.Scanner;

public class LongitudCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String texto = sc.nextLine();
        sc.close();

        int longitud = texto.length();

        System.out.println("La longitud de la cadena ingresada es: " + longitud);
    }
}