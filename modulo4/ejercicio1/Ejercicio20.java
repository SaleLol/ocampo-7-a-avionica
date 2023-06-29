import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        int contador = 1;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        Random random = new Random();

        do {
            int numero = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
            System.out.println("Número " + contador + ": " + numero);
            
            if (numero > maximo) {
                maximo = numero;
            }
            
            if (numero < minimo) {
                minimo = numero;
            }
            
            contador++;
        } while (contador <= 10);

        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
    }
}
