public class Ejercicio21 {
    public static void main(String[] args) {
        char categoria = 'A';
        int antiguedad = 8;
        double sueldoBruto = 5000.0;
        
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
        
        System.out.println("Sueldo neto: " + sueldoNeto);
    }
}
