package MidPractise.Array;

public class Output {
    public static void main(String[] args) {

        int[][] A = new int[4][5];
        int i, j;
        int k = 0;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                A[i][j] = k;
                k++;
            }
        }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(" " + A[i][j]);
            }
            System.out.println();
        }

    }
}
