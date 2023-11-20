abstract class Animal{
    Animal(){
        System.out.println("Creating a new Animal");
    }
    abstract public void walk();
    public void eat(){
        System.out.println("Animal eats");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Created a Horse");
    }
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
}

class Chicken extends Animal{
    Chicken(){
        System.out.println("Created a Chicken");
    }
    public void walk(){
        System.out.println("Walk on 2 legs");
    }
}

public class Abstraction {
    public static void main(String args[]){
        Horse h1 = new Horse();
        h1.walk(); 
        

        Chicken c1 = new Chicken();
        c1.walk(); 

        
        
    }
}
