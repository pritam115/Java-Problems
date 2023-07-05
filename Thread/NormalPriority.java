package Final.Thread;

public class NormalPriority extends Thread{
    public void run(){
        System.out.println("Priority of the thread is:"+Thread.currentThread().getPriority());
    }
}
class main9{
    public static void main(String[] args) {
        NormalPriority n1=new NormalPriority();
        n1.setPriority(Thread.NORM_PRIORITY);
        n1.start();
    }
}