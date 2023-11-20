package Inheritance;

class Shape2{
    public void area(){
        System.out.println("Displays area");;
    }
}

class Triangle2 extends Shape2{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

public class Single_level {
    public static void main(String args[]){

    }
}
