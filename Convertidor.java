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
}            