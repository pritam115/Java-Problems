package MidPractise;
import java.util.Scanner;
public class SummationOfFactorial {
    public static void main(String[] args) {
        int fact=1,sum=0,n,i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any positive number: ");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            fact=fact*i;
            sum=sum+fact;
        }
        System.out.println("factorial is :"+fact);
        System.out.println("Summation is :"+sum);
    }
}
