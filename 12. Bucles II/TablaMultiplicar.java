import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int cantidad = 0;
        while (true) {
            System.out.print("Ingrese un numero: ");
            numero = sc.nextInt();
            if (numero == 0) {
                break;
            }
            cantidad = 0;
            System.out.println("\nTabla de multiplacar del numero: " + numero);
            while (cantidad <= 12) {
                System.out.println(numero + " * " + cantidad + " = " + (numero * cantidad));
                cantidad++;
            }
            System.out.println();
        }
        sc.close();
    }
}
