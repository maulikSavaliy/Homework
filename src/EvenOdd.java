import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args)
    {
// create scanner class
        Scanner scanner = new Scanner(System.in);
        //print sentance
        System.out.println("input any number to know even or odd");
        //declate variable
        int number =scanner.nextInt();
        // using a turnery operator
        String evenodd = (number%2)==0? "even" : "odd";
        System.out.println("number is " + evenodd);

    }
}







/* int n = 2;
        if ( n % 2 == 0)
        {
            System.out.println("given number is even");
        }else
        {
            System.out.println("given number is odd");
        }*/