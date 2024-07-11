import java.util.Scanner;

public class FiguraGeometrica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione una figura geometrica:");
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triangulo");
        System.out.print("Seleccione una opcion: ");
        int opcion = sc.nextInt();
        double area = switch (opcion) {
            case 1 -> {
                System.out.print("Ingrese el radio del circulo: ");
                double radio = sc.nextDouble();
                yield Math.PI * radio * radio;
            }
            case 2 -> {
                System.out.print("Ingrese el lado del cuadrado: ");
                double lado = sc.nextDouble();
                yield lado * lado;
            }
            case 3 -> {
                System.out.print("Ingrese la base del triangulo: ");
                double base = sc.nextDouble();
                System.out.print("Ingrese la altura del triangulo: ");
                double altura = sc.nextDouble();
                yield (base * altura) / 2;
            }
            default -> {
                System.out.println("Opcion no valida.");
                yield 0;
            }
        };
        sc.close();
        System.out.println("El area de la figura seleccionada es: " + area);
    }
}
