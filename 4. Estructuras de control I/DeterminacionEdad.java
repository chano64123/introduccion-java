import java.util.Scanner;

public class DeterminacionEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int numero = sc.nextInt();
        sc.close();
        String mensaje = "";
        if (numero >= 0 && numero <= 17) {
            mensaje = "Eres menor de edad";
        } else if (numero >= 18 && numero <= 64) {
            mensaje = "Eres adulto";
        } else if (numero >= 65) {
            mensaje = "Eres un adulto mayor";
        } else {
            mensaje = "Ingrese una edad valida.";
        }
        System.out.println(mensaje);
    }
}
