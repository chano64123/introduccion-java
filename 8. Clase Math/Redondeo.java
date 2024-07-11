import java.util.Scanner;

public class Redondeo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        double numero = sc.nextDouble();
        sc.close();
        long numeroRedondeado = Math.round(numero);
        System.out.println("El valor redondeado de " + numero + " es " + numeroRedondeado);
    }
}
