public class TipoVariable {
    public static void main(String arg[]){
        //
        /*
        FUERTEMENTE TIPADO
            Debemos declarar el tipo de variable que es y esta siempre en el programa mantendra ese tipo
        
            Una variable no puede pasar facilmente  a ser de otro tipo
            Castear (convertir una variable de un tipo a otro).
        */
        // Tipos Númericos
        int a=10,b=2;
   
        //Operaciones Aritméticas
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        
        //Tipos Flotante (Se agrega "f").
        float pi=3.14f; 
        double pi2=3.14;
        
        //Cambios de Variables.
        boolean bandera=true;
        
        //Ingresar Caracteres
        char letra='a';
        String palabra="Puedes poner un mensaje largo";
        
        System.out.println(palabra);
        
        //concatenar
        System.out.println(palabra+ "y esta es un prueba de ello");
        
        System.out.println("Este es el valor de pi"+pi);
        
        System.out.println("Este es el valor del circulo"+pi+a);
        
    }
}