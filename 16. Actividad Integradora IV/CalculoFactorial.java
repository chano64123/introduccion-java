import java.util.Scanner;

public class CalculoFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();
        int factorial = 1;
        int i = 1;
        do {
            factorial *= i;
            i++;
        } while (i<=numero);
        System.out.println(numero + "! = " + factorial);
        sc.close();
    }
}