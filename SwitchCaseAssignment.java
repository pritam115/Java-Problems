package MidPractise;
import java.util.Scanner;
public class SwitchCaseAssignment {
   public static void main(String[] args) {
    int digit;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter any digit: ");
    digit=input.nextInt();
     switch(digit){
        case 1:
        System.out.println("Bangla");
        break;

        case 2:
        System.out.println("Hindi");
        break;
        case 3:
        System.out.println("Urdu");
        break;
        default:
        System.out.println("English");
     }

   } 
}
