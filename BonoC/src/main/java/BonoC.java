
import java.util.Scanner;


public class BonoC {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        
        double direc, comi, clima, bita, fin;
        
        System.out.print("Asigne bono directo: ");
        direc =dato.nextDouble();
        System.out.print("Asigne bono comisión: ");
        comi=dato.nextDouble();
        System.out.print("Asigne bono clima laboral: ");
        clima=dato.nextDouble();
        System.out.print("Asigne bono bitacora: ");
        bita = dato.nextDouble();
        
        fin=((direc*0.04)+(comi*0.01)+(clima*0.01)+(bita*0.04))*100;
        
        System.out.println("Las calificaciones asigandas son: " + direc + "  " + comi + "  " + clima + " " + bita );
        System.out.println("El Bono Final es: " + fin  );
        
    }
    
}
