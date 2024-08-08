import java.util.Scanner;

public class NumeroAleatorio {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Numero aleatorio generado: " + GenerarNumeroAleatorio());
        sc.close();
    }

    public static int GenerarNumeroAleatorio(){
        return (int) (Math.random() * (355 - 1 + 1)) + 1;
    }
}
