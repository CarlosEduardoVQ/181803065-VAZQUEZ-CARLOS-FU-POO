
import java.util.Scanner;

public class ConseguirN {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        int num, ale;

        ale = (int) (Math.random() * 101);

        do {

            System.out.println("Asigne un número: ");
            num = dato.nextInt();
            
            if ( num > ale) {
                System.out.println("El numero esta más abajo");
            }
            else if(num<ale) {
                System.out.println("El número esta más arriba ");
            } else {
                System.out.println("El número es Correcto!!");
            }

        } while ( num != ale ); 
    
    }

}
