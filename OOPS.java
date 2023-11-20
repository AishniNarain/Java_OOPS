class Pen{
    String color;
    String type;

    public void feature(){
        System.out.println("Writing Feature");
    }

    public void PrintColor(){
        System.out.println(this.color);
    }
}


public class OOPS{
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.color = "black";
        p1.type = "gel";

        p1.feature();

        Pen p2 = new Pen();
        p2.color = "blue";
        p2.type = "ballpoint";

        p1.PrintColor();
        p2.PrintColor();

    }
}