public class Fibonacci {
    public static void main(String[] args) {
        int i = 0;
        int numero1 = 0;
        int numero2 = 1;
        int auxiliar = 0;
        while (i < 8) {
            System.out.println((i + 1) + ". " + numero1);
            auxiliar = numero1 + numero2;
            numero1 = numero2;
            numero2 = auxiliar;
            i++;
        }
    }
}