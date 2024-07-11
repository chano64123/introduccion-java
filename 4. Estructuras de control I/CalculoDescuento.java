import java.util.Scanner;

public class CalculoDescuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un precio: ");
        double precio = sc.nextDouble();
        sc.close();
        double precioFinal = precio >= 100 ? precio * 0.9 : precio;
        System.out.println("El precio a pagar es de S/" + precioFinal);
    }
}
