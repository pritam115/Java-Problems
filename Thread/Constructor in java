public class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        System.out.println("Thank you !!");
    }
}
class Main{
    public static void main(String[] args) {
        MyThr m1=new MyThr("Pritam");
        MyThr m2=new MyThr("GUB");

        System.out.println("The name of the running thread is "+m1.getName());
        System.out.println("The id of the running thread is "+m1.getId());
        System.out.println("The name of the running thread is "+m2.getName());
        System.out.println("The id of the running thread is "+m2.getId());

        m1.start();
        m2.start();
    }
}
