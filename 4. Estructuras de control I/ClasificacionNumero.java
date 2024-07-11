import java.util.Scanner;

public class ClasificacionNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();
        sc.close();
        String mensaje = "";
        if (numero > 0) {
            mensaje = "El numero ingresado (" + numero + ") es mayor a cero";
        } else if (numero < 0) {
            mensaje = "El numero ingresado (" + numero + ") es menor a cero";
        } else {
            mensaje = "El numero ingresado (" + numero + ") es igual a cero";
        }
        System.out.println(mensaje);
    }
}