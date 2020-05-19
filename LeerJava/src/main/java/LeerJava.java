
import java.util.Scanner;

public class LeerJava {
    public static void main (String args[])
    {
        Scanner leer=new Scanner(System.in);
      
        System.out.println("Dame un número");
        int numero=leer.nextInt();
        System.out.println("El número leído es: "+numero);
        
        System.out.println("Dame un numero");
        double numero2=leer.nextDouble();
        System.out.println("El numero leido es:"+numero2);
        
        String nombre=leer.nextLine();
        
        System.out.println("Dame un nombre completo");
        String cadena =leer.nextLine();
        System.out.println("El nombre leido es:"+cadena);
        
    }
}
        
  
