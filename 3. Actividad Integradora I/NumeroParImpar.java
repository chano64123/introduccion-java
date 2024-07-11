import java.util.Scanner;

public class NumeroParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();
        sc.close();

        String mensaje = numero % 2 == 0 ? "El numero " + numero + " es par" : "El numero " + numero + " no es par";
        System.out.println(mensaje);
    }
}
