package Final.Thread;

public class SleepMethod extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
class main6{
    public static void main(String[] args) {
        SleepMethod s1= new SleepMethod();
        s1.start();
        SleepMethod s2= new SleepMethod();
        s2.start();
    }
}