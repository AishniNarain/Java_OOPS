package Instance_Initializer_Block;

public class Bike2 {
    int speed;

    Bike2(){
        System.out.println("Speed is :"+speed);
    }

    {speed=100;}

    public static void main(String args[]){
        new Bike2();
    }
}
