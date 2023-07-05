package Final.Thread;

public class SuspendMethod extends Thread{
    public void run(){
        System.out.println("Running !!");
    }
}
class main16{
    public static void main(String[] args) {
        SuspendMethod s1= new SuspendMethod();
        SuspendMethod s2= new SuspendMethod();
        SuspendMethod s3= new SuspendMethod();

        s1.start();
        s2.start();
        s2.suspend(); // because of this suspend method s2 will stopped and s3 will start 
        s3.start();
    }
}