import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jugador 1 - Ingrese su elección (0: piedra, 1: papel, 2: tijera): ");
        int eleccion1 = scanner.nextInt();

        System.out.print("Jugador 2 - Ingrese su elección (0: piedra, 1: papel, 2: tijera): ");
        int eleccion2 = scanner.nextInt();

        String ganador;

        if (eleccion1 == eleccion2) {
            ganador = "Empate";
        } else if (eleccion1 == 0 && eleccion2 == 2 || eleccion1 == 1 && eleccion2 == 0 || eleccion1 == 2 && eleccion2 == 1) {
            ganador = "Jugador 1";
        } else {
            ganador = "Jugador 2";
        }

        System.out.println("El ganador es: " + ganador);
    }
}
