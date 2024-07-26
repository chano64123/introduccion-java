import java.util.Scanner;

public class NumerosPrimosPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean esPrimo = false;
        System.out.print("Ingrese cantidad de numeros primos: ");
        int cantidadPrimos = sc.nextInt();
        int primosEncontrados = 0;
        int numero = 1;
        do {
            esPrimo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println(numero);
                primosEncontrados++;
            }
            numero++;
        } while (primosEncontrados < cantidadPrimos);

        System.out.println();
        sc.close();
    }
}
