
import java.util.Scanner;

public class Factorial {

    public static void main(String args[]) {
        Scanner dato = new Scanner(System.in);

        int num, fac = 1;

        System.out.print("Ingrese un número para calcular el factorial: ");
        num = dato.nextInt();

        while (num != 0) {

            fac *= num;
            num --;
        }
        System.out.print("El factorial de tu número es: " + fac);
    }

}
