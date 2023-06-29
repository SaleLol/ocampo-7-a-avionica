import java.util.Scanner;

public class EvaluacionAlumno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la primera nota: ");
        int nota1 = scanner.nextInt();

        System.out.print("Ingrese la segunda nota: ");
        int nota2 = scanner.nextInt();

        System.out.print("Ingrese la tercera nota: ");
        int nota3 = scanner.nextInt();

        // Usando la estructura if
        int sumaPares = 0;
        int contadorPares = 0;

        if (nota1 % 2 == 0) {
            sumaPares += nota1;
            contadorPares++;
        }

        if (nota2 % 2 == 0) {
            sumaPares += nota2;
            contadorPares++;
        }

        if (nota3 % 2 == 0) {
            sumaPares += nota3;
            contadorPares++;
        }

        double promedio = (nota1 + nota2 + nota3) / 3.0;

        if (promedio >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
            System.out.println("Suma de los valores pares: " + sumaPares);
        }

        // Algoritmo alternativo sin utilizar la estructura if
        int sumaParesAlgoritmo = ((nota1 % 2 == 0) ? nota1 : 0) + ((nota2 % 2 == 0) ? nota2 : 0) + ((nota3 % 2 == 0) ? nota3 : 0);
        int contadorParesAlgoritmo = ((nota1 % 2 == 0) ? 1 : 0) + ((nota2 % 2 == 0) ? 1 : 0) + ((nota3 % 2 == 0) ? 1 : 0);

        double promedioAlgoritmo = (nota1 + nota2 + nota3) / 3.0;

        if (promedioAlgoritmo >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
            System.out.println("Suma de los valores pares (Algoritmo): " + sumaParesAlgoritmo);
        }
    }
}
