public class stringcompresion {
    public static void main(String[] args) {
        String str="aaaabbbccddee";
        String ans="";
        int c=1;
        ans=ans+str.charAt(0);
        for(int i=1;i<str.length();i++){

            if(str.charAt(i)==str.charAt(i-1)){
                    c++;
            }
            else{
              
                System.out.print(ans+(c));
                c=0;
                ans=""+str.charAt(i);
            }
        }
        System.out.print(ans+(c));
    }
}
