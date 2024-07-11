import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        int base = sc.nextInt();
        System.out.print("Ingrese el exponente: ");
        int exponente = sc.nextInt();
        sc.close();
        int potencia = (int)Math.pow(base, exponente);
        System.out.println(base + " elevado a la " + exponente + " es " + potencia);
    }
}
