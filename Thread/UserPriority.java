package Final.Thread;

public class UserPriority extends Thread{
    public void run(){
        System.out.println("Running ...");
    }
}
class main12{
    public static void main(String[] args) {
        UserPriority u1=new UserPriority();
        UserPriority u2=new UserPriority();
        u1.setPriority(4);
        u2.setPriority(7);
        System.out.println("Priority of running thread: "+u1.getPriority());
        System.out.println("Priority of running thread: "+u2.getPriority());
        u1.start();
        u2.start();

    }
}