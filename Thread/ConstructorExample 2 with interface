public class MyThr1 implements Runnable{
    public void run() {
        System.out.println("Thread1");
    }
}
class MyThr2 extends Thread{
    MyThr2(Runnable r1, String name)
    {
        super(name);
    }
}

class Runnable_Constructor {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1();
        Thread r1 = new Thread(t1);
        r1.start();

        MyThr2 t2 = new MyThr2(r1,"Java");
        t2.start();

        System.out.println("The id of thread is "+t2.getId());
        System.out.println("The name of thread is "+t2.getName());
    }
}

