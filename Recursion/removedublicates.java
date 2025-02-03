import java.util.*;
public class removedublicates {
    public static void main(String[] args) {
        String s="apanacollge";
        StringBuilder ns=new StringBuilder("");
       
  boolean[] arr=new boolean[26];
       removedub(s,0,ns,arr);
    }

   public static void removedub(String s,int i,StringBuilder nS,boolean[] arr){
    if(i==s.length()){
        System.out.println(nS);
        return;
    }
    char curCHar=s.charAt(i);
   if(arr[curCHar-'a']==true){
        removedub(s, i+1, nS, arr);
    }
    else{
        arr[curCHar-'a']=true;
        removedub(s, i+1, nS.append( curCHar), arr);
    }

   }
}
