public class ascidiff {
    public static void main(String[] args) {
        String str="acbee";  //op=a2c-1b
        String ans="";
        
        for(int i=1;i<str.length();i++){

            ans=ans+str.charAt(i-1);
            char c=str.charAt(i);
            char p=str.charAt(i-1);
            
              ans=ans+(c-p);

        }
        System.out.println(ans);
    }
}
