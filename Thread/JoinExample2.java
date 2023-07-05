package Final.Thread;

public class JoinExample2 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
class main14{
    public static void main(String[] args) {
        JoinExample2 e1=new JoinExample2();
        JoinExample2 e2=new JoinExample2();
        JoinExample2 e3=new JoinExample2();

        e1.start();
        try{
            e1.join(1500);
        } catch(Exception e){
            System.out.println(e);
        }
        e2.start();
        e3.start();

    }
}