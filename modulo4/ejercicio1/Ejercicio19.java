import java.util.Random;

public class Ejercicio19 {
    public static void main(String[] args) {
        int contador = 1;
        int suma = 0;
        double promedio = 0;
        Random random = new Random();

        while (contador <= 10) {
            int numero = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
            System.out.println("Número " + contador + ": " + numero);
            suma += numero;
            contador++;
        }

        promedio = (double) suma / 10;

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}



