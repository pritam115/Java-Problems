package MidPractise;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        int n,temp,sum=0,r;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter any number ;");
       n=sc.nextInt();

       temp=n;
       while(temp!=0)
       {
        r=temp%10;
        sum=sum+r;
        temp=temp/10;
       }
      System.out.println("SUM OF THE DIGITS: "+sum);
    }
}
