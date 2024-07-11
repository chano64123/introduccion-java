import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();
        sc.close();
        int valorAbsoluto = Math.abs(numero);
        System.out.println("El valor absoluto de " + numero + " es " + valorAbsoluto);
    }
}