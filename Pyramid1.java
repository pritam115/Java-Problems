package MidPractise;

public class Pyramid1 {
    public static void main(String[] args) {
       int n=5,row,col;
       int space=n-1;
       for(row=1;row<=n;row++){
        for(col=1;col<=space;col++){
            System.out.print(" ");
        }
        space--;
        for(col=1;col<=2*row-1;col++){
            System.out.print("*");
        }
        System.out.println();
           }
    }
    
}
