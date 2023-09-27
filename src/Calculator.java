import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //create scanner class
        Scanner scanner=new Scanner(System.in);
        // print syntex
        System.out.println("Input any symbol ' + ',' - ',' * ',' / ' to calculate");
        String symbol=scanner.nextLine();
        System.out.println("input first number");
        // declare a variable
        int num1=scanner.nextInt();
        System.out.println("input second number");
        int num2=scanner.nextInt();
// using swith mathod
        switch (symbol){
            case "+":
                System.out.println("Addition :" + (num1+num2));
                break;
            case "-":
                System.out.println("Subtraction :" + (num1-num2));
                break;
            case "*":
                System.out.println("Multiplication :"+ (num1*num2));
                break;
            case "/":
                System.out.println("Division : " + (num1/num2));
                break;
        }
    }
}
