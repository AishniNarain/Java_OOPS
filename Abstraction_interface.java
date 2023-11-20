interface Animal2{
    void walk();
}

interface Herbivore{

}

class Horse2 implements Animal2{
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
}

class Horse3 implements Animal2,Herbivore{                // Multiple Inheritance using interfaces
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
}

public class Abstraction_interface {
    public static void main(String args[]){
        Horse2 h1 = new Horse2();
        h1.walk();
    }
}
