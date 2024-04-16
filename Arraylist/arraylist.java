import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> lst=new ArrayList<>();
         
        lst.add(10);
        lst.add(20);
       
        //add at index range 0 to size
        lst.add(0,30);
        lst.add(3,40);
        System.out.println(lst);
        System.out.println(lst.size());
        //delete element
        //range 0 to size -1
        System.out.println(lst.remove(0));
        System.out.println(lst);

        lst.add(48);
        lst.add(58);
        lst.add(443);
        System.out.println(lst.get(0));
        System.out.println(lst);

        //set --> update index assign new value at old value
        lst.set(0, 100);
        System.out.println(lst);
//for each loop enhanced loop

for(int val:lst){
    System.out.println(val);


}
int [] arr ={34,45,34,54,45,434,543432,334,3};
for(int val:arr){
    System.out.print(val+" ");
}

    }
}
