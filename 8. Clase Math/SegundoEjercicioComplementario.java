import java.util.Scanner;

public class SegundoEjercicioComplementario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese numero entre 1 y 30: ");
        int numeroLimite = sc.nextInt();
        sc.close();
        int numeroAleatorio = (int)(Math.random() * (numeroLimite - 1 + 1)) + 1;
        System.out.println("Numero aleatorio entre 1 y " + numeroLimite + ": " + numeroAleatorio);
        double raizCuadrada = Math.sqrt(numeroAleatorio);
        System.out.println("Raiz cuadrada de " + numeroAleatorio + " es " + raizCuadrada);
        if (esPrimo(numeroAleatorio)) {
            System.out.println(numeroAleatorio + " es un numero primo");
        } else {
            System.out.println(numeroAleatorio + " no es un numero primo");
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}