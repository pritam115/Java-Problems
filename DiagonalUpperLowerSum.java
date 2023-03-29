package MidPractise.Array;

import java.util.Scanner;

public class DiagonalUpperLowerSum {
    public static void main(String[] args) {

        int[][] A = new int[3][3];
        int diagonal = 0, upper = 0, lower = 0;
        int row, col;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements for Matrix: ");
        for (row = 0; row < 3; row++) {
            for (col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d]=", row, col);
                A[row][col] = sc.nextInt();
            }
        }
        System.out.println("A= ");
        for (row = 0; row < 3; row++) {
            for (col = 0; col < 3; col++) {
                System.out.print("  " + A[row][col]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for (row = 0; row < 3; row++) {
            for (col = 0; col < 3; col++) {
                if (row == col) {
                    diagonal = diagonal + A[row][col];
                }
            }
        }
        for (row = 0; row < 3; row++) {
            for (col = 0; col < 3; col++) {
                if (row < col) {
                    upper = upper + A[row][col];
                }
            }
        }
        for (row = 0; row < 3; row++) {
            for (col = 0; col < 3; col++) {
                if (row > col) {
                    lower = lower + A[row][col];
                }
            }
        }
        System.out.println("Sum of Diagonals=" + diagonal);
        System.out.println("Sum of upper triangle elements=" + upper);
        System.out.println("Sum of lower triangle elements=" + lower);

    }
}
