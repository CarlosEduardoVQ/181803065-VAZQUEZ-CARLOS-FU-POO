
import java.util.Scanner;


public class PromedioC {
    
    public static void main(String args []){
        Scanner dato = new Scanner(System.in);
        
        double uno,dos,tres,cuatro;
        
        System.out.print("Asigne la primera calificacion: ");
        uno = dato.nextDouble();
        System.out.print("Asigne la segunda calificacion: ");
        dos = dato.nextDouble();
        System.out.print("Asigne la tercera calificacion: ");
        tres = dato.nextDouble();
        System.out.print("Asigne la cuarta calificacion: ");
        cuatro = dato.nextDouble();    
        System.out.print("El promedio de la calificación es: " + (uno + dos + tres + cuatro)/4 );
    }
    
}
