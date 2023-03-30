package MidPractise;
import java.util.Scanner;
public class EvenNumbFromMToN {
    public static void main(String[] args) {
        int m,n,i,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter M: ");
        m=sc.nextInt();
        System.out.println("Enter N: ");
        n=sc.nextInt();

        for(i=m;i<=n;i++)
        
            if(i%2==0){
                System.out.print("  "+i);
                sum=sum+i;
            }
            System.out.println("\nsum is: "+sum);
        
    }
}
