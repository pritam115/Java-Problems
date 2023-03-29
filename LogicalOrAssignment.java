package MidPractise;
import java.util.Scanner;
public class LogicalOrAssignment {
    public static void main(String[] args) {
        char c;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Y/y OR N/n:");
        c=input.next().charAt(0);
        if(c=='y' || c=='Y')
        {
            System.out.println("You are a java lover ");
        }
        else if(c=='n'||c=='N')
        {
            System.out.println("You are not a java lover!!");
        }
        else {
            System.out.println("Invalid Input !!!!!");
        }

    }
}
