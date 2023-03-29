package MidPractise;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int i,n,first=0,second=1,fibo;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many numbers you want to show: ");
        n=sc.nextInt();

        System.out.print("  "+first);
        System.out.print("  "+second);

        for(i=3;i<=n;i++)
        {
            fibo=first+second;
            System.out.print("  "+fibo);
            first=second;
            second=fibo;
        }
        
    }
}
