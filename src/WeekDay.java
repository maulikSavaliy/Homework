import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input 1 to 7 number to know day name : ");
        int num=scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("Input a valid number");
                break;
        }
    }
}
