import java.util.HashMap;

public class frecuncyofelement {
    public static void main(String[] args) {
        int[] arr={1,23,4,5,6,6,3,5,5,5,5,3,4,4,56,6,6,6,65,555,5,5,2};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        System.out.println(map);
    }
}
