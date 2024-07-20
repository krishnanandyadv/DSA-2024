public class COnstructor {
    String name; 
    int age;
    // constructor has no return type and use to inatialize the data member of class  
    //construtor is not be private
    
    public COnstructor(){
              this.name="moti";
              this.age=23;
    }
    
    public COnstructor(String name,int age){
              this.name="moti";
              this.age=23;
    }

public void fun(){
    int adhar=19672;
    System.out.println(this.name+" " +this.age+" " +adhar );
}

}
