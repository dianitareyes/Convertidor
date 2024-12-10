import java.util.Scanner;

public class Convertidor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

         do {
            System.out.println("===== Convertidor de Unidades =====");
            System.out.println("1. Longitud: Metros a Centímetros y Pulgadas");
            System.out.println("2. Masa: Kilogramos a Libras y Gramos");
            System.out.println("3. Velocidad: Metros/segundo a Kilómetros/hora");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    convertirLongitud(scanner);
                    break;
                case 2:
                    convertirMasa(scanner);
                    break;
                case 3:
                    convertirVelocidad(scanner);
                    break;
                case 4:
                    System.out.println("Gracias por usar el convertidor de unidades. ¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente nuevamente.");
            }
            System.out.println();
        } while (opcion != 4);
        
        scanner.close();
    }

    // Conversión de longitud
    public static void convertirLongitud(Scanner scanner) {
        System.out.print("Ingrese la longitud en metros: ");
        double metros = scanner.nextDouble();
        double centimetros = metros * 100;
        double pulgadas = metros * 39.3701;
        System.out.printf("Centímetros: %.2f cm%n", centimetros);
        System.out.printf("Pulgadas: %.2f in%n", pulgadas);
    }

    // Conversión de masa
    public static void convertirMasa(Scanner scanner) {
        System.out.print("Ingrese la masa en kilogramos: ");
        double kilogramos = scanner.nextDouble();
        double libras = kilogramos * 2.20462;
        double gramos = kilogramos * 1000;
        System.out.printf("Libras: %.2f lb%n", libras);
        System.out.printf("Gramos: %.2f g%n", gramos);
    }

     // Conversión de velocidad
    public static void convertirVelocidad(Scanner scanner) {
        System.out.print("Ingrese la velocidad en metros/segundo: ");
        double metrosPorSegundo = scanner.nextDouble();
        double kilometrosPorHora = metrosPorSegundo * 3.6;
        System.out.printf("Kilómetros/hora: %.2f km/h%n", kilometrosPorHora);
    }
}            