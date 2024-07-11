import java.util.Scanner;

public class CalculoAreaPerimetro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de la base del rectangulo: ");
        double baseRectangulo = sc.nextDouble();
        System.out.print("Ingrese el valor de la altura del rectangulo: ");
        double alturaRectangulo = sc.nextDouble();
        sc.close();

        double perimetro = 2 * baseRectangulo + 2 * alturaRectangulo;
        double area = baseRectangulo * alturaRectangulo;

        System.out.println("El perimetro del rectangulo es: " + perimetro);
        System.out.println("El area del rectangulo es: " + area);
    }
}
