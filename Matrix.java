package MidPractise.Array;

import java.text.CollationElementIterator;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        int[][] C= new int[2][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements for A matrix: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d] [%d]=", row, col);
                A[row][col] = sc.nextInt();
            }
        }
        System.out.println("Enter elements for B matrix: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d] [%d]=", row, col);
                B[row][col] = sc.nextInt();
            }
        }
        System.out.print("A=");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t  " + A[row][col]);
            }
            System.out.println();
            System.out.println();
        }
        System.out.print("B=");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t  " + B[row][col]);
            }
            System.out.println();
            System.out.println();
        }
         System.out.println("A+B=");
         for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                C[row][col]=A[row][col]+B[row][col];
                System.out.print("  " +(C[row][col]));
            }
            System.out.println();

         }
       



    }
}
