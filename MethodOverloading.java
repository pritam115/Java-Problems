package MidPractise;

public class MethodOverloading {
    static int add(int a,int b){
        return a+b;
    }
    static double add(double a, double b){
        return a+b;

    }

    public static void main(String[] args) {
        MethodOverloading m1=new MethodOverloading();
        int res1=m1.add(5, 15);
        System.out.println("Result="+res1);

        MethodOverloading m2=new MethodOverloading();
        double res2=m2.add(10.50, 11.50);
        System.out.println("Result="+res2);

        
    }
    
}
