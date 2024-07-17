import java.util.Arrays;

public class ComparandoArreglos {
    public static void main(String[] args) {
        int[] arreglo1 = { 12, 30, 0, 4, 9, -12, 123, 10, 63 };
        int[] arreglo2 = { 12, 30, 0, 4, 9, -12, 123, 10, 0 };

        boolean sonIguales = Arrays.equals(arreglo1, arreglo2);

        String mensaje = sonIguales ? "Los arreglos son iguales" : "Los arreglos son diferentes";
        System.out.println(mensaje);
    }
}
