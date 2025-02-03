
import java.util.ArrayList;
import java.util.HashMap;

public class Findduplicates {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,1,1,1,2,2,3,33};
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        System.out.println(map);
        for(int i:map.keySet()){
            if(map.get(i)>1){
                list.add(i);
            }
        }

System.out.println(list);

    }
}
