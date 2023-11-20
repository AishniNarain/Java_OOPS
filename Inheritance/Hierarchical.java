package Inheritance;


class Shape4{
        public void area(){
            System.out.println("Displays area");;
        }
    }
    
    class Triangle4 extends Shape4{
        public void area(int l, int h){
            System.out.println(1/2*l*h);
        }
    }
    class Circle extends Shape4{
        public void area(int r){
            System.out.println(3.14*r*r);
        }
    }


public class Hierarchical {
    public static void main(String args[]){
    
    }
}
