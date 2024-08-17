import java.util.ArrayList;

public class Student {
    String name;
    int age;
    String lst;
    
    public Student(){

    }
    
    public Student(String name, int age){
        this.age=age;
        this.name=name;
        this.lst="list";

    }
    
    @Override
    public String toString(){
        return lst;
    }

    public static void main(String[] args) {
       ArrayList<Integer> list=new ArrayList<>();
        Student s=new Student("krishna",23);
        // ye hame ekk hash value dega kyuki ek object class hota h usme toString method chlataa h wo ye Student@5a07e868 print krega but haam use overide kr lege
        // System.out.print(s);
         System.out.print(list);
       
   
        }
    
}
