import java.util.Scanner;

public class TablaDeMultiplicar {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numero = PedirNumero();
        ImprimirTablaMultiplicar(numero);
        sc.close();
    }

    public static int PedirNumero() {
        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();
        sc.nextLine();
        return numero;
    }

    public static void ImprimirTablaMultiplicar(int numero) {
        for (int i = 0; i <= 12; i++) {
            int multiplicacion = i * numero;
            System.out.println(i + " * " + numero + " = " + multiplicacion);
        }
    }
}
