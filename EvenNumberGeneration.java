package MidPractise;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class EvenNumberGeneration {
    public static void main(String[] args) {
        int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any postive number : ");
    n=sc.nextInt();
    if(n%2==0){
        System.out.println(n+" is not a prime number");
    }
    else
        System.out.println(n+" is a Prime Number");
    
    }
    
}
