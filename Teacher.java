package MidPractise;

public class Teacher {
    String name,gender;
    int age;

void displayInfo(){
    System.out.println("Name= "+name);
    System.out.println("Gendedr="+gender);
    System.out.println("Age="+age);
    System.out.println();
}

public static void main(String[] args) {
    Teacher teacher1=new Teacher();
    teacher1.name="Pritam saha";
    teacher1.gender="male";
    teacher1.age=25;
    teacher1.displayInfo();


    Teacher teacher2=new Teacher();
    teacher2.name="Anis";
    teacher2.gender="male";
    teacher2.age=52;
    teacher2.displayInfo();
}   
}
