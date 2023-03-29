package MidPractise;
import java.util.Scanner;
public class Prime {
   public static void main(String[] args) {
    int i,n,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any positive number : ");
    n=sc.nextInt();

    if(n==0||n==1){
        System.out.println("NOT PRIME NUMBER ");
    } 
else{
    for(i=2;i<n;i++)
    {
        if(n%i==0)
        {
            count++;
            break;
        }
    }
    if(count==0){
        System.out.println("PRIME NUMBER");
    }
    else{
        System.out.println("NOT PRIME NUMBER");
    }
}
    
}
}
