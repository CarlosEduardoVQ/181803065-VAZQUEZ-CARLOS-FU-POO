
import java.util.Scanner;

public class PromedioC {
    
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
        
    double calif;
    double suma=0;
    double promedio;
    int c;

    for(c=1;c<=4;c++){
        
    System.out.print("Asigna la calificación: " + c +":");
        calif = dato.nextFloat();
        suma = suma + calif;

    promedio = suma/(c-1);
    System.out.println("El promedio de la calificación es: " + promedio);

    }
}        
	

