package Clp;

public abstract class Bank {
    abstract void GetBalance();
}
class BankA extends Bank{
    @Override
    void GetBalance() {
        System.out.println("Deposited balance $100");
    }
}
class BankB extends Bank{
    @Override
    void GetBalance() {
        System.out.println("Deposited balance $150");
    }
}
class BankC extends Bank{
    @Override
    void GetBalance() {
        System.out.println("Deposited balance $200");
    }
}
class main3{
    public static void main(String[] args) {
        BankA b1=new BankA();
        b1.GetBalance();
        BankB b2=new BankB();
        b2.GetBalance();
        BankC b3=new BankC();
        b3.GetBalance();
    }
}