
import java.util.Scanner;


public class CalificacionF {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        
        double cues, prat, asis, calif;
         
        
        System.out.print("Asigne la ponderación cuestionario: ");
        cues = dato.nextDouble();
        System.out.print("Asigne la ponderación practicas y tareas : ");
        prat = dato.nextDouble();
        System.out.print("Asigne la ponderación asistencia y participaión: ");
        asis = dato.nextDouble();
        
        
        calif = ((cues*0.04)+(prat*0.04)+(asis*0.02))*100;
        System.out.print("La calificación final es: " + calif ) ;
        
    }
    
}
