package MidPractise;
import java.util.Scanner;
public class PrimeNumber {
public static void main(String[] args) {
    int n,i,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any positive number : ");
    n=sc.nextInt();
    for(i=2;i<n;i++){
        if(n%i==0){
            count++;
            break;
        }
    }
    if(count==0)
    {
        System.out.println("Prime Number");
    }
    else 
    System.out.println("Not a prime number ");
}    
}
