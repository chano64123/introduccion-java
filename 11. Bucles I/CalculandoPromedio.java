import java.util.Random;

public class CalculandoPromedio {
    public static void main(String[] args) {
        float[] numeros = new float[20];
        Random rnd = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextFloat(100) + 1;

        }

        float sumatoria = 0;
        float promedio = 0;

        for (float numero : numeros) {
            sumatoria += numero;
        }
        promedio = sumatoria / (float)numeros.length;

        System.out.println("La suma de numeros es: " + sumatoria);
        System.out.println("El primedio de numeros es: " + promedio);
    }
}
