package MidPractise;
import java.util.Scanner;
public class LogicalAndAssignemmnt {
    public static void main(String[] args) {
        char ms,eng;
        Scanner input=new Scanner(System.in);
        System.out.println("Have you passed your Masters degree?");
        ms=input.next().charAt(0);
        System.out.println("Are you fluent in English? ");
        eng=input.next().charAt(0);
        if(ms=='y'||ms=='Y' && eng=='y'||eng=='Y')
        {
            System.out.println("You are eligible for the interview.");
        }
        else {
            System.out.println("you are not eligible for the job !!!");
        }

    }
}
