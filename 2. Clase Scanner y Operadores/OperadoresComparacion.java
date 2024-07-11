import java.util.Scanner;

public class OperadoresComparacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int numero1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numero2 = sc.nextInt();
        
        System.out.println("A. El numero " + numero1 + " es mayor a " + numero2 + "? = " + (numero1 > numero2));
        System.out.println("B. El primer numero es distinto al segundo numero: " + (numero1 != numero2));
        System.out.println("El primer numero es divisible por 2: " + (numero1 % 2 == 0));

        System.out.print("Ingrese el tercer numero: ");
        int numero3 = sc.nextInt();
        System.out.print("Ingrese el cuarto numero: ");
        int numero4 = sc.nextInt();
        
        System.out.println("A. El numero 1 es mayor al numero 2 y el numero 3 es mayor al numero 4: " + ((numero1 > numero2) && (numero3 > numero4)));
        System.out.println("B. El numero 1 es mayor al numero 2 o el numero 3 es mayor al numero 4: " + ((numero1 > numero2) || (numero3 > numero4)));
        
        sc.close();
    }
}
