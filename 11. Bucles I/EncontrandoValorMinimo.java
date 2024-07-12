public class EncontrandoValorMinimo {
    public static void main(String[] args) {
        int[] numeros = {1,5,6,-8,10,32,1,25,6,3};
        int numeroMenor = Integer.MAX_VALUE;
        for (int numero : numeros) {
            if (numero < numeroMenor) {
                numeroMenor = numero;
            }
        }
        System.out.println("El valor minimo es: " + numeroMenor);
    }
}
