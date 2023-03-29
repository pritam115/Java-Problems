package MidPractise;
import java.util.Scanner;
public class TriangleStar {
  public static void main(String[] args) {
    int n,row,col;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter value of N: ");
    n=input.nextInt();

    for(row=1;row<=n;row++){
        for(col=1;col<=row;col++){
            System.out.print(" * ");
        }
        System.out.println();
    }

  }  
}
