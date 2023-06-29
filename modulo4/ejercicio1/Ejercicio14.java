import java.util.Scanner;

public class DeterminarPuestoTorneo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el puesto del participante: ");
        int puesto = scanner.nextInt();

        String mensaje;

        if (puesto == 1) {
            mensaje = "El primero obtiene la medalla de oro.";
        } else if (puesto == 2) {
            mensaje = "El segundo obtiene la medalla de plata.";
        } else if (puesto == 3) {
            mensaje = "El tercero obtiene la medalla de bronce.";
        } else {
            mensaje = "Siga participando.";
        }

        System.out.println(mensaje);
    }
}
