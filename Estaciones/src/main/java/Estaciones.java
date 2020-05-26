import java.util.Scanner;

public class Estaciones{

    public static void main(String args []) {
        Scanner dato = new Scanner(System.in);

        int fecha;

        System.out.println("Ingrese un número del mes (1-12) para determinar la estación del año: ");
        fecha = dato.nextInt();
        

        switch (fecha) {
            case 3:
            case 4:
            case 5:
                System.out.println("La estación es Primavera");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("La estación es Verano");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("La estación es Otoño");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("La estación es Invierno");
                break;
            default:
                System.out.println("Mes y estacion no existen");
        }
    }
}
