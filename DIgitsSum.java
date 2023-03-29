package MidPractise;
import java.util.Scanner;
public class DIgitsSum {
    public static void main(String[] args) {
        int temp,sum=0,n,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any nnumber: ");
        n=sc.nextInt();

        temp=n;

        while(temp!=0){
            r=temp%10;
            sum=sum+r;
            temp=temp/10;
        }
        System.out.println("Sum of digits: "+sum);
    }
}
