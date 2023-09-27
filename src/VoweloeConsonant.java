import java.util.Scanner;

public class VoweloeConsonant {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input any alphabet to know it is Vowel or Consonant :");
        char alpha=scanner.next().charAt(0);
        if (alpha =='a'|| alpha =='A'){
            System.out.println(alpha +" is Vowel");
        } else if (alpha =='e'|| alpha =='E') {
            System.out.println(alpha +" is Vowel");
        }else if (alpha =='i'|| alpha =='I') {
            System.out.println(alpha + " is Vowel");
        }else if (alpha =='o'|| alpha =='O') {
            System.out.println(alpha + " is Vowel");
        }else if (alpha =='u'|| alpha =='U') {
            System.out.println(alpha + " is Vowel");
        }else {
            System.out.println(alpha + " is Consonant");
        }
    }
}
