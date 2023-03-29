package MidPractise.Array;

public class TwoD {
    public static void main(String[] args) {
        int[][] num = new int[2][3];

        num[0][0] = 10;
        num[0][1] = 20;
        num[0][2] = 30;
        num[1][0] = 100;
        num[1][1] = 200;
        num[1][2] = 300;

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" " + num[row][col]);
            }
            System.out.println();
        }

    }

}
