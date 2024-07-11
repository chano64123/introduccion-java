public class NumeroAleatorio {
    public static void main(String[] args) {
        int numeroAleatorio = (int)(Math.random() * (355 - 1 + 1)) + 1;
        System.out.println("Numero aleatorio entre 1 y 355: " + numeroAleatorio);
    }
}