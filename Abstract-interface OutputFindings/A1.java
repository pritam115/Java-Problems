package ClpOutputFindings;
interface A1
{
    void myMethod();
}
class B1
{
    public void myMethod()
    {
        System.out.println("My Method");
    }
}
class C1 extends B1 implements A1
{
}
class MainClass
{
    public static void main(String[] args)
    {
        A1 a = new C1();
        a.myMethod();
    }
}
