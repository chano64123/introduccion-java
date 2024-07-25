import java.util.Scanner;

public class ContandoDigitosNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un valor numerico entero: ");
            double numero = sc.nextDouble();

            int cantidadDigitos = 0;
            for (char letra : String.valueOf(numero).toCharArray()) {
                if (Character.isDigit(letra)) {
                    cantidadDigitos++;
                }
            }
    
            String mensaje = "El numero ingresado tiene " + cantidadDigitos + " digitos.";
            System.out.println(mensaje);
        } catch (NumberFormatException e) {
            System.out.println("El valor ingresado para algun numero no es valido.");
        }

        sc.close();
    }
}
