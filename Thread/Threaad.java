package Final.Thread;

 class Threaad extends Thread{
    public void run(){
        System.out.println("Thread for cooking !!");
        System.out.println("Cooking Starts !");
        System.out.println();
    }
}

 class MyThread extends Thread{
    public void run(){
        System.out.println("Thread for chatting !!");
        System.out.println("Chatting is on !");
    }
}
class main1{
    public static void main(String[] args) {
        Threaad t1=new Threaad();
        t1.start();

        MyThread t2=new MyThread();
        t2.start();


    }
}