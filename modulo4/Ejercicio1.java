import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese la primera variable: ");
        int var1 = entrada.nextInt();
        
        System.out.print("Ingrese la segunda variable: ");
        int var2 = entrada.nextInt();
        
        System.out.print("Ingrese la tercera variable: ");
        int var3 = entrada.nextInt();
        
        int promedio = (var1 + var2 + var3) / 3;
        
        if (promedio >= 7) {
            System.out.println("APROBADO");
        } else {
            System.out.println("A DICIEMBRE GORDITO");
        }

        entrada.close();
        
    }

}
