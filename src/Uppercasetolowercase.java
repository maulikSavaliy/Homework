import java.util.Scanner;

public class Uppercasetolowercase {
    public static void main(String[] args) {
        //create a new scanner class
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input any alphabet uppercase to convert in lowercase :");
        String alpha=scanner.nextLine();
        alpha=alpha.toLowerCase();
        System.out.println(alpha);
    }
    }

