package MidPractise;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class SumOfTheFactorial2 {
    public static void main(String[] args) {
        int fact=1,sum=0,i,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any positive number : ");
    n=sc.nextInt();
    for(i=1;i<=n;i++){
        fact=fact*i;
        sum=sum+fact;
    }
    System.out.println("Factprial is: "+fact);
    System.out.println("Sum is : "+sum);

    }
    
}
