import java.util.Scanner;

public class DibujandoCuadrados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char caracter = '*';
        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();
        sc.close();

        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                if (i == 0 || j == 0 || i == numero - 1 || j == numero - 1) {
                    //System.out.print("("+i+","+j+")");
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
