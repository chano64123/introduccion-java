import java.util.Random;

public class ContadorElementosPares {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(100) + 1;

        }
        System.out.print("Numeros: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        int cantidadPares = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                cantidadPares++;
            }

        }
        System.out.println("La cantidad de elementos pares es: " + cantidadPares);
    }
}
