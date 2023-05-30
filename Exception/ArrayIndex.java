package Exception;

public class ArrayIndex {
    public static void main(String[] args) {

        try{
            int [] a=new int [5];
            a[5]=10;
            System.out.println(a[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
     finally {
            System.out.println("GOOD NIGHT!!");
        }

    }
}
