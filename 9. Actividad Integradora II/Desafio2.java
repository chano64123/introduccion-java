import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        String specialCharacters = "!@#$%^&*()-_+=<>?/{}~|";

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su contraseña: ");
        String clave = sc.next();
        sc.close();

        try {
            if(clave.length() < 8){
                throw new Exception("\nContraseña no segura. La contraseña debe tener al menos 8 caracteres."); 
            }

            boolean hasUppercase = false;
            boolean hasLowercase = false;
            boolean hasDigit = false;
            boolean hasSpecialChar = false;

            for (char letter : clave.toCharArray()) {
                if (Character.isUpperCase(letter)) {
                    hasUppercase = true;
                } else if (Character.isLowerCase(letter)) {
                    hasLowercase = true;
                } else if (Character.isDigit(letter)) {
                    hasDigit = true;
                } else if (specialCharacters.indexOf(letter) >= 0) {
                    hasSpecialChar = true;
                }
            }

            if (!hasUppercase) {
                throw new Exception("\nContraseña no segura. No tiene una letra mayuscula."); 
            }

            if (!hasLowercase) {
                throw new Exception("\nContraseña no segura. No tiene una letra minuscula."); 
            }

            if (!hasDigit) {
                throw new Exception("\nContraseña no segura. No tiene un numero."); 
            }

            if (!hasSpecialChar) {
                throw new Exception("\nContraseña no segura. No tiene un caracter especial."); 
            }
            System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Temperatura no valida. Ingrese una temperatura numerica.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
