package MidPractise;
import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        int row,col,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers of line: ");
        n=sc.nextInt();

        for(row=1;row<=n;row++){
            for(col=1;col<=row;col++){
                System.out.print(" "+col%2);
            }
            System.out.println();
        }
    }
}
