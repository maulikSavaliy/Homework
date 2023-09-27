import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // create scanner class
        Scanner scanner=new Scanner(System.in);
        //print a sentence
        System.out.println("Enter year to know is leapyear or not :");
        // declare variable
        int year=scanner.nextInt();
        // use of if else statement
       if ((year%4==0)&&(year%100!=0)||year%400==0)
       {
           System.out.println(year + " is leapyear");
       }else
       {
           System.out.println(year + " is not leapyear");
       }
    }
}
