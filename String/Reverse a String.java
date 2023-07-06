import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        String str;
        System.out.println("Enter any string : ");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();

        str=str.toLowerCase();

        String strReverse="";
        for(int i=str.length()-1;i>=0;i--){
            strReverse+=str.charAt(i);
        }
        if(str.equals(strReverse)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not palindrome!! ");
        }
    }
}
