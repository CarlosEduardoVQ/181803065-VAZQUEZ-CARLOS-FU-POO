
import java.util.Scanner;

public class AreaC {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double area;

        System.out.println("Asigne el lado de cuadrado: ");
        double a = sc.nextDouble();
        area = a * a;
        System.out.print("El area del cuadrado es: " + area);

    }
}
