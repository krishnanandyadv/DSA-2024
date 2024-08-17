// package OOPSBYKUNAL;

public class Student {
    int rn;
    String name;
    Student(String name,int rn){
        this.name=name;
        this.rn=rn;
    }

 
    public static void main(String[] args) {
        Student s1=new Student("krishna", 1);
        System.out.println(s1.rn);
        Student s2=new Student("kuna;", 12);
        System.out.println(s2.rn);
        System.out.println(s1.rn);
    }
        
    
}

