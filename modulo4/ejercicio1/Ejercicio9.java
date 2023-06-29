import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jugador 1 - Ingrese su elección (0: piedra, 1: papel, 2: tijera): ");
        int eleccion1 = scanner.nextInt();

        System.out.print("Jugador 2 - Ingrese su elección (0: piedra, 1: papel, 2: tijera): ");
        int eleccion2 = scanner.nextInt();

        String ganador;

        if ((eleccion1 == 0 && eleccion2 == 2) || (eleccion1 == 1 && eleccion2 == 0) || (eleccion1 == 2 && eleccion2 == 1)) {
            ganador = "Jugador 1";
        } else if ((eleccion2 == 0 && eleccion1 == 2) || (eleccion2 == 1 && eleccion1 == 0) || (eleccion2 == 2 && eleccion1 == 1)) {
            ganador = "Jugador 2";
        } else {
            ganador = "Empate";
        }

        System.out.println("El ganador es: " + ganador);
    }
}
