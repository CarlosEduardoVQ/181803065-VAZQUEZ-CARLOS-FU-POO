
import java.util.Scanner;

public class EdadesP {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        int n_alum, edad = 0, suma = 0, pro;

        System.out.print("El número de alumnos es: ");
        n_alum = dato.nextInt();

        for (int a = 0; a < n_alum; a++) {
            
             System.out.println("Ingresa la edad: ");
             edad = dato.nextInt();
             suma +=edad;
             
        }
        pro = suma / n_alum;
        System.out.println("El promedio de la edad es: " + pro);
    }

}
