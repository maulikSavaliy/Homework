import java.util.Scanner;

public class InterChangeValue {
    public static void main(String[] args) {
        // create scanner class
        Scanner scanner=new Scanner(System.in);
        // declare a variable
        int A,B,C;
        System.out.println("input any mumber :");
         A=scanner.nextInt();
        System.out.println("input any mumber :");
         B=scanner.nextInt();
        C=A;
        A=B;
        B=C;
        System.out.println("your value is interchange " + A + " and " + B );
    }
}
