package MidPractise.Array;

import java.util.Scanner;

public class SumAvg {
    public static void main(String[] args) {
        double[] num = new double[5];
        int i;
        double avg, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        for (i = 0; i < num.length; i++) {
            num[i] = sc.nextDouble();
        }
        for (i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println("Sum =" + sum);
        avg = sum / 5;
        System.out.println("Average =" + avg);

        double max = num[0];
        double min = num[0];
        for (i = 1; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        System.out.println("MAXIMUM=" + max);

        for (i = 1; i < num.length; i++) {
            if (min > num[i]) {
                min = num[i];
            }
        }
        System.out.println("Minimum=" + min);

    }
}
