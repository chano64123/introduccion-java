import java.util.Scanner;

public class BuscandoElemento {
    public static void main(String[] args) {
        int[] numeros = { 5, 23, 85 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numeroBuscado = sc.nextInt();
        boolean encontrado = false;
        for (int numero : numeros) {
            if (numeroBuscado == numero) {
                encontrado = true;
                break;
            }
        }
        String mensaje = encontrado ? "El numero ingresado (" + numeroBuscado + ") esta presente en el array" : "El numero ingresado (" + numeroBuscado + ") no esta presente en el array";
        System.out.println(mensaje);
        sc.close();
    }
}
