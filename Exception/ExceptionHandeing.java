package Exception;

public class ExceptionHandeing {
    public static void main(String[] args) {
        try{
            int x=10;
            int y=0;
            int result=x/y;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("Exception: "+e);
        }

        System.out.println("This is the last line of the program!");
    }
}
