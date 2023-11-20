class Student2{
    String name;
    int age;

    public void PrintInfo(String name){
        System.out.println("Name: "+name);
    }

    public void PrintInfo(int age){
        System.out.println("Age: "+age);
    }

    public void PrintInfo(String name, int age){
        System.out.println("Name: "+name + " " +"Age: "+age);
    }
}


public class CompileTime_Polymorphism {
    public static void main(String args[]){

        Student2 s1 = new Student2();
        s1.name = "Aishni";
        s1.age = 22;

        s1.PrintInfo(s1.name);
        s1.PrintInfo(s1.age);
        s1.PrintInfo(s1.name,s1.age);
    }
}
