package MidPractise;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        int sum=0,r,num,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number: ");
        num=sc.nextInt();

        temp=num;
        while(temp!=0){
            r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
        }
        if(num==sum){
            System.out.println(num+" is palindrome");
        }
        else
        System.out.println(num+" is not palindrome");
    }
}
