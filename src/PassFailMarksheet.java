import java.util.Scanner;

public class PassFailMarksheet {
    public static void main(String[] args) {
        //create scanner class
        Scanner scanner = new Scanner(System.in);
        //print a sentance
        System.out.println("student name :");
        //declare a variable
        String name =scanner.nextLine();
        System.out.println("Roll number : ");
        int rollnumber=scanner.nextInt();
        System.out.println("Please Enter maths marks");
        int maths=scanner.nextInt();
        System.out.println("Please Enter english marks");
        int english=scanner.nextInt();
        System.out.println("Please Enter science marks");
        int science=scanner.nextInt();
        System.out.println("total matks :" );
        int total=maths+science+english;
        System.out.println(total);
        System.out.println("persentage : ");
        double persentage=total/3;
        System.out.println(persentage);
        // use if else statement to given condition to each subject pass
        if (maths<=35){
            System.out.println("Fail because maths mark not match our criteria");
        }else if (english<=35){
            System.out.println("Fail because english mark not match our criteria");
        }else if (science<=35){
            System.out.println("Fail because science mark not match our criteria");
        }else if (persentage>=80){
            System.out.println("A+");
            System.out.println("pass");
        } else if (persentage>=60) {
            System.out.println("A");
            System.out.println("pass");
        } else if (persentage>=50) {
            System.out.println("B");
            System.out.println("pass");
        } else if (persentage>=35) {
            System.out.println("C");
            System.out.println("pass");
        }else
        {
            System.out.println("fail");
        }


    }

}
