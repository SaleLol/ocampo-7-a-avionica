public class CaracteristicasAuto {
    public static void main(String[] args) {
        char clase = 'b';

        if (clase == 'a') {
            System.out.println("Clase A: 4 ruedas y un motor.");
        } else if (clase == 'b') {
            System.out.println("Clase B: 4 ruedas, un motor, cierre centralizado y aire acondicionado.");
        } else if (clase == 'c') {
            System.out.println("Clase C: 4 ruedas, un motor, cierre centralizado, aire acondicionado y airbag.");
        } else {
            System.out.println("Clase no válida.");
        }
    }
}
