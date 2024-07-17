import java.util.Arrays;

public class OrdenAscendente {
    public static void main(String[] args) {
        int[] numeros = { 12, 30, 0, 4, 9, -12, 123, 10, 63 };
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
    }
}