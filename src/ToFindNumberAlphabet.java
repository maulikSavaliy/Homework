import java.util.Scanner;

public class ToFindNumberAlphabet {
    public static void main(String[] args) {
        //create  a new scanner class
        Scanner scanner=new Scanner(System.in);
        //print a sentance
        System.out.println("Enter any value to find out it is number or alphabet or symbol :");
        //declare a variable
        char value=scanner.next().charAt(0);
        //using a if else statement to find a number or char or symbol
        if (value>='a'&& value<='z' || value>='A'&& value<='Z'){
            System.out.println(value + " is alphabet ");
        } else if (value>=0 && value<=9) {
            System.out.println(value + " is number");
        }else {
            System.out.println(value + " is symbol ");
        }
    }
    }

