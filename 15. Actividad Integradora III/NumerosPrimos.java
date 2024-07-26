import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean esPrimo = false;
        do {
            System.out.print("Ingrese un numero: ");
            numero = sc.nextInt();

            if (numero <= 1) {
                esPrimo = false;
            }

            esPrimo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            String mensaje = esPrimo ? "Es primo" : "No es primo";
            System.out.println(mensaje);
        } while (!esPrimo);

        sc.close();
    }
}
