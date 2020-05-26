
import java.util.Scanner;

public class ResultadoE {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);

        double calif1, calif2, calif3, pro;

        System.out.print("Ingrese la primera calificación del alumno: ");
        calif1 = dato.nextInt();
        System.out.print("Ingrese la segunda calificación del alumno: ");
        calif2 = dato.nextInt();
        System.out.print("Ingrese la tercera calificación del alumno: ");
        calif3 = dato.nextInt();

        pro = (double) ((calif3 * 0.30) + (calif1 * 0.35) + (calif2 * 0.35));
        

        if (pro >= 7) {
            System.out.print("El alumno a acreditado,");
        } else {
            System.out.print("El alumno no a acreditado,");
        }
        System.out.println("el promedio final es: " + pro);
    }

}
