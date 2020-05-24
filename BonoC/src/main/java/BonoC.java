
import java.util.Scanner;

public class BonoC {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        double direc, comi, clima, bita, fin;

        System.out.print("Asigne bono directo: ");
        direc = dato.nextDouble();
        System.out.print("Asigne bono comisión: ");
        comi = dato.nextDouble();
        System.out.print("Asigne bono clima laboral: ");
        clima = dato.nextDouble();
        System.out.print("Asigne bono bitacora: ");
        bita = dato.nextDouble();

        direc = direc * .40;
        comi = comi * .10;
        clima *= .10;
        bita *= .40;
        fin = direc + comi + bita + clima;
        System.out.println("Las calificaciones asigandas son: " + direc + "  " + comi + "  " + clima + " " + bita);
        System.out.println("El Bono Final es: " + fin);

    }

}
