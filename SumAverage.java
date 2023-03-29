package MidPractise.Array;
import java.util.Scanner;
public class SumAverage {
    public static void main(String[] args) {
        double []num=new double[5];
        int i;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter five numbers: ");
      for(i=0;i<num.length;i++){
        num[i]=sc.nextDouble();
      }
       double sum=0;
       for(i=0;i<num.length;i++){
        sum=sum+num[i];
       }
       System.out.println("Sum = "+sum);
       
       double avg=sum/5;
       System.out.println("Average value is = "+avg);


    }
}
