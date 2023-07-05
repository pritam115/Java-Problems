package Final.Thread;

 class Multi implements Runnable{
     public void run(){
         System.out.println("Running !!");
         System.out.println("I am happy !!");
         System.out.println();
     }
}
class Multi2 implements Runnable{
     public void run(){
         System.out.println("I am sad !!");
     }
}

class main{
    public static void main(String[] args) {
        Multi m1=new Multi();
        Thread t1=new Thread(m1);
        t1.start();

        Multi2 m2=new Multi2();
        Thread t2=new Thread(m2);
        t2.start();

    }
}
