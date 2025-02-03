import javax.management.loading.MLet;

interface  Engine{
  void start();
  void stop();
    
}
interface   Media{
void start();
void paly();
    
}
class Car implements Engine ,Media {

    @Override
    public void paly() {
     System.out.println("I play ");
    }

    @Override
    public void start() {
       System.out.println("start the car");
    }
  

    @Override
    public void stop() {
        System.out.println("stop");
    }

}
class Bike implements Engine,Media{

        @Override
        public void paly() {
          System.out.println("bike music  start");
        }

        @Override
        public void start() {
       System.out.println("bike start");
        }

        @Override
        public void stop() {
          System.out.println("bike stop");
        }
        
        }

public class Main {
    public static void main(String[] args) {
        Car ob =new Car();
        ob.start();
    Media obj=new Car();
    obj.paly();
    Bike b1=new Bike();
    b1.start();
    }
}

 // if we create function of same name  in two diffrent function So we try to make each interface in seprate class that help us to use each fun indivualy 