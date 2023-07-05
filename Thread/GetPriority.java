package Final.Thread;

public class GetPriority extends Thread{
    public void run(){
        System.out.println("Running Thread name: "+Thread.currentThread().getName());
    }
}
 class main7{
     public static void main(String[] args) {
         GetPriority p1= new GetPriority();
         GetPriority p2= new GetPriority();

         System.out.println("p1 thread priority : "+p1.getPriority());
         System.out.println("22 Thread priority: "+p2.getPriority());

         p1.start();
         p2.start();
     }
 }