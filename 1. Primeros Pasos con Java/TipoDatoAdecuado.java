import java.sql.Date;

public class TipoDatoAdecuado {
    public static void main(String[] args) {
        // La temperatura media de una ciudad durante el verano (en grados Celsius).
        //?Tipo double debido a que puede contener decimales la temperatura
        double temperatura = 34.2;

        // El precio de un producto en una tienda (en dolares y centavos).
        //?Tipo double debido a que almacena con centavos el precio
        double precio = 10.99;

        // El nombre completo de una persona.
        //?Tipo string debido a que es un nombre y contiene letras
        String nombre = "Jose Carlos Gutierrez Ponce";

        // La fecha de nacimiento de una persona.
        //?Tipo date debido a que es una fecha
        Date fehcaNacimiento = new Date(1999,12,12);

        // El numero de habitantes de una ciudad.
        //?Tipo long debido a que es una cantidad exacta y puede ser muy grande debido a que es de una ciudad
        long numeroHabitaciones = 1265421;

        // La duracion de una pelicula (en minutos).
        //?Tipo double debido a que es no siempre puede ser una cantidad exacta
        double duracionPelicula = 180.12;

        // Si un articulo esta disponible o no en una tienda (true/false).
        //?Tipo boolean debido a que solo puede tener dos estados
        boolean disponible = true;

        // La distancia entre dos ciudades (en kilometros).
        //?Tipo double debido a que puede ser una cantidad inexacta
        double distancia = 15623.42;

        // El numero de telefono de una persona.
        //?Tipo string debido a que puede contener caracteres especiales como el +, -
        String telefono = "+51951951951";

        // La cantidad de existencias de un producto en una tienda.
        //?Tipo int debido a que es una cantidad exacta
        int cantidadStock = 123;
    }
}
