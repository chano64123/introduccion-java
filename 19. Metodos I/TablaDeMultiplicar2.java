import java.util.Scanner;

public class TablaDeMultiplicar2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numeros = new int[3];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = PedirNumero(i+1);
        }
        ImprimirTablasMultiplicar(numeros);
        sc.close();
    }

    public static int PedirNumero(int pos) {
        System.out.print("Ingrese un numero " + pos + ": ");
        int numero = sc.nextInt();
        sc.nextLine();
        return numero;
    }

    public static void ImprimirTablasMultiplicar(int[] numeros) {
        for (int numero : numeros) {
            ImprimirTablaMultiplicar(numero);
        }
    }

    public static void ImprimirTablaMultiplicar(int numero) {
        System.out.println("\nTabla del " + numero);
        for (int i = 0; i <= 12; i++) {
            int multiplicacion = i * numero;
            System.out.println(i + " * " + numero + " = " + multiplicacion);
        }
    }
}
