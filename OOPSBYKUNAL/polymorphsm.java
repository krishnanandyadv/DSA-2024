
class Base {
    void area() {
        System.out.println("area");
    }
    int x = 3; // x declared and initialized in Base
    void vol(){
System.out.println("capacity");
    }
}

class Square extends Base {
   
   int x=34;
   
    void area() {
        System.out.println("side*side");
    }
        
    void displayValues() {
        System.out.println("x in Square class: " + x); // Refers to x in Square
        System.out.println("x in Base class: " + super.x); // Refers to x in Base using super
    }
}
public class polymorphsm {
    public static void main(String[] args) {
        Base ob=new Square();
        ob.area();
        System.out.println(ob.x);
        Square ob1 = new Square();
        ob1.vol();

    }
}
