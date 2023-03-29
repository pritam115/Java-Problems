package MidPractise;
import java.util.Scanner;
public class ArmstrongMtoN {
    public static void main(String[] args) {
        int m,n,i,sum=0,temp,r,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Initial Number: ");
        m=sc.nextInt();
        System.out.println("Enter ending number: ");
        n=sc.nextInt();
        for(i=m;i<=n;i++){
            temp=i;
            while(temp!=0){
                r=temp%10;
                sum=sum+r*r*r;
                temp=temp/10;
            }
            if(i==sum){
                System.out.println(i+" ");
                count++;
            }
            sum=0;

        }
        System.out.println("Total Armsrong number :"+count);

    }
}
