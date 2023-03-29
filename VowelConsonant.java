package MidPractise;
import java.util.Scanner; 

public class VowelConsonant {
    public static void main(String[] args) {
        char c;
        Scanner ch=new Scanner(System.in);
        System.out.println("Enter any letter: ");
        c=ch.next().charAt(0);
      if(c=='a' || c=='A')
      {
        System.out.println("vowel");
      }
      else if(c=='e' || c=='E')
      {
        System.out.println("vowel");
      }
      else if(c=='i' || c=='I')
      {
        System.out.println("vowel");
      }
     else if(c=='o' || c=='O')
      {
        System.out.println("vowel");
      }
      else if(c=='u' || c=='U')
      {
        System.out.println("vowel");
      }
      else {
        System.out.println("consonant!!");
      }

    }
    
}
