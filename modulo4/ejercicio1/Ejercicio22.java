public class CalculadoraSueldoNeto {
    public static void main(String[] args) {
        int contador = 1;
        
        while (contador <= 10) {
            char categoria = obtenerCategoriaAleatoria();
            double sueldoBruto = obtenerSueldoAleatorio();
            int antiguedad = obtenerAntiguedadAleatoria();
            
            double sueldoNeto = sueldoBruto;
            
            if (antiguedad >= 1 && antiguedad <= 5) {
                sueldoNeto += sueldoBruto * 0.05;
            } else if (antiguedad >= 6 && antiguedad <= 10) {
                sueldoNeto += sueldoBruto * 0.10;
            } else if (antiguedad > 10) {
                sueldoNeto += sueldoBruto * 0.30;
            }
            
            switch (categoria) {
                case 'A':
                    sueldoNeto += 1000;
                    break;
                case 'B':
                    sueldoNeto += 2000;
                    break;
                case 'C':
                    sueldoNeto += 3000;
                    break;
            }
            
            if (sueldoNeto >= 0) {
                System.out.println("Sueldo neto " + contador + ": " + sueldoNeto);
                contador++;
            }
        }
    }
    
    public static char obtenerCategoriaAleatoria() {
        int numeroAleatorio = (int) (Math.random() * 3);
        
        switch (numeroAleatorio) {
            case 0:
                return 'A';
            case 1:
                return 'B';
            case 2:
                return 'C';
            default:
                return 'A';
        }
    }
    
    public static double obtenerSueldoAleatorio() {
        return Math.random() * 10000;
    }
    
    public static int obtenerAntiguedadAleatoria() {
        return (int) (Math.random() * 15) + 1;
    }
}
