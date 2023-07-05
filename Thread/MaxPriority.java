package Final.Thread;

public class MaxPriority extends Thread{
    public void run(){
        System.out.println("Priority of the thread is:"+Thread.currentThread().getPriority());
    }
}
class main10{
    public static void main(String[] args) {
       MaxPriority m1=new MaxPriority();
        m1.setPriority(Thread.MAX_PRIORITY);
        m1.start();
    }
}
