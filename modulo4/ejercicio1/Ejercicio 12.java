import java.util.Scanner;

public class DeterminarDocena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        boolean primeraDocena = numero >= 1 && numero <= 12;
        boolean segundaDocena = numero >= 13 && numero <= 24;
        boolean terceraDocena = numero >= 25 && numero <= 36;

        if (primeraDocena || segundaDocena || terceraDocena) {
            if (primeraDocena) {
                System.out.println("El número pertenece a la primer docena.");
            } else if (segundaDocena) {
                System.out.println("El número pertenece a la segunda docena.");
            } else {
                System.out.println("El número pertenece a la tercer docena.");
            }
        } else {
            System.out.println("El número " + numero + " está fuera de rango.");
        }
    }
}
