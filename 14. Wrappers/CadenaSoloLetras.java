import java.util.Scanner;

public class CadenaSoloLetras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean soloLetras = true;

        System.out.print("Ingrese un texto: ");
        String cadena = sc.nextLine();

        for (char letra : cadena.toCharArray()) {
            if (!Character.isLetter(letra)) {
                soloLetras = false;
                break;
            }
        }

        String mensaje = soloLetras ? "La cadena ingresada contiene solo letras." : "La cadena ingresada no contiene solo letras.";
        System.out.println(mensaje);

        sc.close();
    }
}
