import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
En este programa, se solicita al usuario que ingrese un número y se almacena en la variable numero. Luego, se muestra en pantalla la tabla de multiplicar del número ingresado utilizando un bucle for.

El bucle for itera desde i = 1 hasta i <= 10, multiplicando el número ingresado por cada valor de i y mostrando el resultado en cada iteración.

Recuerda que para ejecutar este programa, necesitarás tener Java instalado en tu computadora y compilarlo adecuadamente antes de ejecutarlo.






