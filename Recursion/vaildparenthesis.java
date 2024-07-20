public class vaildparenthesis {
   public static void main(String[] args) {
  paranthisis(3, 0, 0, "");
 
   }

public static void paranthisis(int n, int opening, int closing,String ans) {
    if(opening==n && closing==n){
        System.out.println(ans);
        return;
    }
    if(opening<n){
   paranthisis(n, opening+1, closing,ans+"(");
    }
    if(closing<opening){
   paranthisis(n, opening, closing+1,ans+")");
    }
} 
}
