package Inheritance;

class Shape3{
        public void area(){
            System.out.println("Displays area");;
        }
    }
    
    class Triangle3 extends Shape3{
        public void area(int l, int h){
            System.out.println(1/2*l*h);
        }
    }
    
    class Equilateral_Triangle extends Triangle3{
        public void area(int l, int h){
            System.out.println(1/2*l*h);
        }
    }

public class Multi_level {
    
    public class Single_level {
        public static void main(String args[]){
    
        }
    }
}
