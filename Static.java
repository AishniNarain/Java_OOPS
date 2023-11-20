class Student{
    String name;
    static String school;
}

public class Static {
    public static void main(String args[]){
        Student.school = "ABC";
        Student s1 = new Student();
        s1.name = "Aishni";
        
    }
}
