import java.util.Scanner;

public class ClaveSegura {
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_+=<>?/{}~|";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String clave = sc.nextLine();
        sc.close();

        try {
            VerificarLongitud(clave);
            VerificarMayuscula(clave);
            VerificarMinuscula(clave);
            VerificarDigito(clave);
            VerificarCaracterEspecial(clave);
            System.out.println("Clave segura! Cumple con todos los criterios.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void VerificarLongitud(String clave) throws Exception {
        if (clave.length() < 8) {
            throw new Exception("\nClave no segura. La contraseña debe tener al menos 8 caracteres.");
        }
    }

    private static void VerificarMayuscula(String clave) throws Exception {
        boolean hasUppercase = false;
        for (char letter : clave.toCharArray()) {
            if (Character.isUpperCase(letter)) {
                hasUppercase = true;
                break;
            }
        }
        if (!hasUppercase) {
            throw new Exception("\nClave no segura. No tiene una letra mayuscula.");
        }
    }

    private static void VerificarMinuscula(String clave) throws Exception {
        boolean hasLowercase = false;
        for (char letter : clave.toCharArray()) {
            if (Character.isLowerCase(letter)) {
                hasLowercase = true;
                break;
            }
        }
        if (!hasLowercase) {
            throw new Exception("\nClave no segura. No tiene una letra minuscula.");
        }
    }

    private static void VerificarDigito(String clave) throws Exception {
        boolean hasDigit = false;
        for (char letter : clave.toCharArray()) {
            if (Character.isDigit(letter)) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {
            throw new Exception("\nClave no segura. No tiene un numero.");
        }
    }

    private static void VerificarCaracterEspecial(String clave) throws Exception {
        boolean hasSpecialChar = false;
        for (char letter : clave.toCharArray()) {
            if (SPECIAL_CHARACTERS.indexOf(letter) >= 0) {
                hasSpecialChar = true;
                break;
            }
        }
        if (!hasSpecialChar) {
            throw new Exception("\nContraseña no segura. No tiene un caracter especial.");
        }
    }
}