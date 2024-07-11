import java.util.Scanner;

public class ReemplazoCaracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();
        System.out.print("Ingrese el primer caracter a reemplazar: ");
        char primerCaracter = sc.nextLine().charAt(0);
        System.out.print("Ingrese el segundo caracter: ");
        char segundoCaracter = sc.nextLine().charAt(0);
        sc.close();
        
        String fraseModificada = frase.replace(primerCaracter, segundoCaracter);
        System.out.println("Frase con reemplazo: " + fraseModificada);
    }
}
