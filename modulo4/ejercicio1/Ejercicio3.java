import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del mes: ");
        String nombreMes = scanner.nextLine();

        int dias;

        switch (nombreMes.toLowerCase()) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                dias = 31;
                break;
            case "febrero":
                dias = 28;
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                dias = 30;
                break;
            default:
                dias = -1;
                break;
        }

        if (dias != -1) {
            System.out.println("El mes " + nombreMes + " tiene " + dias + " días.");
        } else {
            System.out.println("Nombre de mes inválido.");
        }
    }
}
