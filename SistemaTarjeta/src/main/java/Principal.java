
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        //Declarando al programa que usare un objeto tipo tarjeta
        Tarjetas tarjeta;

        Scanner dato = new Scanner(System.in);
        int nCuenta, nip, opcion;

        System.out.print("Número de Cuenta: ");
        nCuenta = dato.nextInt();

        System.out.print("Nip: ");
        nip = dato.nextInt();

        //Instanciando llamo al metodo verificarCuenta
        tarjeta = new Tarjetas().verificarCuenta(nCuenta, nip);

        do {

            System.out.println("\t\t Elegir una opción de Menu. ");
            System.out.println("\t\t 1.-Hacer un deposito: ");
            System.out.println("\t\t 2.-Hacer un Retiro: ");
            System.out.println("\t\t 3.-Eliminar apartado: ");
            System.out.println("\t\t 4.-Imprimir datos de la cuenta: ");
            System.out.println("\t\t 5.-Salir.");
            System.out.print("Numero de opción: ");

            opcion = dato.nextInt();

            switch (opcion) {

                case 1:
                    //double deposito;
                    System.out.print("Ingrese la cantidad que desea depositar: ");
                    //deposito = dato.nextDouble();
                    //tarjeta.depositar(deposito);
                    tarjeta.depositar(dato.nextDouble());
                    break;
                case 2:
                    double retiro;
                    System.out.print("Ingrese la cantidad que deseas retirar: ");
                    retiro = dato.nextDouble();
                    tarjeta.retirar(retiro);
                    break;
                case 3:
                    System.out.println("Eliminar el apartado.");
                    tarjeta.eliminarApartado();
                    break;
                case 4:
                    System.out.println(tarjeta.toString());

                    break;
                case 5:
                    break;

            }

        } while (opcion != 5);
    }

}

/*
Si se dan cuenta el método solo hizo la accion y no imprimio nada 
Lo que si es que en el modelo vista controlador 
Existe una clase que se usa como intermediaria 
y esa si podrá " imprimir " todo lo que quieran 
 */
