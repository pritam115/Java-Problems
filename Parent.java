package Clp;

public abstract class Parent {
    abstract void Message();
}
class Subclass1 extends Parent{
    @Override
    void Message() {
        System.out.println("this is first subclass !");
    }
}
class Subclass2 extends Parent{
    void Message(){
        System.out.println("This is second subclass !!");
    }
}
class Test{
    public static void main(String[] args) {
        Subclass1 s1=new Subclass1();
        s1.Message();
        Subclass2 s2=new Subclass2();
        s2.Message();
;
    }
}