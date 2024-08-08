import java.util.Arrays;

public class ImprimirArray {
    public static void main(String[] args) {
        int[] arrayInt = {1, 2, 3, 4, 5};
        String[] arrayString = {"uno", "dos", "tres"};
        int[][] arrayInt2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        String[][] arrayString2D = {{"uno", "dos"}, {"tres", "cuatro"}};

        Imprimir(arrayInt);
        Imprimir(arrayString);
        Imprimir(arrayInt2D);
        Imprimir(arrayString2D);
    }

    public static void Imprimir(int[] array) {
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    public static void Imprimir(String[] array) {
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    public static void Imprimir(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println();
    }

    public static void Imprimir(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println();
    }
}
