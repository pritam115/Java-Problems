package Clp;

public interface TVremote {
    void method();
}
interface SmartTvRemote extends TVremote{
    void method();
}
class TV implements TVremote,SmartTvRemote{
    public void method(){
        System.out.println("here is the new tv!!!!");
    }
}
class main{
    public static void main(String[] args) {
        TV t=new TV();
        t.method();
    }
}