import java.util.Scanner;

public class ContarOcurrencias {
    public static void main(String[] args) {
        String frase = "este es un texto de pueba que solo tiene una m";
        char[] array = new char[frase.length()];
        for (int i = 0; i < frase.length(); i++) {
            array[i] = frase.charAt(i);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese caracter a buscar: ");
        char caracterBuscado = sc.nextLine().charAt(0);
        sc.close();

        int contador = 0;
        for (char caracter : array) {
            if (caracter == caracterBuscado) {
                contador++;
            }
        }

        String aux = contador == 1 ? "vez" : "veces";
        String mensaje = contador > 0 ? "El caracter (" + caracterBuscado + ") aparece " + contador + " " + aux : "El caracter (" + caracterBuscado + ") no aparece en la frase";
        System.out.println(mensaje);
    }
}
