public class SumatoriaElementos {
    public static void main(String[] args) {
        int[] numeros = { 3, 6, 10 };
        int sumatoria = 0;
        for (int numero : numeros) {
            sumatoria += numero;
        }
        System.out.println("La sumatoria es: " + sumatoria);
    }
}