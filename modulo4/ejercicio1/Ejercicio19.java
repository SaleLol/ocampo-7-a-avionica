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
En este programa, se utiliza un ciclo while para generar y mostrar 10 números aleatorios. El contador se inicializa en 1 y se incrementa en cada iteración hasta llegar a 10.

Dentro del ciclo, se genera un número aleatorio utilizando la clase Random. En cada iteración, se muestra el número generado y se acumula en la variable suma.

Después de completar el ciclo while, se calcula el promedio dividiendo la suma entre 10 y se almacena en la variable promedio.



