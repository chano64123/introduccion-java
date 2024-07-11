import java.util.Scanner;

public class ExtraccionSubcadenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();
        System.out.print("Ingrese el indice inicial: ");
        int indiceInicial = sc.nextInt();
        System.out.print("Ingrese el indice final: ");
        int indiceFinal = sc.nextInt();
        sc.close();

        try {
            String subcadena = frase.substring(indiceInicial, indiceFinal + 1);
            System.out.println("La subcadena entre los indices " + indiceInicial + " y " + indiceFinal + " es: " + subcadena);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Los indices estan fuera del rango de la frase ingresada.");
        }
    }
}
