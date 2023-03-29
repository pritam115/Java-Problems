package MidPractise;
import java.util.Scanner;
public class Armstron {
    public static void main(String[] args) {
        int sum=0,num,r,temp;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any number: ");
        num=input.nextInt();

        temp=num;
        while(temp!=0){
            r=temp%10;
            sum=sum+r*r*r;
            temp=temp/10;
        }
      
        if(sum==num)
        {
            System.out.println(num+" is a Armstrong number");
        }
        else 
        System.out.println(num+" is not a Armstrong number");

    }
}
