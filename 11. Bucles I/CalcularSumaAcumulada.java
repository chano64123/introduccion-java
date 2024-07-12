public class CalcularSumaAcumulada {
    public static void main(String[] args) {
        int[] numeros = {1,5,6,8,10,32,1,25,6,3};
        int acumulador = 0;
        for (int i = 0; i < numeros.length; i++) {
            acumulador += numeros[i];
            numeros[i] = acumulador;
        }
        System.out.print("Array con suma acumulada: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
