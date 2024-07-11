import java.util.Scanner;

public class Divisibilidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();
        sc.close();

        String mensaje = "";
        boolean divisibleTres = numero % 3 == 0;
        boolean divisibleCinco = numero % 5 == 0;
        if (divisibleTres && divisibleCinco) {
            mensaje = "El numero (" + numero + ") es divisible por 3 y 5";
        }else if (divisibleTres) {
            mensaje = "El numero (" + numero + ") es divisible por 3";
        } else if (divisibleCinco) {
            mensaje = "El numero (" + numero + ") es divisible por 5";
        } else {
            mensaje = "El numero (" + numero + ") no es divisible ni por 5 o 3";
        }
        System.out.println(mensaje);
    }
}
