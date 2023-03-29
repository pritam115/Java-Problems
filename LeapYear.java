package MidPractise;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int y;
        Scanner yr=new Scanner(System.in);
        System.out.println("Enter a year :");
        y=yr.nextInt();
        if(y%400==0){
            System.out.println("LEAP YEAR");
        }
        else if(y%4==0 && y%100!=0)
        {
            System.out.println("LEAP YAER");
        }
        else{
            System.out.println("NOT A LEAP YEAR ");
        }
    }
}
