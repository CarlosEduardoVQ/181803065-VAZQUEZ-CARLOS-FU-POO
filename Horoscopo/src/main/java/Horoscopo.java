
import java.util.Scanner;

public class Horoscopo{

    public static void main(String[] args) {
        int dia, mes;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Introduce tu dia: ");
        dia = Integer.parseInt(Sc.nextLine());
        System.out.print("Introduce el dia de tu mes: ");
        mes = Integer.parseInt(Sc.nextLine());
        System.out.print("tu signo es: " + dato(dia,mes));
    }

    public static String dato(int dia, int mes) {
        if (mes == 1) {
            //enero
            if (dia >= 21) {
                return "acuario";
            } else {
                return "capricornio";
            }
        }
        if (mes == 2) {
            //febreo
            if (dia >= 19) {
                return "piscis";
            } else {
                return "acuario";
            }
        }
        if (mes == 3) {
            //marzo
            if (dia >= 20) {
            
                return "aries";
            } else {
                return "piscis";
            }
        }
        if (mes == 4) {
            //abril
            if (dia >= 20) {
                return "tauro";
            } else {
                return "Aries";
            }
        }
        if (mes == 5) {
            //mayo
            if (dia >= 21) {
                return "geminis";
            } else {
                return "tauro";
            }
        }
        if (mes == 6) {
            //junio
            if (dia >= 20) {
                return "cancer";
            } else {
                return "geminis";
            }
        }
        if (mes == 7) {
            //julio
            if (dia >= 22) {
                return "leo";
            } else {
                return "cancer";
            }
        }
        if (mes == 8) {
            //agosto
            if (dia >= 21) {
                return "virgo";
            } else {
                return "leo";
            }
        }
        if (mes == 9) {
            //septiembre
            if (dia >= 22) {
                
                return "libra";
            } else {
                
                return "virgo";
            }
        }
        if (mes == 10) {
            //octubre
            if (dia >= 22) {
                return "escorpion";
            } else {
                return "libra";
            }
        }
        if (mes == 11) {
            //novimbre
            if (dia >= 21) {
               return "sagitario";
            } else {
                return "escorpion";
            }
        }
        if (mes == 12) {
            //diciembre
            if (dia >= 21) {
                return "capricornio";
            } else {
                return "sagitario";
            }
        }
        
    }
}