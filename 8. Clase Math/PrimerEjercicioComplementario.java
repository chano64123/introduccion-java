import java.util.Scanner;

public class PrimerEjercicioComplementario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese numero inferior: ");
        int numeroInferior = sc.nextInt();
        System.out.print("Ingrese numero superior: ");
        int numeroSuperior = sc.nextInt();
        sc.close();
        int numeroAleatorio = (int)(Math.random() * (numeroSuperior - numeroInferior + 1)) + numeroInferior;
        System.out.println("Numero aleatorio entre " + numeroInferior + " y " + numeroSuperior + ": " + numeroAleatorio);
    }
}