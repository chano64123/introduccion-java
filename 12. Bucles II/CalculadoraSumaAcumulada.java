import java.util.Scanner;

public class CalculadoraSumaAcumulada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0, acumulador = 0;
        boolean continua= false;
        String respuesta;
        do {
            System.out.print("Ingresa un numero positivo: ");
            numero = sc.nextInt();
            acumulador += numero;
            System.out.print("Desea continuar (S/N): ");
            respuesta = sc.next();
            continua = respuesta.equalsIgnoreCase("s");
        } while (continua);
        sc.close();
        System.out.println("La suma acumulada es: " + acumulador);
    }
}
