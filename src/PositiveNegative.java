import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        //create new scanner class
        Scanner scanner =new Scanner(System.in);
        //print a sentance
        System.out.println("Input value to find positive or negative or zero : ");
        // declare a variable
        int a=scanner.nextInt();
        //use if else statement and give condition to find positive or nagetive number
        if (a>0){
            System.out.println("number " +a + " is positive");
        } else if (a<0) {
            System.out.println("number" + a + " is negative");
        }else {
            System.out.println("number is zero");
        }

    }
}
