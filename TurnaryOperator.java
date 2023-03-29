package MidPractise;
import java.util.Scanner;
public class TurnaryOperator {
   public static void main(String[] args) {
    int n1,n2,large;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter two numbers :");
    n1=input.nextInt();
    n2=input.nextInt();

    large=(n1>n2)?n1:n2;
    System.out.println("Large number is: "+large);

   } 
}
