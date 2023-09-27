import java.util.Scanner;

public class MarkSheet {
    public static void main(String[] args) {
        // create scanner class
        Scanner scanner = new Scanner(System.in);
        //print sentance
        System.out.println("student name :");
        //declare variabel
        String name =scanner.nextLine();
        System.out.println("Roll number : ");
        //declare variabel
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
        System.out.println(persentage+"%");
        //using if else statement put condition og pass or grade
        if (persentage>=80)
        {
            System.out.println("A+");
            System.out.println("Pass");
        }else if (persentage>=60)
        {
            System.out.println("A");
            System.out.println("Pass");
        }else if (persentage>=50)
        {
            System.out.println("B");
            System.out.println("Pass");
        }else if (persentage>=35)
        {
            System.out.println("c");
            System.out.println("Pass");
        }else
        {
            System.out.println("fail");
        }

    }
}
