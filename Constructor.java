class Student{
    String name;
    int age;

    public void PrintInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    /*Student(){   //Non-Parameterised Constructor
        System.out.println("Constructor Called");
    }*/

    /*Student(String name,int age){      //Parameterised Constructor
        this.name = name;
        this.age = age;
    }*/

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

    Student(){

    }
}


public class Constructor {
    public static void main(String args[]){

        /*Student s1 = new Student();   // Default Constructor

        s1.name = "Aishni";
        s1.age = 22;*/
        
        /*Student s1 = new Student("Aishni",22);    //Parameterised Constructor
        s1.PrintInfo();*/

        Student s1 = new Student();   //Used by copy constructor
        s1.name = "Aishni";
        s1.age = 22;

        Student s2 = new Student(s1);      // Copy Constructor
        s2.PrintInfo();

    }
}
