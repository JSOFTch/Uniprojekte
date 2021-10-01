package kap1;
import java.util.Scanner;


/*
*****************
*Bruchrechner
*
* 
*
*
*Jara Zihlman
*Vithusan Ramalingam
*Jan Ellenberger
*
*
*
*
*****************
*/





public class Bruchrechner {

    static Scanner scanner1 = new Scanner(System.in);
    public static double a;
    public static double b;


    public static void main(String[] args) {

        System.out.println("Geben Sie einen Ganzzahligen Zähler ein:");

        a = scanner1.nextInt();

        System.out.println("Geben Sie einen Ganzzahligen Nenner ein:");
        b = scanner1.nextInt();

        ScanDivisor();

    }
 

    public static void  ScanDivisor() {

        if (b == 0) {
            System.out.println("Diese Eingabe ist ungültig, versuchen Sie es nochmal mit einer Zahl > 0");
            ScanDivisor();

        }else {
            int A = (int) (a); int B = (int) (b);
            System.out.println( A + " / " + B + " = " + a/b);
            
            System.out.print("Ergebniss: " + A/B +  " Rest: " + a%b);
        }
            
    }

}
