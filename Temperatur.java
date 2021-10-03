import java.util.Scanner;

public class temperature{

    public static int t;

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        final int COLD_LIMIT = 15; //untere Temperaturgrenze
        final int WARM_LIMIT = 24; //obere Temperaturgrenze

        System.out.println("Geben Sie die Temperatur ein");
        t = scanner.nextInt(); //
        
        
        if (t <= COLD_LIMIT) {
            System.out.print("Kalt");          
        } 
        else if(t >= WARM_LIMIT) {
            System.out.print("Angenehm");          

        }

        else{
            System.out.print("Warm");          

        }


        
    }



}