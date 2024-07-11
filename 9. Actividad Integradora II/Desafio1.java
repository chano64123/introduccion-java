import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese la temperatura: ");
            double temperatura = Double.parseDouble(sc.nextLine());
            System.out.print("Ingrese la unidad de medida (C/F): ");
            String unidadAConvertir = sc.next();
            sc.close();
            String unidadMedidaOrigen, unidadMedidaDestino;
            double temperaturaConvertida = 0;
            switch (unidadAConvertir) {
                case "C", "c" -> {
                    unidadMedidaOrigen = "Fahrenheit";
                    unidadMedidaDestino = "Celsius";
                    temperaturaConvertida = (temperatura - 32) * 5 / 9;
                }
                case "F", "f" -> {
                    unidadMedidaOrigen = "Celsius";
                    unidadMedidaDestino = "Fahrenheit";
                    temperaturaConvertida = (temperatura * 9 / 5) + 32;
                }
                default -> throw new Exception("\nError: Unidad de medida no valida. Ingrese C para Celsius o F para Fahrenheit.");
            }
            System.out.println(temperatura + " grados " + unidadMedidaOrigen + " equivale a " + temperaturaConvertida + " grados " + unidadMedidaDestino + ".");
        } catch (NumberFormatException e) {
            System.out.println("Error: Temperatura no valida. Ingrese una temperatura numerica.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
