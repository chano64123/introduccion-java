import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FigurasGeometricas {
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#.00");

    public static void main(String[] args) {
        int opcion = 0;
        while (opcion != 4) {
            ImprimirMenu();
            opcion = PedirNumeroEntero("Ingrese una opcion: ");
            System.out.println();
            int opcionOperacion = 0;
            switch (opcion) {
                case 1 -> {
                    while (opcionOperacion != 3) {
                        ImprimirMenuOperaciones();
                        opcionOperacion = PedirNumeroEntero("\tIngrese una opcion: ");
                        System.out.println();
                        String resultado = switch (opcionOperacion) {
                            case 1 -> {
                                double radio = PedirNumeroDecimal("\tIngrese radio del circulo: ");
                                yield "\tPerimetro: " + df.format(CalcularPerimetroCirculo(radio));
                            }
                            case 2 -> {
                                double radio = PedirNumeroDecimal("\tIngrese radio del circulo: ");
                                yield "\tArea: " + df.format(CalcularAreaCirculo(radio));
                            }
                            case 3 -> "\tSeleccionaste \"Retroceder\"";
                            default -> "\tIngresa una opcion valida.";
                        };
                        System.out.println(resultado);
                    }
                }
                case 2 -> {
                    while (opcionOperacion != 3) {
                        ImprimirMenuOperaciones();
                        opcionOperacion = PedirNumeroEntero("\tIngrese una opcion: ");
                        System.out.println();
                        String resultado = switch (opcionOperacion) {
                            case 1 -> {
                                double lado1 = PedirNumeroDecimal("\tIngrese lado 1 del triangulo: ");
                                double lado2 = PedirNumeroDecimal("\tIngrese lado 2 del triangulo: ");
                                double lado3 = PedirNumeroDecimal("\tIngrese lado 3 del triangulo: ");
                                yield "\tPerimetro: " + df.format(CalcularPerimetroTriangulo(lado1, lado2, lado3));
                            }
                            case 2 -> {
                                double base = PedirNumeroDecimal("\tIngrese base del triangulo: ");
                                double altura = PedirNumeroDecimal("\tIngrese altura del triangulo: ");
                                yield "\tArea: " + df.format(CalcularAreaTriangulo(base, altura));
                            }
                            case 3 -> "\tSeleccionaste \"Retroceder\"";
                            default -> "\tIngresa una opcion valida.";
                        };
                        System.out.println(resultado);
                    }
                }
                case 3 -> {
                    while (opcionOperacion != 3) {
                        ImprimirMenuOperaciones();
                        opcionOperacion = PedirNumeroEntero("\tIngrese una opcion: ");
                        System.out.println();
                        String resultado = switch (opcionOperacion) {
                            case 1 -> {
                                double longitud1 = PedirNumeroDecimal("\tIngrese longitud 1 del paralelogramo: ");
                                double longitud2 = PedirNumeroDecimal("\tIngrese longitud 2 del paralelogramo: ");
                                yield "\tPerimetro: " + df.format(CalcularPerimetroParalelogramo(longitud1, longitud2));
                            }
                            case 2 -> {
                                double base = PedirNumeroDecimal("\tIngrese base del paralelogramo: ");
                                double altura = PedirNumeroDecimal("\tIngrese altura del paralelogramo: ");
                                yield "\tArea: " + df.format(CalcularAreaParalelogramo(base, altura));
                            }
                            case 3 -> "\tSeleccionaste \"Retroceder\"";
                            default -> "\tIngresa una opcion valida.";
                        };
                        System.out.println(resultado);
                    }
                }
                case 4 -> System.out.println("Seleccionaste \"Salir\"");
                default -> System.out.println("Ingresa una opcion valida.");
            }
        }
    }

    public static double PedirNumeroDecimal(String mensaje) {
        double numero = 0.0;
        System.out.print(mensaje);
        while (true) {
            try {
                numero = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.print("No ingreso un numero, intente nuevamente:");
            }
        }
        return numero;
    }

    public static int PedirNumeroEntero(String mensaje) {
        int numero = 0;
        System.out.print(mensaje);
        while (true) {
            try {
                numero = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.print("No ingreso un numero, intente nuevamente:");
            }
        }
        return numero;
    }

    public static void ImprimirMenu() {
        System.out.println();
        System.out.println("MENU DE FIGURAS");
        System.out.println("===============");
        System.out.println("1. Circulo");
        System.out.println("2. Triangulo");
        System.out.println("3. Paralelogramo");
        System.out.println("4. Salir");
    }

    public static void ImprimirMenuOperaciones() {
        System.out.println();
        System.out.println("\tMENU DE OPERACIONES");
        System.out.println("\t===================");
        System.out.println("\t1. Perimetro");
        System.out.println("\t2. Area");
        System.out.println("\t3. Retroceder");
    }

    public static double CalcularPerimetroCirculo(double radio) {
        return 2 * radio * Math.PI;
    }

    public static double CalcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double CalcularPerimetroTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }

    public static double CalcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double CalcularPerimetroParalelogramo(double longitud1, double longitud2) {
        return 2 * (longitud1 + longitud2);
    }

    public static double CalcularAreaParalelogramo(double base, double altura) {
        return base * altura;
    }
}