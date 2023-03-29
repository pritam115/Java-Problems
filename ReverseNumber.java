package MidPractise;
import java.util.Scanner;
public class ReverseNumber {
   public static void main(String[] args) {
    int temp,sum=0,r,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number : ");
    n=sc.nextInt();

    temp=n;
    while(temp!=0){
        r=temp%10;
        sum=sum*10+r;
        temp=temp/10;
    }
    System.out.println("Reversed NUmber is: "+sum);
   } 
}
