package MidPractise;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class BitwiseOperator {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter value of A:");
        a=input.nextInt();
        System.out.println("Enter the value of B: ");
        b=input.nextInt();
          
        c=a&b;
        System.out.println("And: "+c);
        c=a|b;
        System.out.println("Or:"+c);
        c=a^b;
        System.out.println("Ex-or:"+c);

        c=a>>3;
        System.out.println("A>>:"+c);

        c=a<<3;
        System.out.println("A<<:"+c);
    }
}
