public class substring {

    
    public static void main(String[] args) {
        String str="nitin";
        for(int i=0;i<str.length();i++){
        for(int j=i+1;j<=str.length();j++){
     
            if(isPalidromeString(str.substring(i, j)))  {    
            System.out.println(str.substring(i, j));

        }}}



    }

public static boolean isPalidromeString(String s){
    int i=0;
    int j=s.length()-1;

    while(i<j){
        if(s.charAt(i)!=s.charAt(j)){
           return false;
        }
        i++;
        j--;
    }
    return true;
}



}
