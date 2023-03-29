package MidPractise;
import java.util.Scanner;
public class SumOfOddNumbers2 {
    public static void main(String[] args) {
        int i,m,n,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter M:");
    m=sc.nextInt();
    System.out.println("Enter N: ");
    n=sc.nextInt();

    for(i=m;i<=n;i=i+2){
        sum=sum+i;
    }
       System.out.println("Sum="+sum);

    }

    
}
