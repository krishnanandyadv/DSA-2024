 

  abstract class Parent{
 abstract void career();
 abstract void Partner();
 void normal(){
  System.out.println("normal method");
 }
 }
 class child extends Parent{


    @Override
    void career() {
     System.out.println("i am coder");
    }

    @Override
    void Partner() {
  System.out.println("i love coding");
    }
    
 }
 
public class Main {
    public static void main(String[] args) {
        child ob=new child();
        ob.career();
        Parent obj =new child();
        obj.normal();
    }
}
