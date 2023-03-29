package MidPractise;
import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        int row,col,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers of line: ");
        n=sc.nextInt();

        for(row=n;row>=1;row--){
            for(col=1;col<=row;col++){
                System.out.print(" "+col);
            }
            System.out.println();
        }
    }
}
