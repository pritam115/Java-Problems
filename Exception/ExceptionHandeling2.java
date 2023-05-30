package Exception;
import java.util.Scanner;
public class ExceptionHandeling2 {
    public static void main(String[] args) {
        int count=1;
        do{
            try{
                Scanner input=new Scanner(System.in);
                System.out.println("Enter num1:");
                int num1=input.nextInt();
                System.out.println("Enter num2:");
                int num2=input.nextInt();
                int result=num1/num2;
                System.out.println("Result:" +num1 +"/" +num2 +"="+result);
                count=2;
            }catch(Exception e){
                System.out.println(e);
                System.out.println("You must enter integer number. Try again !!");
            }
        }while(count==1);
    }
}
