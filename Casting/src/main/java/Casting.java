
public class Casting {
    public static void main(String[] args) {
        
        //Casting Explícito.
        
        short a=1;
        int b=15;
        a= (short) b;
        
        //Casting Implícito
        float c=4.5f;
        double d=5;
        d=c;
        
        //Que pasa con los decimales flotantes cuando casteo de flotante a double a entero.
        //R= Los trunca.
        
        double pi=3.5416;
        int duda  = (int )pi;
        System.out.println("Imprime el valor de duda: " + duda);
        
        //Ejemplo de un código java casting explícito usando 2 metodos
        
        String valor = "15";
        int n = Integer.parseInt(valor);
        n = duda;
        System.out.println(n);
     
        //cliclo For
        for (int 1 = 0; i < 10; i++) {
        System.out.println(i + " - ");
        //ciclo while
        int j= i;
    }
        
   }
}
//Paradigma de programación.
//Poo no es un leguaje de programación.
//Casting convertir una variable de un tipo a otro
// tipos de casting hay 2 explícito y implícito
//Implicito es cuando se convierte una variable de mayor jerarquia a menor. (se genera autómatica).
//Explicito es cuando se convierte una variable de menor jerarquia a mayor

// Se requiere un programa que dado el día de nacimiento y el mes de nacimiento determine cual es su oroscopo.
// Realize un programa para adivinar un número. el usuario ingreasara un número y el programa debera determinar si es el nuemro a adivinar, si el numero esta por arriba por abajo de adivinar.

