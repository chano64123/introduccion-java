import java.util.Random;
import java.util.Scanner;

public class AdivinandoNumero {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int numeroAleatorio = rnd.nextInt(20) + 1;
        int numeroAdivinado, intentos = 0;
        do {
            System.out.print("Adivna el numero aleatorio (1-20): ");
            numeroAdivinado = sc.nextInt();
            intentos++;

            if (numeroAdivinado < numeroAleatorio) {
                System.out.println("El numero aleatorio es mayor.");
            } else if (numeroAdivinado > numeroAleatorio) {
                System.out.println("El numero aleatorio es menor.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el numero en " + intentos + " intentos.");
            }
        } while (numeroAleatorio != numeroAdivinado);
        sc.close();
    }
}
