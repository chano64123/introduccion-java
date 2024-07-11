import java.util.Scanner;

public class RaizCuadrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero positivo: ");
        int numero = sc.nextInt();
        sc.close();
        double raizCuadrada = Math.sqrt(numero);
        System.out.println("La raiz cuadrada de " + numero + " es " + raizCuadrada);
    }
}
