package MidPractise;

public class Static1 {
    String name;
    int id;
    static String Uniname="GUB";

    Static1(String n, int i){
        this.name=n;
        this.id=i;
    }
    void displayInfo(){
        System.out.println("Name="+name);
        System.out.println("ID="+id);
        System.out.println("University name="+Uniname);
        System.out.println();
    }
    public static void main(String[] args) {
        Static1 s1=new Static1("Pritam saha",115);
        s1.displayInfo();
        Static1 s2=new Static1("Papri Majumder",530);
        s2.displayInfo();

    }
}
