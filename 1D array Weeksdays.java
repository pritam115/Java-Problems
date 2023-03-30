package MidPractise.Array;
import java.util.Scanner;
public class Weeksdays {
    public static void main(String[] args) {
        String[]weekdays=new String[]{"Monday","Tuesday","wednesday","Thursday","Friday","Saturday","Sunday"};
        int daynum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any days between 1-7: ");
        daynum=sc.nextInt();
        for(int i=0;i<weekdays.length;i++) {
            if(daynum==i+1){
                System.out.println("The day is "+weekdays[i]);
            }
        }

    }
}
