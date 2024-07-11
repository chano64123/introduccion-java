import java.util.Scanner;

public class EliminacionEspaciosEnBlanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una frase con espacios en blanco: ");
        String frase = sc.nextLine();
        sc.close();

        String fraseSinEspacios = frase.trim();
        System.out.println("Frase sin espacios en blanco: " + fraseSinEspacios);
    }
}
