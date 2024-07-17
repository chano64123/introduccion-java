import java.util.Scanner;

public class NumeroDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;

        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();
        int numeroAux = numero;

        if (numero == 0) {
            cantidad++;
        }

        if (numero<0) {
            numero = Math.abs(numero);
            cantidad++;
        }

        while (numero > 0) {
            numero /= 10;
            cantidad++;
        }

        System.out.println("La cantidad de digitos de " + numeroAux + " es: " + cantidad);
        sc.close();
    }
}