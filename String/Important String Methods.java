
import java.util.Scanner;
public class Methods {
    public static void main(String[] args) {
        // System.out.println("Enter your String: ");
        // Scanner sc=new Scanner(System.in);
        // String str=sc.nextLine();
        String str="    Green University Of Bangladesh";
        System.out.println(str);
        System.out.println("Length: "+str.length());

        System.out.println("To upper: "+str.toUpperCase());

        System.out.println("To lower : "+str.toLowerCase());

        System.out.println("Trimmed version: "+str.trim());

        System.out.println("SubString : "+str.substring(11));

        System.out.println("Double substring : "+str.substring(2,7));

        String name="Green";
        System.out.println(name);
        System.out.println("Replaced string : "+name.replace('e','x'));
        System.out.println("Another replaced string : "+name.replace("ree","xyz"));
        System.out.println(name.replace("r","xxxx"));
        System.out.println(name.replace("reen","f"));

        System.out.println(name.startsWith("grr"));
        System.out.println(name.startsWith("Gr"));
        System.out.println(name.endsWith("en"));
        System.out.println(name.endsWith("eeen"));

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(3));

        String name2="Harryrryrry";
        System.out.println("index of rry: "+name2.indexOf("rry"));
        System.out.println(name2.indexOf("rry",4));
        System.out.println(name2.indexOf("rry",6));
        System.out.println("index of ry : "+name2.indexOf("ry"));

        System.out.println(name2.lastIndexOf("rry"));
        System.out.println(name2.lastIndexOf("ry"));
        System.out.println(name2.lastIndexOf("ar"));
        System.out.println(name2.lastIndexOf("rry",4));
        System.out.println(name2.lastIndexOf("rry",7));

        String nm="greenuniversity";
        System.out.println("length: "+nm.length());
        System.out.println(nm.indexOf("een"));   //2
        System.out.println(nm.indexOf("uni"));   //5
        System.out.println(nm.indexOf("ty",4));   //13
        System.out.println(nm.indexOf("er",6));   //9

        System.out.println(nm.lastIndexOf("ty"));   //13
        System.out.println(nm.lastIndexOf("en"));   //3
        System.out.println(nm.lastIndexOf("er",12));  // 9
        System.out.println(nm.lastIndexOf("ve",6));   // -1


        System.out.println(nm.equals("greenuniversity"));    // true
        System.out.println(nm.equals("greenUniversity"));     //false
        System.out.println(nm.equalsIgnoreCase("GREENUNIVERSITy"));     //true
        System.out.println(nm.equalsIgnoreCase("greenuniversityofbd"));   //false
    }
}
