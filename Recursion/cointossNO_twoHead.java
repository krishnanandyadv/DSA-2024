public class cointossNO_twoHead {
    public static void main(String[] args) {
        NOTwoH( 6,"");
    }

    private static void NOTwoH(int i, String ans) {
      if(i==0){
        System.out.println(ans);
        return;
      }
      if(ans.length()>0 && ans.charAt(ans.length()-1)=='H'){
           NOTwoH(i-1, ans+"T");
      }  
      else{
      NOTwoH(i-1, ans+"H");
      NOTwoH(i-1, ans+"T");
      }

  
    // if(ans.length()>0 || ans.charAt(ans.length()-1)!='H'){
    //      NOTwoH(i-1, ans+"H");
    // }
    // NOTwoH(i-1, ans+"T");
    }
}
