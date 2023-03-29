package MidPractise;
import java.util.Scanner;
public class Factorial1 {
    public static void main(String[] args) {
        int fact=1,i,n;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number that you wants to determine the factorial:");
        n=input.nextInt();
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial:"+fact);
    }
}
