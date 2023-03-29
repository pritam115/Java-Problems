package MidPractise;
import java.util.Scanner;
public class Pattern1 {
   public static void main(String[] args) {
    int row,col,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of lines");
    n=sc.nextInt();
    for(row=1;row<=n;row++){
        for(col=1;col<=row;col++){
            System.out.print(" "+col);
        }
        System.out.println();
    }

   } 
}
