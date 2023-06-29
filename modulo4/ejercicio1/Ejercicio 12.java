import java.util.Scanner;

public class DeterminarDocena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 12) {
            System.out.println("El número pertenece a la primer docena.");
        } else if (numero >= 13 && numero <= 24) {
            System.out.println("El número pertenece a la segunda docena.");
        } else if (numero >= 25 && numero <= 36) {
            System.out.println("El número pertenece a la tercer docena.");
        } else {
            System.out.println("El número " + numero + " está fuera de rango.");
        }
    }
}
