public class CantidadElementosPares {
    public static void main(String[] args) {
        int[] array = {12, 7, 3, 20, 8, 15};

        int contadorPares = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println("Cantidad de numeros pares: " + contadorPares);
    }
}
