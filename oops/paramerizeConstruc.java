public class paramerizeConstruc {
   private int age=12;
   String name="kejn";
   private  String college="GLA UNIVERSITY";
    public paramerizeConstruc(String name,int age){
       this.name=name;
       this.age=age;
       

    }
public void setAge(int age) {
    try{
    if(age<0){
     throw   new Exception("bhaak bsdk age negative nhi hota");
    }}
    catch(Exception e){
        System.out.println(e);
        e.printStackTrace();
    }
    this.age=age;
}
    
public void setName(String clg) throws Exception{
        throw new Exception("not permission to change");
      
    }

    public String getName(){
        return this.college;
    }
}
