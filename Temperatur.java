package kap1;
import java.util.Scanner;

/****************
*Temperatur
*
*Jara Zihlman (20-117-032)
*Vithusan Ramalingam (21-105-515)
*Jan Ellenberger (21-103-643)
*
*****************
*/

public class Temperatur {

    public static int t;

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        final int COLD_LIMIT = 15; //untere Temperaturgrenze
        final int WARM_LIMIT = 24; //obere Temperaturgrenze

        System.out.println("Geben Sie die Temperatur ein");
        t = scanner.nextInt(); //
        
        
        if (t < COLD_LIMIT) {
            System.out.print("Kalt");          
        } 

        else if(t >= WARM_LIMIT) {
            System.out.print("Warm");          
        }

        else{
            System.out.print("Angenehm");          

        }


        
    }
    
}
