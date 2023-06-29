import java.util.Scanner;

public class DeterminarDiasMesSwitch {
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
            case "diciembre" -> dias = 31;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre" -> dias = 30;
            case "febrero" -> dias = 28;
            default -> dias = -1;
        }

        if (dias != -1) {
            System.out.println(nombreMes + " tiene " + dias + " días.");
        } else {
            System.out.println("Mes inválido.");
        }
    }
}
