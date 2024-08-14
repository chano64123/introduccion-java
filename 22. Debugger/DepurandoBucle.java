public class DepurandoBucle {
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 5, 6, 8, 32, 4 };
        int sumatoria = 0;
        for (int i = 0; i < numeros.length; i++) {
            sumatoria += numeros[i];
        }
        System.out.println(sumatoria);
    }
}