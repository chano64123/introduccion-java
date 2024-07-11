public class SumaPosicionesPares {
    public static void main(String[] args) {
        int[] numeros = { 10, 23, 15, 8, 5 };

        int sumatoria = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) {
                sumatoria += numeros[i];
            }
        }

        System.out.println("La sumatoria es de los numeros de posiciones pares es: " + sumatoria);
    }
}
