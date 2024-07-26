import java.util.Random;
import java.util.Scanner;

public class GenerandoClaves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        try {
            System.out.print("Ingrese un valor numerico entero: ");
            int longitudClave = sc.nextInt();

            char[] clave = new char[longitudClave];

            boolean tieneMayuscula = false;
            boolean tieneMinuscula = false;
            boolean tieneDigito = false;
            char letra;

            for (int i = 0; i < longitudClave; i++) {
                int tipoCaracter = random.nextInt(3);
                
                if (tipoCaracter == 0) {
                    letra = (char) (random.nextInt(26) + 'A');
                    tieneMayuscula = true;
                } else if (tipoCaracter == 1) {
                    letra = (char) (random.nextInt(26) + 'a');
                    tieneMinuscula = true;
                } else {
                    letra = (char) (random.nextInt(10) + '0');
                    tieneDigito = true;
                }

                clave[i] = letra;
            }

            if (!tieneMayuscula) {
                clave[random.nextInt(longitudClave)] = (char) (random.nextInt(26) + 'A');
            }
            if (!tieneMinuscula) {
                clave[random.nextInt(longitudClave)] = (char) (random.nextInt(26) + 'a');
            }
            if (!tieneDigito) {
                clave[random.nextInt(longitudClave)] = (char) (random.nextInt(10) + '0');
            }

            System.out.println("Clave generada: " + String.valueOf(clave));
        } catch (NumberFormatException e) {
            System.out.println("Valor invalido para un numero.");
        }

        sc.close();
    }
}