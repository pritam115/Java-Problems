package Clp;

public abstract class Abs {
    abstract void a_method();
    void b_method(){
        System.out.println("This is a normal method of abstract class");
    }
    Abs(){
        System.out.println("This is constructor of abstract class");
    }
}
class Subclass extends Abs{
    void a_method(){
        System.out.println("This is abstract method");
    }

    @Override
    void b_method() {
        super.b_method();
    }
}
class main2{
    public static void main(String[] args) {
        Subclass s=new Subclass();
        s.a_method();
        s.b_method();
    }
}