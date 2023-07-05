package Final.Thread;

public class MinPriority extends Thread{
    public void run(){
        System.out.println("Priority of Running Thread: "+Thread.currentThread().getPriority());
    }
}
class main11{
    public static void main(String[] args) {
        MinPriority m1=new MinPriority();
        m1.setPriority(Thread.MIN_PRIORITY);
        m1.start();
    }
}