public class InvirtiendoArray {
    public static void main(String[] args) {
        int[] numeros = {1,5,6,8,10,32,1,25,6,3};
        int[] numerosInvertidos = new int[numeros.length];
        
        int j = numeros.length-1;
        for (int i = 0; i < numeros.length; i++) {
            numerosInvertidos[i] = numeros[j];
            j--;
        }

        System.out.print("Array Original: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.print("\nArray Invertido: ");
        for (int numero : numerosInvertidos) {
            System.out.print(numero + " ");
        }
    }
}
