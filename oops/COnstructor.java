public class COnstructor {
    String name; 
    int age;
    // constructor has no return type and use to inatialize the data member of class  
    //construtor is not be private
    
    public COnstructor(){
              this.name="moti";
              this.age=90;
    }
    
    public COnstructor(String na,int age){
              this.name="moti";
              this.age=23;
    }

public void fun(){
    int adhar=19672;
    int age=20;
    System.out.println(this.name+" " +age+" " +adhar );
}

}
