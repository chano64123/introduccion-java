public class ImprimiendoElementos {
    public static void main(String[] args) {
        int[] numeros = {1,5,6,8,10,32,1,25,6,3};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero " + (i+1) + ": " + numeros[i]);
        }
    }
}