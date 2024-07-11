import java.util.Scanner;

public class CalculadoraAreaPerimetro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione una figura geometrica:");
        System.out.println("1. Circulo");
        System.out.println("2. Rectangulo");
        System.out.print("Seleccione una opcion: ");
        int opcionFigura = sc.nextInt();

        double radio, base, altura;

        String resultado = switch (opcionFigura) {
            case 1 -> {
                System.out.print("Ingrese el radio del circulo: ");
                radio = sc.nextDouble();
                
                System.out.println("¿Que desea calcular?");
                System.out.println("1. area");
                System.out.println("2. Perimetro");
                System.out.print("Seleccione una opcion: ");
                int opcionCalculo = sc.nextInt();
                
                yield switch (opcionCalculo) {
                    case 1 -> "El area del circulo es: " + (Math.PI * radio * radio);
                    case 2 -> "El perimetro del circulo es: " + (2 * Math.PI * radio);
                    default -> "Opcion de calculo no valida.";
                };
            }
            case 2 -> {
                System.out.print("Ingrese la base del rectangulo: ");
                base = sc.nextDouble();
                System.out.print("Ingrese la altura del rectangulo: ");
                altura = sc.nextDouble();
                
                System.out.println("¿Que desea calcular?");
                System.out.println("1. area");
                System.out.println("2. Perimetro");
                System.out.print("Seleccione una opcion: ");
                int opcionCalculo = sc.nextInt();
                
                yield switch (opcionCalculo) {
                    case 1 -> "El area del rectangulo es: " + (base * altura);
                    case 2 -> "El perimetro del rectangulo es: " + (2 * (base + altura));
                    default -> "Opcion de calculo no valida.";
                };
            }
            default -> "Opcion de figura no valida.";
        };
        sc.close();

        System.out.println(resultado);
    }
}
