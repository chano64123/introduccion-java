import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class EstadisticaDeCalificaciones {
    public static void main(String[] args) {
        Random rnd = new Random();
        String[] calificaciones =  new String[10];

        for (int i = 0; i < calificaciones.length; i++) {
            calificaciones[i] = String.valueOf(rnd.nextInt(15) + 1);
        }

        ArrayList<Double> desaprobados = new ArrayList<>();
        ArrayList<Double> aprobados = new ArrayList<>();
        ArrayList<Double> excelentes = new ArrayList<>();
        
        double acumuladodTotal = 0;
        double acumuladodDesaprobado = 0;
        double acumuladodAprobado = 0;
        double acumuladodExcelente = 0;

        for (String nota : calificaciones) {
            double calificacion = Double.parseDouble(nota);
            if (calificacion < 4) {
                desaprobados.add(calificacion);
                acumuladodDesaprobado += calificacion;
            } else if (calificacion >= 4 && calificacion < 10) {
                aprobados.add(calificacion);
                acumuladodAprobado += calificacion;
            } else {
                excelentes.add(calificacion);
                acumuladodExcelente += calificacion;
            }
            acumuladodTotal += calificacion;
        }

        double promedioCalificaciones = acumuladodTotal / calificaciones.length;
        double promedioDesaprobados = acumuladodDesaprobado / desaprobados.size();
        double promedioAprobados = acumuladodAprobado / aprobados.size();
        double promedioExcelentes = acumuladodExcelente / excelentes.size();

        // Imprimir los resultados
        System.out.print("Calificaciones: " + Arrays.toString(calificaciones));
        System.out.println("\nPromedio de calificaciones: " + promedioCalificaciones);
        
        System.out.println("\nCalificaciones desaprobadas: " + desaprobados);
        System.out.println("Promedio de calificaciones desaprobadas: " + promedioDesaprobados);
        
        System.out.println("\nCalificaciones aprobadas: " + aprobados);
        System.out.println("Promedio de calificaciones aprobadas: " + promedioAprobados);
        
        System.out.println("\nCalificaciones excelentes: " + excelentes);
        System.out.println("Promedio de calificaciones excelentes: " + promedioExcelentes);
    }
}
