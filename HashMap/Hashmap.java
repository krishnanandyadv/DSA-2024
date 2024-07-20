import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("kunal",34);
        map.put("khushi",100);
        map.put("krishna",99);
        map.put("kunal",334);
        System.out.println(map.get("kunal"));
        System.out.println(map.getOrDefault("lalu", 50));

        System.out.println(map.getOrDefault("krishna",0)+1);

    }
    
}
