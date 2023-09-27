import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class CityName {
    public static void main(String[] args) {
        //scanner class
        Scanner scanner=new Scanner(System.in);
        System.out.println("input alphabet to know city name :");
        // declare variable
        String alpha=scanner.nextLine();
        //switch mathod to find city name
        switch (alpha){
            case "a":
                System.out.println(" Ahmedabad ");
                break;
            case "b":
                System.out.println(" Baroda ");
                break;
            case "c":
                System.out.println(" Surat ");
                break;
            case "d":
                System.out.println(" Rajkot");
                break;
            case "e":
                System.out.println("Banglore");
                break;
            default:
                System.out.println("input Alphabet a to e");
                break;
        }





    }
}
