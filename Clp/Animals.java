package Clp;

public abstract class Animals {
    abstract void Cats();
    abstract void Dogs();
}
class Cats extends Animals{
    @Override
    void Cats() {
        System.out.println("cats meow....");
    }
    void Dogs(){
    }
}
class Dogs extends Animals{
    @Override
    void Cats() {
        System.out.println("cats meow....");
    }
    @Override
    void Dogs() {
        System.out.println("Dogs Bark.....");
    }
}
class main1{
    public static void main(String[] args) {
        Cats c1=new Cats();
        c1.Cats();
        Dogs d1=new Dogs();
        d1.Dogs();
    }
}