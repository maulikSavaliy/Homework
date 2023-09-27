import java.util.Scanner;

public class EligibleForVot {
    public static void main(String[] args) {
        // scanner class
        Scanner scanner=new Scanner(System.in);
        // print sentence
        System.out.println("Input voter's age to know eligible or not :");
        //declare variable
        int number=scanner.nextInt();
        //using a if else statment
        if(number>=18){
            System.out.println("Eligible for vote");
        }else {
            System.out.println("NOT Eligible for vote");
        }
    }
}
