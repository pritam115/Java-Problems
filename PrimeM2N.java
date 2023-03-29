package MidPractise;
import java.util.Scanner;
public class PrimeM2N {
    public static void main(String[] args) {
        int m,n,i,j,count=0,TotalPrime=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter initial number :");
       m=sc.nextInt();
       System.out.println("Enter ending number: ");
       n=sc.nextInt();

       for(i=m;i<=n;i++){
        for(j=2;j<=i-1;j++){
            if(i%j==0)
            {
                count++;
                break;
            }
            }
            if(count==0){
                System.out.println(i+" is prime number");
                TotalPrime++;       
        }
        count=0;
       }
       System.out.println("Total prime number:"+TotalPrime);


    }
}
