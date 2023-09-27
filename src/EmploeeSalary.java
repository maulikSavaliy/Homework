import java.util.Scanner;

public class EmploeeSalary {
    public static void main(String[] args) {
        //scanner class
        Scanner scanner = new Scanner(System.in);
        // declare variable
        int HRA;
        int DA;
        int TA;
        int PF;
        int Grosssalary;
        // print sentence
        System.out.println("Enter employee name :");
        String name =scanner.nextLine();
        System.out.println("Enter employee Id :");
        int id=scanner.nextInt();
        System.out.println("Employee basic salary :");

        int salary=scanner.nextInt();
        HRA=(salary*10)/100;
        System.out.println("HRA :" + HRA);
        DA=(salary*8)/100;
        System.out.println("DA :" + DA);
        TA=(salary*9)/100;
        System.out.println("TA :" + TA);
        PF=(salary*20)/100;
        System.out.println("PF :" + PF);
        Grosssalary=salary+HRA+DA+TA-PF;
        System.out.println("Grosssalary :" + Grosssalary);
    }
}

