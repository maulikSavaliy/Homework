import java.util.Scanner;

public class AvarageValue {
    // main method
    public static void main(String[] args) {
        // create scanner class
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input any number : ");
        // declare variable
         int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int d=scanner.nextInt();
        int e=scanner.nextInt();
        int total = (a+b+c+d+e)/5;
        System.out.println("Average of value : "+ total);
    }
}
