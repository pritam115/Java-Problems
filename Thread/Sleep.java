package Final.Thread;

public class Sleep implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
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
class main8{
    public static void main(String[] args) {
        Sleep s1=new Sleep();
        Thread t1=new Thread(s1);
        Sleep s2=new Sleep();
        Thread t2=new Thread(s2);

        t1.start();
        t2.start();
    }
}