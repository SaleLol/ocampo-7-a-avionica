import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una categoría (a, b o c): ");
        String categoria = scanner.nextLine();

        String palabra;

        switch (categoria.toLowerCase()) {
            case "a":
                palabra = "hijo";
                break;
            case "b":
                palabra = "padres";
                break;
            case "c":
                palabra = "abuelos";
                break;
            default:
                palabra = "Categoría inválida";
                break;
        }

        System.out.println("Corresponde a la categoría: " + palabra);
    }
}
