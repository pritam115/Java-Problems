package MidPractise;
import java.util.Scanner;
public class InverseTriangle {
    public static void main(String[] args) {
        int row,col,n=5;

        for(row=5;row>=1;row--){
            for(col=1;col<=row;col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
