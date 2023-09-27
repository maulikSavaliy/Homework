import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        //create a scanner class
        Scanner scanner=new Scanner(System.in);
        //declare a variable
        int commision1;
        int commision2;
        int commision3;
        int commision4;
        int commision5;
        //print a sentance
        System.out.println("Seller's name :");
        String name=scanner.nextLine();
        System.out.println("Sales id : ");
        int id=scanner.nextInt();
        System.out.println("Sales amount : ");
        int amount=scanner.nextInt();
        System.out.println("salary basic : ");
        int salary=scanner.nextInt();
        commision1=(amount*35)/100;
        commision2=(amount*20)/100;
        commision3=(amount*10)/100;
        commision4=(amount*5)/100;
        commision5=(amount*2)/100;
        //using a if else statement find a commition of seles
        if (amount>=50000){
            System.out.println("commission is :" + commision1);
        }else if(amount>=30000) {
            System.out.println("commission is :" + commision2);
        } else if (amount>=20000) {
            System.out.println("commission is :" + commision3);
        } else if (amount>=10000) {
            System.out.println("commission is :" + commision4);
        }else {
            System.out.println( "commission is :" + commision5);
        }


    }
}
