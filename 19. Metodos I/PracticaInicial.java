import java.util.Scanner;

public class PracticaInicial {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre = ObtenerNombre();
        int edad = ObtenerEdad();
        ImprimirNombreYEdad(nombre, edad);
        sc.close();
    }

    public static void ImprimirNombre(String nombre){
        System.out.println("Mi nombre es: " + nombre);
    }

    public static void ImprimirNombreYEdad(String nombre, int edad){
        System.out.println("Mi nombre es " + nombre + " y tengo " + edad + " años");
    }

    public static String ObtenerNombre(){
        System.out.print("Ingrese un nombre: ");
        String nombre = sc.nextLine();
        return nombre;
    }

    public static int ObtenerEdad(){
        System.out.print("Ingrese una edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        return edad;
    }
}