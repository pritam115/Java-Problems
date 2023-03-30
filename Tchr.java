package MidPractise;

public class Tchr {

    String name, gender;
    int age, phn;

    void setInfo(String n, String g, int a, int ph) {
        this.name = n;
        this.gender = g;
        this.age = a;
        this.phn = ph;

    }

    void displayInfo() {
        System.out.println("Name=" + name);
        System.out.println("Gender=" + gender);
        System.out.println("Age=" + age);
        System.out.println("Phone Number=" + phn);
        System.out.println();

    }

    public static void main(String[] args) {
        Tchr tc1 = new Tchr();
        tc1.setInfo("Pritam saha", "Male", 22, 147895661);
        tc1.displayInfo();

        Tchr tc2 = new Tchr();
        tc2.setInfo("Anis Islam", "male", 56, 45678110);
        tc2.displayInfo();

    }

}
