import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese primer numero: ");
        int numero1 = sc.nextInt();
        System.out.print("Ingrese segundo numero: ");
        int numero2 = sc.nextInt();

        System.out.println("Operaciones");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.print("Seleccione una operacion: ");
        int opcion = sc.nextInt();
        sc.close();

        String mensaje = "";
        double resultado = 0;
        if (opcion == 1) {
            resultado = numero1 + numero2;
            mensaje = "La suma es: " + resultado;
        } else if (opcion == 2) {
            resultado = numero1 - numero2;
            mensaje = "La resta es: " + resultado;
        } else if (opcion == 3) {
            resultado = numero1 * numero2;
            mensaje = "La multiplicacion es: " + resultado;
        } else if (opcion == 4) {
            if (numero2 != 0) {
                resultado = numero1 / numero2;
                mensaje = "La division es: " + resultado;
            } else {
                mensaje = "El resulado es indefinido";
            }
        } else {
            mensaje = "Opcion incorrecta.";
        }

        System.out.println(mensaje);
    }
}
