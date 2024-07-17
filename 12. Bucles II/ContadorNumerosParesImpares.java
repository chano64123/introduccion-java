import java.util.Scanner;

public class ContadorNumerosParesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidadPares = 0;
        int cantidadImpares = 0;
        String respuesta;

        while (true) {
            System.out.print("Ingresa un numero entero (o escribe 'salir' para terminar): ");
            respuesta = sc.next();

            if (respuesta.equalsIgnoreCase("salir")) {
                break;
            }

            try {
                int numero = Integer.parseInt(respuesta);

                if (numero % 2 == 0) {
                    cantidadPares++;
                } else {
                    cantidadImpares++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Valor no valido. Por favor, ingrese un numero entero o 'salir' para terminar.");
            }
        }

        System.out.println("Cantidad de numeros pares: " + cantidadPares);
        System.out.println("Cantidad de numeros impares: " + cantidadImpares);

        sc.close();
    }
}
